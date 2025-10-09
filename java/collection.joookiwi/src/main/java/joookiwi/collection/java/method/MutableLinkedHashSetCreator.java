package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableLinkedHashSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Double.isNaN;
import static java.lang.Float.isNaN;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_SMALL_LOAD_FACTOR;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.NumericConstants.MAX_FLOAT_VALUE;
import static joookiwi.collection.java.NumericConstants.MAX_FLOAT_VALUE_AS_DOUBLE;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE_AS_LONG;

@NotNullByDefault
public final class MutableLinkedHashSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableLinkedHashSetCreator() { throw new ImpossibleConstructionException("The utility class “MutableLinkedHashSetCreator” cannot be constructed.", MutableLinkedHashSetCreator.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet() { return new MutableLinkedHashSet<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values) { return __newInstance(values); }

    //#endregion -------------------- values --------------------
    //#region -------------------- initialCapacity --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final byte initialCapacity) { return new MutableLinkedHashSet<>(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final short initialCapacity) { return new MutableLinkedHashSet<>(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final int initialCapacity) { return new MutableLinkedHashSet<>(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final long initialCapacity) { return __newInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Byte initialCapacity) { return new MutableLinkedHashSet<>(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Short initialCapacity) { return new MutableLinkedHashSet<>(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Integer initialCapacity) { return new MutableLinkedHashSet<>(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return new MutableLinkedHashSet<>();
        return __newInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return new MutableLinkedHashSet<>();
        return new MutableLinkedHashSet<>(initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return new MutableLinkedHashSet<>();
        return __newInstance(initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return new MutableLinkedHashSet<>();
        return __newInstance(initialCapacity.sum());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAccumulator initialCapacity) {
        if (initialCapacity == null)
            return new MutableLinkedHashSet<>();
        return __newInstance(initialCapacity.get());
    }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, loadFactor --------------------

    //#region -------------------- initialCapacity byte, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final byte initialCapacity,
                                                                                            final float loadFactor) { return new MutableLinkedHashSet<>(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final byte initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final byte initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return new MutableLinkedHashSet<>(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final byte initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final byte initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final byte initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity byte, loadFactor --------------------
    //#region -------------------- initialCapacity short, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final short initialCapacity,
                                                                                            final float loadFactor) { return new MutableLinkedHashSet<>(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final short initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final short initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return new MutableLinkedHashSet<>(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final short initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final short initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final short initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity short, loadFactor --------------------
    //#region -------------------- initialCapacity int, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final int initialCapacity,
                                                                                            final float loadFactor) { return new MutableLinkedHashSet<>(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final int initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final int initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return new MutableLinkedHashSet<>(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final int initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final int initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final int initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity int, loadFactor --------------------
    //#region -------------------- initialCapacity long, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final long initialCapacity,
                                                                                            final float loadFactor) { return __newInstance(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final long initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final long initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final long initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final long initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final long initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity long, loadFactor --------------------
    //#region -------------------- initialCapacity byte?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Byte initialCapacity,
                                                                                            final float loadFactor) { return new MutableLinkedHashSet<>(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Byte initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Byte initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return new MutableLinkedHashSet<>(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Byte initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Byte initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Byte initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor.get());
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity byte?, loadFactor --------------------
    //#region -------------------- initialCapacity short?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Short initialCapacity,
                                                                                            final float loadFactor) { return new MutableLinkedHashSet<>(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Short initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Short initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return new MutableLinkedHashSet<>(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Short initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Short initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Short initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor.get());
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity short?, loadFactor --------------------
    //#region -------------------- initialCapacity int?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Integer initialCapacity,
                                                                                            final float loadFactor) { return new MutableLinkedHashSet<>(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Integer initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Integer initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return new MutableLinkedHashSet<>(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Integer initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Integer initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Integer initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor.get());
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity int?, loadFactor --------------------
    //#region -------------------- initialCapacity long?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Long initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Long initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Long initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Long initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Long initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Long initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.get());
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity long?, loadFactor --------------------
    //#region -------------------- initialCapacity AtomicInteger?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicInteger initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return new MutableLinkedHashSet<>(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicInteger initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        return new MutableLinkedHashSet<>(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.get());
        if (loadFactor == null)
            return new MutableLinkedHashSet<>(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor.get());
    }

    //#endregion -------------------- initialCapacity AtomicInteger?, loadFactor --------------------
    //#region -------------------- initialCapacity AtomicLong?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicLong initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicLong initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.get());
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor.get());
    }

    //#endregion -------------------- initialCapacity AtomicLong?, loadFactor --------------------
    //#region -------------------- initialCapacity LongAdder?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAdder initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAdder initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.sum());
        return __newInstance(initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.sum());
        return __newInstance(initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(initialCapacity.sum());
        return __newInstance(initialCapacity.sum(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.get());
        if (loadFactor == null)
            return __newInstance(initialCapacity.sum());
        return __newInstance(initialCapacity.sum(), loadFactor.get());
    }

    //#endregion -------------------- initialCapacity LongAdder?, loadFactor --------------------
    //#region -------------------- initialCapacity LongAccumulator?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAccumulator initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAccumulator initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return new MutableLinkedHashSet<>();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.get());
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor.get());
    }

    //#endregion -------------------- initialCapacity LongAccumulator?, loadFactor --------------------

    //#endregion -------------------- initial capacity, load factor --------------------
    //#region -------------------- values, initialCapacity --------------------

    //#region -------------------- values, initialCapacity byte --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final byte initialCapacity) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                            final byte initialCapacity) { return __newInstance(values, initialCapacity); }

    //#endregion -------------------- values, initialCapacity byte --------------------
    //#region -------------------- values, initialCapacity short --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final short initialCapacity) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final short initialCapacity) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final short initialCapacity) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                            final short initialCapacity) { return __newInstance(values, initialCapacity); }

    //#endregion -------------------- values, initialCapacity short --------------------
    //#region -------------------- values, initialCapacity int --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final int initialCapacity) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final int initialCapacity) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final int initialCapacity) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                            final int initialCapacity) { return __newInstance(values, initialCapacity); }

    //#endregion -------------------- values, initialCapacity int --------------------
    //#region -------------------- values, initialCapacity long --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final long initialCapacity) {
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final long initialCapacity) {
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final long initialCapacity) {
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                            final long initialCapacity) { return __newInstance(values, initialCapacity); }

    //#endregion -------------------- values, initialCapacity long --------------------
    //#region -------------------- values, initialCapacity byte? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Byte initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    //#endregion -------------------- values, initialCapacity byte? --------------------
    //#region -------------------- values, initialCapacity short? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Short initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                            final @Nullable Short initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    //#endregion -------------------- values, initialCapacity short? --------------------
    //#region -------------------- values, initialCapacity int? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Integer initialCapacity) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    //#endregion -------------------- values, initialCapacity int? --------------------
    //#region -------------------- values, initialCapacity long? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                            final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    //#endregion -------------------- values, initialCapacity long? --------------------
    //#region -------------------- values, initialCapacity AtomicInteger? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    //#endregion -------------------- values, initialCapacity AtomicInteger? --------------------
    //#region -------------------- values, initialCapacity AtomicLong? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    //#endregion -------------------- values, initialCapacity AtomicLong? --------------------
    //#region -------------------- values, initialCapacity LongAdder? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return __newInstance(values, initialCapacity.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return __newInstance(values, initialCapacity.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return __newInstance(values, initialCapacity.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.sum());
    }

    //#endregion -------------------- values, initialCapacity LongAdder? --------------------
    //#region -------------------- values, initialCapacity LongAccumulator? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAccumulator initialCapacity) {
        if (initialCapacity == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    //#endregion -------------------- values, initialCapacity LongAccumulator? --------------------

    //#endregion -------------------- values, initialCapacity --------------------
    //#region -------------------- values, initialCapacity, loadFactor --------------------

    //#region -------------------- values, initialCapacity byte, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final byte initialCapacity,
                                                                                            final float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity byte, loadFactor float --------------------
    //#region -------------------- values, initialCapacity byte, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final byte initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity byte, loadFactor double --------------------
    //#region -------------------- values, initialCapacity byte, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity byte, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity byte, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity byte, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity byte, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity byte, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity byte, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final byte initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity byte, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity short, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final short initialCapacity,
                                                                                            final float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity short, loadFactor float --------------------
    //#region -------------------- values, initialCapacity short, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final short initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity short, loadFactor double --------------------
    //#region -------------------- values, initialCapacity short, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity short, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity short, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity short, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity short, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity short, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity short, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final short initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity short, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity int, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final int initialCapacity,
                                                                                            final float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity int, loadFactor float --------------------
    //#region -------------------- values, initialCapacity int, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final int initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity int, loadFactor double --------------------
    //#region -------------------- values, initialCapacity int, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable Float loadFactor) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity int, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity int, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity int, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity int, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity int, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity int, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final int initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity int, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity long, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final long initialCapacity,
                                                                                            final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity long, loadFactor float --------------------
    //#region -------------------- values, initialCapacity long, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T>values,
                                                                                            final long initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final long initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity long, loadFactor double --------------------
    //#region -------------------- values, initialCapacity long, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity long, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity long, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity long, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity long, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity long, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity long, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final long initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity long, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity byte?, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity byte?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity byte?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity byte?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity byte?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity byte?, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity byte?, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity byte?, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity byte?, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity byte?, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity byte?, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Byte initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity byte?, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity short?, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity short?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity short?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity short?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity short?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity short?, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity short?, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity short?, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity short?, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity short?, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity short?, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Short initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity short?, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity int?, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity int?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity int?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity int?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity int?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity int?, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity int?, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity int?, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity int?, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity int?, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity int?, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Integer initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity int?, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity long?, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity long?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity long?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity long?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity long?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity long?, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity long?, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity long?, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity long?, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity long?, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity long?, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable Long initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity long?, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity AtomicInteger?, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity AtomicInteger?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity AtomicInteger?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity AtomicInteger?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity AtomicInteger?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity AtomicInteger?, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity AtomicInteger?, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity AtomicInteger?, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity AtomicInteger?, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity AtomicInteger?, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity AtomicInteger?, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable AtomicInteger initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity AtomicInteger?, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity AtomicLong?, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity AtomicLong?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity AtomicLong?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity AtomicLong?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity AtomicLong?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity AtomicLong?, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity AtomicLong?, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity AtomicLong?, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity AtomicLong?, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity AtomicLong?, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity AtomicLong?, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable AtomicLong initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity AtomicLong?, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity LongAdder?, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity LongAdder?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity LongAdder?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity LongAdder?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity LongAdder?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity LongAdder?, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity LongAdder?, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity LongAdder?, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity LongAdder?, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity LongAdder?, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity LongAdder?, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable LongAdder initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.sum());
        return __newInstance(values, initialCapacity.sum(), loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity LongAdder?, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity LongAccumulator?, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity LongAccumulator?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity LongAccumulator?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity LongAccumulator?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity LongAccumulator?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity LongAccumulator?, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity LongAccumulator?, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity LongAccumulator?, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity LongAccumulator?, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity LongAccumulator?, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity LongAccumulator?, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> MutableLinkedHashSet(final @Nullable Collection<? extends T> values,
                                                                                            final @Nullable LongAccumulator initialCapacity,
                                                                                            final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.get());
        return __newInstance(values, initialCapacity.get(), loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity LongAccumulator?, loadFactor DoubleAccumulator? --------------------

    //#endregion -------------------- values, initialCapacity, loadFactor --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- initialCapacity --------------------

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final long initialCapacity) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            return new MutableLinkedHashSet<>(MAX_INT_VALUE);
        return new MutableLinkedHashSet<>((int) initialCapacity);
    }


    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, loadFactor --------------------

    //#region -------------------- initialCapacity, loadFactor double --------------------

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final byte initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            return new MutableLinkedHashSet<>(initialCapacity);
        if (loadFactor <= 0.0D)
            return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
        return new MutableLinkedHashSet<>(initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final short initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            return new MutableLinkedHashSet<>(initialCapacity);
        if (loadFactor <= 0.0D)
            return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
        return new MutableLinkedHashSet<>(initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final int initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            return new MutableLinkedHashSet<>(initialCapacity);
        if (loadFactor <= 0.0D)
            return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
        return new MutableLinkedHashSet<>(initialCapacity, (float) loadFactor);
    }

    //#endregion -------------------- initialCapacity, loadFactor double --------------------
    //#region -------------------- initialCapacity long, loadFactor --------------------

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final long initialCapacity,
                                                                                      final float loadFactor) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            new MutableLinkedHashSet<>(MAX_INT_VALUE, loadFactor);
        return new MutableLinkedHashSet<>((int) initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final long initialCapacity,
                                                                                      final double loadFactor) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (isNaN(loadFactor))
                return new MutableLinkedHashSet<>(MAX_INT_VALUE);
            else if (loadFactor <= 0.0D)
                return new MutableLinkedHashSet<>(MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return new MutableLinkedHashSet<>(MAX_INT_VALUE, MAX_FLOAT_VALUE);
            else
                return new MutableLinkedHashSet<>(MAX_INT_VALUE, (float) loadFactor);
        if (isNaN(loadFactor))
            return new MutableLinkedHashSet<>((int) initialCapacity);
        if (loadFactor <= 0.0D)
            return new MutableLinkedHashSet<>((int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return new MutableLinkedHashSet<>((int) initialCapacity, MAX_FLOAT_VALUE);
        return new MutableLinkedHashSet<>((int) initialCapacity, (float) loadFactor);
    }

    //#endregion -------------------- initialCapacity long, loadFactor --------------------

    //#endregion -------------------- initialCapacity, loadFactor --------------------
    //#region -------------------- loadFactor --------------------

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstanceWithNoInitialCapacity(final float loadFactor) {
        return new MutableLinkedHashSet<>(DEFAULT_INITIAL_CAPACITY, loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstanceWithNoInitialCapacity(final double loadFactor) {
        if (isNaN(loadFactor))
            return new MutableLinkedHashSet<>();
        if (loadFactor <= 0.0D)
            return new MutableLinkedHashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return new MutableLinkedHashSet<>(DEFAULT_INITIAL_CAPACITY, MAX_FLOAT_VALUE);
        return new MutableLinkedHashSet<>(DEFAULT_INITIAL_CAPACITY, (float) loadFactor);
    }

    //#endregion -------------------- loadFactor --------------------
    //#region -------------------- values --------------------

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new MutableLinkedHashSet<>();
        if (values.isEmpty())
            return new MutableLinkedHashSet<>();
        return new MutableLinkedHashSet<>(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, initialCapacity --------------------

    //#region -------------------- values, initialCapacity long --------------------

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                      final long initialCapacity) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity);
    }


    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                                      final long initialCapacity) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity);
    }


    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                                      final long initialCapacity) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity);
    }

    //#endregion -------------------- values, initialCapacity long --------------------
    //#region -------------------- values Collection<T>, initialCapacity --------------------

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                      final byte initialCapacity) {
        if (values == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>(initialCapacity);
        return new MutableLinkedHashSet<>(values, initialCapacity);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                      final short initialCapacity) {
        if (values == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>(initialCapacity);
        return new MutableLinkedHashSet<>(values, initialCapacity);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                      final int initialCapacity) {
        if (values == null)
            return new MutableLinkedHashSet<>(initialCapacity);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>(initialCapacity);
        return new MutableLinkedHashSet<>(values, initialCapacity);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                      final long initialCapacity) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (values == null)
                return new MutableLinkedHashSet<>(MAX_INT_VALUE);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(MAX_INT_VALUE);
            else
                return new MutableLinkedHashSet<>(values, MAX_INT_VALUE);
        if (values == null)
            return new MutableLinkedHashSet<>((int) initialCapacity);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>((int) initialCapacity);
        return new MutableLinkedHashSet<>(values, (int) initialCapacity);
    }

    //#endregion -------------------- values Collection<T>, initialCapacity --------------------

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- values, initialCapacity, loadFactor --------------------

    //#region -------------------- values, initialCapacity, loadFactor double --------------------

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                      final byte initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                                      final byte initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                                      final byte initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, (float) loadFactor);
    }


    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                      final short initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                                      final short initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                                      final short initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, (float) loadFactor);
    }


    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                      final int initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                                      final int initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                                      final int initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, initialCapacity, (float) loadFactor);
    }

    //#endregion -------------------- values, initialCapacity, loadFactor double --------------------
    //#region -------------------- values, initialCapacity long, loadFactor --------------------

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                      final long initialCapacity,
                                                                                      final float loadFactor) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                                      final long initialCapacity,
                                                                                      final float loadFactor) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                                      final long initialCapacity,
                                                                                      final float loadFactor) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE, loadFactor);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity, loadFactor);
    }


    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                      final long initialCapacity,
                                                                                      final double loadFactor) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (isNaN(loadFactor))
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE);
            else if (loadFactor <= 0.0D)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE, MAX_FLOAT_VALUE);
            else
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE, (float) loadFactor);
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                                      final long initialCapacity,
                                                                                      final double loadFactor) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (isNaN(loadFactor))
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE);
            else if (loadFactor <= 0.0D)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE, MAX_FLOAT_VALUE);
            else
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE, (float) loadFactor);
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                                      final long initialCapacity,
                                                                                      final double loadFactor) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (isNaN(loadFactor))
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE);
            else if (loadFactor <= 0.0D)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE, MAX_FLOAT_VALUE);
            else
                return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, MAX_INT_VALUE, (float) loadFactor);
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, (int) initialCapacity, (float) loadFactor);
    }

    //#endregion -------------------- values, initialCapacity long, loadFactor --------------------
    //#region -------------------- values Collection<T>, initialCapacity, loadFactor double --------------------

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                                      final byte initialCapacity,
                                                                                      final float loadFactor) {
        if (isNaN(loadFactor))
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity);
        if (loadFactor <= 0.0F)
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE)
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity, MAX_FLOAT_VALUE);
        if (values == null)
            return new MutableLinkedHashSet<>(initialCapacity, loadFactor);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>(initialCapacity, loadFactor);
        return new MutableLinkedHashSet<>(values, initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                                      final byte initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity);
        if (loadFactor <= 0.0D)
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity, MAX_FLOAT_VALUE);
        if (values == null)
            return new MutableLinkedHashSet<>(initialCapacity, (float) loadFactor);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>(initialCapacity, (float) loadFactor);
        return new MutableLinkedHashSet<>(values, initialCapacity, (float) loadFactor);
    }


    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                                      final short initialCapacity,
                                                                                      final float loadFactor) {
        if (isNaN(loadFactor))
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity);
        if (loadFactor <= 0.0F)
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE)
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity, MAX_FLOAT_VALUE);
        if (values == null)
            return new MutableLinkedHashSet<>(initialCapacity, loadFactor);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>(initialCapacity, loadFactor);
        return new MutableLinkedHashSet<>(values, initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                                      final short initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity);
        if (loadFactor <= 0.0D)
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity, MAX_FLOAT_VALUE);
        if (values == null)
            return new MutableLinkedHashSet<>(initialCapacity, (float) loadFactor);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>(initialCapacity, (float) loadFactor);
        return new MutableLinkedHashSet<>(values, initialCapacity, (float) loadFactor);
    }


    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                                      final int initialCapacity,
                                                                                      final float loadFactor) {
        if (isNaN(loadFactor))
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity);
        if (loadFactor <= 0.0F)
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE)
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity, MAX_FLOAT_VALUE);
        if (values == null)
            return new MutableLinkedHashSet<>(initialCapacity, loadFactor);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>(initialCapacity, loadFactor);
        return new MutableLinkedHashSet<>(values, initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                                      final int initialCapacity,
                                                                                      final double loadFactor) {
        if (isNaN(loadFactor))
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity);
        if (loadFactor <= 0.0D)
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            if (values == null)
                return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(initialCapacity, MAX_FLOAT_VALUE);
            else
                return new MutableLinkedHashSet<>(values, initialCapacity, MAX_FLOAT_VALUE);
        if (values == null)
            return new MutableLinkedHashSet<>(initialCapacity, (float) loadFactor);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>(initialCapacity, (float) loadFactor);
        return new MutableLinkedHashSet<>(values, initialCapacity, (float) loadFactor);
    }


    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                                      final long initialCapacity,
                                                                                      final float loadFactor) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (values == null)
                new MutableLinkedHashSet<>(MAX_INT_VALUE, loadFactor);
            else if (values.isEmpty())
                new MutableLinkedHashSet<>(MAX_INT_VALUE, loadFactor);
            else
                new MutableLinkedHashSet<>(values, MAX_INT_VALUE, loadFactor);
        if (values == null)
            return new MutableLinkedHashSet<>((int) initialCapacity, loadFactor);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>((int) initialCapacity, loadFactor);
        return new MutableLinkedHashSet<>(values, (int) initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                                      final long initialCapacity,
                                                                                      final double loadFactor) {
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (isNaN(loadFactor))
                if (values == null)
                    return new MutableLinkedHashSet<>(MAX_INT_VALUE);
                else if (values.isEmpty())
                    return new MutableLinkedHashSet<>(MAX_INT_VALUE);
                else
                    return new MutableLinkedHashSet<>(values, MAX_INT_VALUE);
            else if (loadFactor <= 0.0D)
                if (values == null)
                    return new MutableLinkedHashSet<>(MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
                else if (values.isEmpty())
                    return new MutableLinkedHashSet<>(MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
                else
                    return new MutableLinkedHashSet<>(values, MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                if (values == null)
                    return new MutableLinkedHashSet<>(MAX_INT_VALUE, MAX_FLOAT_VALUE);
                else if (values.isEmpty())
                    return new MutableLinkedHashSet<>(MAX_INT_VALUE, MAX_FLOAT_VALUE);
                else
                    return new MutableLinkedHashSet<>(values, MAX_INT_VALUE, MAX_FLOAT_VALUE);
            else if (values == null)
                return new MutableLinkedHashSet<>(MAX_INT_VALUE, (float) loadFactor);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(MAX_INT_VALUE, (float) loadFactor);
            else
                return new MutableLinkedHashSet<>(values, MAX_INT_VALUE, (float) loadFactor);
        if (isNaN(loadFactor))
            if (values == null)
                return new MutableLinkedHashSet<>((int) initialCapacity);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>((int) initialCapacity);
            else
                return new MutableLinkedHashSet<>(values, (int) initialCapacity);
        if (loadFactor <= 0.0D)
            if (values == null)
                return new MutableLinkedHashSet<>((int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>((int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return new MutableLinkedHashSet<>(values, (int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            if (values == null)
                return new MutableLinkedHashSet<>((int) initialCapacity, MAX_FLOAT_VALUE);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>((int) initialCapacity, MAX_FLOAT_VALUE);
            else
                return new MutableLinkedHashSet<>(values, (int) initialCapacity, MAX_FLOAT_VALUE);
        if (values == null)
            return new MutableLinkedHashSet<>((int) initialCapacity, (float) loadFactor);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>((int) initialCapacity, (float) loadFactor);
        return new MutableLinkedHashSet<>(values, (int) initialCapacity, (float) loadFactor);
    }

    //#endregion -------------------- values Collection<T>, initialCapacity, loadFactor --------------------

    //#endregion -------------------- values, initialCapacity, loadFactor --------------------
    //#region -------------------- values, loadFactor --------------------

    //#region -------------------- values, loadFactor float --------------------

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstanceWithNoInitialCapacity(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                                           final float loadFactor) {
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, DEFAULT_INITIAL_CAPACITY, loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstanceWithNoInitialCapacity(final @Nullable CollectionHolder<? extends T> values,
                                                                                                           final float loadFactor) {
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, DEFAULT_INITIAL_CAPACITY, loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstanceWithNoInitialCapacity(final T @Nullable @Unmodifiable [] values,
                                                                                                           final float loadFactor) {
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, DEFAULT_INITIAL_CAPACITY, loadFactor);
    }

    //#endregion -------------------- values, loadFactor float --------------------
    //#region -------------------- values, loadFactor double --------------------


    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstanceWithNoInitialCapacity(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                                           final double loadFactor) {
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, DEFAULT_INITIAL_CAPACITY, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, DEFAULT_INITIAL_CAPACITY, (float) loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstanceWithNoInitialCapacity(final @Nullable CollectionHolder<? extends T> values,
                                                                                                           final double loadFactor) {
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, DEFAULT_INITIAL_CAPACITY, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, DEFAULT_INITIAL_CAPACITY, (float) loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstanceWithNoInitialCapacity(final T @Nullable @Unmodifiable [] values,
                                                                                                           final double loadFactor) {
        if (isNaN(loadFactor))
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values);
        if (loadFactor <= 0.0D)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, DEFAULT_INITIAL_CAPACITY, MAX_FLOAT_VALUE);
        return ToMutableLinkedHashSet.toMutableLinkedHashSet(values, DEFAULT_INITIAL_CAPACITY, (float) loadFactor);
    }

    //#endregion -------------------- values, loadFactor double --------------------
    //#region -------------------- values Collection<T>, loadFactor --------------------

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstanceWithNoInitialCapacity(final @Nullable Collection<? extends T> values,
                                                                                                           final float loadFactor) {
        if (values == null)
            return new MutableLinkedHashSet<>(DEFAULT_INITIAL_CAPACITY, loadFactor);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>(DEFAULT_INITIAL_CAPACITY, loadFactor);
        return new MutableLinkedHashSet<>(values, DEFAULT_INITIAL_CAPACITY, loadFactor);
    }

    private static <T extends @Nullable Object> MutableLinkedHashSet<T> __newInstanceWithNoInitialCapacity(final @Nullable Collection<? extends T> values,
                                                                                                           final double loadFactor) {
        if (isNaN(loadFactor))
            if (values == null)
                return new MutableLinkedHashSet<>();
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>();
            else
                return new MutableLinkedHashSet<>(values);
        if (loadFactor <= 0.0D)
            if (values == null)
                return new MutableLinkedHashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return new MutableLinkedHashSet<>(values, DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            if (values == null)
                return new MutableLinkedHashSet<>(DEFAULT_INITIAL_CAPACITY, MAX_FLOAT_VALUE);
            else if (values.isEmpty())
                return new MutableLinkedHashSet<>(DEFAULT_INITIAL_CAPACITY, MAX_FLOAT_VALUE);
            else
                return new MutableLinkedHashSet<>(values, DEFAULT_INITIAL_CAPACITY, MAX_FLOAT_VALUE);
        if (values == null)
            return new MutableLinkedHashSet<>(DEFAULT_INITIAL_CAPACITY, (float) loadFactor);
        if (values.isEmpty())
            return new MutableLinkedHashSet<>(DEFAULT_INITIAL_CAPACITY, (float) loadFactor);
        return new MutableLinkedHashSet<>(values, DEFAULT_INITIAL_CAPACITY, (float) loadFactor);
    }

    //#endregion -------------------- values Collection<T>, loadFactor --------------------

    //#endregion -------------------- values, loadFactor --------------------

    //#endregion -------------------- Core methods --------------------

}
