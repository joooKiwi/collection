package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Double.isNaN;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_LOAD_FACTOR;
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
import static joookiwi.collection.java.helper.NumberComparator.max;

@NotNullByDefault
public final class JavaHashSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private JavaHashSetCreator() { throw new ImpossibleConstructionException("The utility class “JavaHashSetCreator” cannot be constructed.", JavaHashSetCreator.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet() { return __newInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return __newInstance(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values) { return __newInstance(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable [] values) { return __newInstance(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable @Unmodifiable Collection<? extends T> values) { return __newInstance(values); }

    //#endregion -------------------- values --------------------
    //#region -------------------- initialCapacity --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final byte initialCapacity) { return __newInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final short initialCapacity) { return __newInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final int initialCapacity) { return __newInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final long initialCapacity) { return __newInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Byte initialCapacity) {
        if (initialCapacity == null)
            return __newInstance();
        return __newInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Short initialCapacity) {
        if (initialCapacity == null)
            return __newInstance();
        return __newInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Integer initialCapacity) {
        if (initialCapacity == null)
            return __newInstance();
        return __newInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return __newInstance();
        return __newInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return __newInstance();
        return __newInstance(initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return __newInstance();
        return __newInstance(initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return __newInstance();
        return __newInstance(initialCapacity.sum());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAccumulator initialCapacity) {
        if (initialCapacity == null)
            return __newInstance();
        return __newInstance(initialCapacity.get());
    }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, loadFactor --------------------

    //#region -------------------- initialCapacity byte, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final byte initialCapacity,
                                                                      final float loadFactor) { return __newInstance(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final byte initialCapacity,
                                                                      final double loadFactor) { return __newInstance(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final byte initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final byte initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final byte initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final byte initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity byte, loadFactor --------------------
    //#region -------------------- initialCapacity short, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final short initialCapacity,
                                                                      final float loadFactor) { return __newInstance(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final short initialCapacity,
                                                                      final double loadFactor) { return __newInstance(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final short initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final short initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final short initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final short initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity short, loadFactor --------------------
    //#region -------------------- initialCapacity int, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final int initialCapacity,
                                                                      final float loadFactor) { return __newInstance(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final int initialCapacity,
                                                                      final double loadFactor) { return __newInstance(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final int initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final int initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final int initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final int initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity int, loadFactor --------------------
    //#region -------------------- initialCapacity long, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final long initialCapacity,
                                                                      final float loadFactor) { return __newInstance(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final long initialCapacity,
                                                                      final double loadFactor) { return __newInstance(initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final long initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final long initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final long initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final long initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity long, loadFactor --------------------
    //#region -------------------- initialCapacity byte?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Byte initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Byte initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Byte initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Byte initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Byte initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Byte initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.get());
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity byte?, loadFactor --------------------
    //#region -------------------- initialCapacity short?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Short initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Short initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Short initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Short initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Short initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Short initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.get());
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity short?, loadFactor --------------------
    //#region -------------------- initialCapacity int?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Integer initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Integer initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Integer initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Integer initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Integer initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Integer initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.get());
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity int?, loadFactor --------------------
    //#region -------------------- initialCapacity long?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Long initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Long initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Long initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Long initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Long initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Long initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.get());
        if (loadFactor == null)
            return __newInstance(initialCapacity);
        return __newInstance(initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- initialCapacity long?, loadFactor --------------------
    //#region -------------------- initialCapacity AtomicInteger?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicInteger initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicInteger initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicInteger initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicInteger initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicInteger initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicInteger initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.get());
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor.get());
    }

    //#endregion -------------------- initialCapacity AtomicInteger?, loadFactor --------------------
    //#region -------------------- initialCapacity AtomicLong?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicLong initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicLong initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicLong initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicLong initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicLong initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable AtomicLong initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.get());
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor.get());
    }

    //#endregion -------------------- initialCapacity AtomicLong?, loadFactor --------------------
    //#region -------------------- initialCapacity LongAdder?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAdder initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAdder initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAdder initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.sum());
        return __newInstance(initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAdder initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.sum());
        return __newInstance(initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAdder initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(initialCapacity.sum());
        return __newInstance(initialCapacity.sum(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAdder initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.get());
        if (loadFactor == null)
            return __newInstance(initialCapacity.sum());
        return __newInstance(initialCapacity.sum(), loadFactor.get());
    }

    //#endregion -------------------- initialCapacity LongAdder?, loadFactor --------------------
    //#region -------------------- initialCapacity LongAccumulator?, loadFactor --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAccumulator initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAccumulator initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(loadFactor);
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAccumulator initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAccumulator initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor);
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAccumulator initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
            else
                return __newInstanceWithNoInitialCapacity(loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(initialCapacity.get());
        return __newInstance(initialCapacity.get(), loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable LongAccumulator initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance();
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final byte initialCapacity) { return __newInstance(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final byte initialCapacity) { return __newInstance(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final byte initialCapacity) { return __newInstance(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                      final byte initialCapacity) { return __newInstance(values, initialCapacity); }

    //#endregion -------------------- values, initialCapacity byte --------------------
    //#region -------------------- values, initialCapacity short --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final short initialCapacity) { return __newInstance(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final short initialCapacity) { return __newInstance(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final short initialCapacity) { return __newInstance(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                      final short initialCapacity) { return __newInstance(values, initialCapacity); }

    //#endregion -------------------- values, initialCapacity short --------------------
    //#region -------------------- values, initialCapacity int --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final int initialCapacity) { return __newInstance(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final int initialCapacity) { return __newInstance(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final int initialCapacity) { return __newInstance(values, initialCapacity); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                      final int initialCapacity) { return __newInstance(values, initialCapacity); }

    //#endregion -------------------- values, initialCapacity int --------------------
    //#region -------------------- values, initialCapacity long --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final long initialCapacity) {
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final long initialCapacity) {
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final long initialCapacity) {
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                      final long initialCapacity) { return __newInstance(values, initialCapacity); }

    //#endregion -------------------- values, initialCapacity long --------------------
    //#region -------------------- values, initialCapacity byte? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Byte initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.intValue());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Byte initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.intValue());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Byte initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.intValue());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                      final @Nullable Byte initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    //#endregion -------------------- values, initialCapacity byte? --------------------
    //#region -------------------- values, initialCapacity short? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Short initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.intValue());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Short initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.intValue());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Short initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.intValue());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                      final @Nullable Short initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    //#endregion -------------------- values, initialCapacity short? --------------------
    //#region -------------------- values, initialCapacity int? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Integer initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Integer initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Integer initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                      final @Nullable Integer initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    //#endregion -------------------- values, initialCapacity int? --------------------
    //#region -------------------- values, initialCapacity long? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                      final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity);
    }

    //#endregion -------------------- values, initialCapacity long? --------------------
    //#region -------------------- values, initialCapacity AtomicInteger? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                      final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    //#endregion -------------------- values, initialCapacity AtomicInteger? --------------------
    //#region -------------------- values, initialCapacity AtomicLong? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                      final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    //#endregion -------------------- values, initialCapacity AtomicLong? --------------------
    //#region -------------------- values, initialCapacity LongAdder? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.sum());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                      final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.sum());
    }

    //#endregion -------------------- values, initialCapacity LongAdder? --------------------
    //#region -------------------- values, initialCapacity LongAccumulator? --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable LongAccumulator initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable LongAccumulator initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable LongAccumulator initialCapacity) {
        if (initialCapacity == null)
            return __newInstance(values);
        return __newInstance(values, initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final byte initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity byte, loadFactor float --------------------
    //#region -------------------- values, initialCapacity byte, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final byte initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity byte, loadFactor double --------------------
    //#region -------------------- values, initialCapacity byte, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity byte, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity byte, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity byte, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity byte, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity byte, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity byte, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final byte initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity byte, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity short, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final short initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity short, loadFactor float --------------------
    //#region -------------------- values, initialCapacity short, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final short initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity short, loadFactor double --------------------
    //#region -------------------- values, initialCapacity short, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final short initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity short, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity short, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final short initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity short, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity short, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final short initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity short, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity short, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final short initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final short initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity short, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity int, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final int initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity int, loadFactor float --------------------
    //#region -------------------- values, initialCapacity int, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final int initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity int, loadFactor double --------------------
    //#region -------------------- values, initialCapacity int, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final int initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity int, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity int, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final int initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity int, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity int, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final int initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity int, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity int, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final int initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final int initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity int, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity long, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final long initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final float loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity long, loadFactor float --------------------
    //#region -------------------- values, initialCapacity long, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T>values,
                                                                      final long initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final long initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final double loadFactor) { return __newInstance(values, initialCapacity, loadFactor); }

    //#endregion -------------------- values, initialCapacity long, loadFactor double --------------------
    //#region -------------------- values, initialCapacity long, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final long initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity long, loadFactor float? --------------------
    //#region -------------------- values, initialCapacity long, loadFactor double? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final long initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity long, loadFactor double? --------------------
    //#region -------------------- values, initialCapacity long, loadFactor DoubleAdder? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final long initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    //#endregion -------------------- values, initialCapacity long, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, initialCapacity long, loadFactor DoubleAccumulator? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final long initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final long initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values, initialCapacity);
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    //#endregion -------------------- values, initialCapacity long, loadFactor DoubleAccumulator? --------------------

    //#region -------------------- values, initialCapacity byte?, loadFactor float --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity byte?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity byte?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity byte?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity byte?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Byte initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.intValue(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity short?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity short?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity short?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity short?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final @Nullable Double loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor);
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final @Nullable DoubleAdder loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.sum());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Short initialCapacity,
                                                                      final @Nullable DoubleAccumulator loadFactor) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return __newInstance(values);
            else
                return __newInstanceWithNoInitialCapacity(values, loadFactor.get());
        if (loadFactor == null)
            return __newInstance(values, initialCapacity.intValue());
        return __newInstance(values, initialCapacity, loadFactor.get());
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Integer initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Integer initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Integer initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable Integer initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity int?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity int?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Integer initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Integer initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Integer initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable Integer initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity int?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity int?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Long initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Long initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Long initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable Long initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity long?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity long?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable Long initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable Long initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable Long initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable Long initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity long?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity long?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable AtomicInteger initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable AtomicInteger initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable AtomicInteger initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable AtomicInteger initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity AtomicInteger?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity AtomicInteger?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable AtomicInteger initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable AtomicInteger initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable AtomicInteger initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable AtomicInteger initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity AtomicInteger?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity AtomicInteger?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable AtomicLong initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable AtomicLong initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable AtomicLong initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable AtomicLong initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity AtomicLong?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity AtomicLong?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable AtomicLong initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable AtomicLong initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable AtomicLong initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable AtomicLong initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity AtomicLong?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity AtomicLong?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable LongAdder initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable LongAdder initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable LongAdder initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable LongAdder initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity LongAdder?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity LongAdder?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable LongAdder initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable LongAdder initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable LongAdder initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable LongAdder initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.sum(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity LongAdder?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity LongAdder?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable LongAccumulator initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable LongAccumulator initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable LongAccumulator initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable LongAccumulator initialCapacity,
                                                                      final float loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity LongAccumulator?, loadFactor float --------------------
    //#region -------------------- values, initialCapacity LongAccumulator?, loadFactor double --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final @Nullable LongAccumulator initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final @Nullable LongAccumulator initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
                                                                      final @Nullable LongAccumulator initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
                                                                      final @Nullable LongAccumulator initialCapacity,
                                                                      final double loadFactor) {
        if (initialCapacity == null)
            return __newInstanceWithNoInitialCapacity(values, loadFactor);
        return __newInstance(values, initialCapacity.get(), loadFactor);
    }

    //#endregion -------------------- values, initialCapacity LongAccumulator?, loadFactor double --------------------
    //#region -------------------- values, initialCapacity LongAccumulator?, loadFactor float? --------------------

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable CollectionHolder<? extends T> values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final T @Nullable @Unmodifiable [] values,
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

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> JavaHashSet(final @Nullable Collection<? extends T> values,
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

    //#region -------------------- ∅ --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance() { return new HashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final byte initialCapacity) {
        if (initialCapacity < 0)
            return new HashSet<>(0, DEFAULT_LOAD_FACTOR);
        return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final short initialCapacity) {
        if (initialCapacity < 0)
            return new HashSet<>(0, DEFAULT_LOAD_FACTOR);
        return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final int initialCapacity) {
        if (initialCapacity < 0)
            return new HashSet<>(0, DEFAULT_LOAD_FACTOR);
        return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final long initialCapacity) {
        if (initialCapacity < 0L)
            return new HashSet<>(0, DEFAULT_LOAD_FACTOR);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            return new HashSet<>(MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
        return new HashSet<>((int) initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, loadFactor --------------------

    //#region -------------------- initialCapacity byte, loadFactor --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final byte initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return new HashSet<>(0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return new HashSet<>(0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return new HashSet<>(0, loadFactor);
        if (Float.isNaN(loadFactor))
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return new HashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return new HashSet<>(initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final byte initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return new HashSet<>(0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return new HashSet<>(0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return new HashSet<>(0, MAX_FLOAT_VALUE);
            else
                return new HashSet<>(0, (float) loadFactor);
        if (isNaN(loadFactor))
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return new HashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return new HashSet<>(initialCapacity, MAX_FLOAT_VALUE);
        return new HashSet<>(initialCapacity, (float) loadFactor);
    }

    //#endregion -------------------- initialCapacity byte, loadFactor --------------------
    //#region -------------------- initialCapacity short, loadFactor --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final short initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return new HashSet<>(0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return new HashSet<>(0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return new HashSet<>(0, loadFactor);
        if (Float.isNaN(loadFactor))
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return new HashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return new HashSet<>(initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final short initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return new HashSet<>(0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return new HashSet<>(0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return new HashSet<>(0, MAX_FLOAT_VALUE);
            else
                return new HashSet<>(0, (float) loadFactor);
        if (isNaN(loadFactor))
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return new HashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return new HashSet<>(initialCapacity, MAX_FLOAT_VALUE);
        return new HashSet<>(initialCapacity, (float) loadFactor);
    }

    //#endregion -------------------- initialCapacity short, loadFactor --------------------
    //#region -------------------- initialCapacity int, loadFactor --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final int initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return new HashSet<>(0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return new HashSet<>(0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return new HashSet<>(0, loadFactor);
        if (Float.isNaN(loadFactor))
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return new HashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return new HashSet<>(initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final int initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return new HashSet<>(0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return new HashSet<>(0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return new HashSet<>(0, MAX_FLOAT_VALUE);
            else
                return new HashSet<>(0, (float) loadFactor);
        if (isNaN(loadFactor))
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return new HashSet<>(initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return new HashSet<>(initialCapacity, MAX_FLOAT_VALUE);
        return new HashSet<>(initialCapacity, (float) loadFactor);
    }

    //#endregion -------------------- initialCapacity int, loadFactor --------------------
    //#region -------------------- initialCapacity long, loadFactor --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final long initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0L)
            if (Float.isNaN(loadFactor))
                return new HashSet<>(0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return new HashSet<>(0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return new HashSet<>(0, loadFactor);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (Float.isNaN(loadFactor))
                return new HashSet<>(MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return new HashSet<>(MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return new HashSet<>(MAX_INT_VALUE, loadFactor);
        if (Float.isNaN(loadFactor))
            return new HashSet<>((int) initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return new HashSet<>((int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return new HashSet<>((int) initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final long initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0L)
            if (isNaN(loadFactor))
                return new HashSet<>(0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return new HashSet<>(0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return new HashSet<>(0, MAX_FLOAT_VALUE);
            else
                return new HashSet<>(0, (float) loadFactor);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (isNaN(loadFactor))
                return new HashSet<>(MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return new HashSet<>(MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return new HashSet<>(MAX_INT_VALUE, MAX_FLOAT_VALUE);
            else
                return new HashSet<>(MAX_INT_VALUE, (float) loadFactor);
        if (isNaN(loadFactor))
            return new HashSet<>((int) initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return new HashSet<>((int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return new HashSet<>((int) initialCapacity, MAX_FLOAT_VALUE);
        return new HashSet<>((int) initialCapacity, (float) loadFactor);
    }

    //#endregion -------------------- initialCapacity long, loadFactor --------------------

    //#endregion -------------------- initialCapacity, loadFactor --------------------
    //#region -------------------- loadFactor --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstanceWithNoInitialCapacity(final float loadFactor) {
        if (Float.isNaN(loadFactor))
            return new HashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return new HashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        return new HashSet<>(DEFAULT_INITIAL_CAPACITY, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceWithNoInitialCapacity(final double loadFactor) {
        if (isNaN(loadFactor))
            return new HashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return new HashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return new HashSet<>(DEFAULT_INITIAL_CAPACITY, MAX_FLOAT_VALUE);
        return new HashSet<>(DEFAULT_INITIAL_CAPACITY, (float) loadFactor);
    }

    //#endregion -------------------- loadFactor --------------------
    //#region -------------------- values --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values) {
        return __newInstanceFromValidArguments(values);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values) {
        return __newInstanceFromValidArguments(values);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values) {
        return __newInstanceFromValidArguments(values);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable @Unmodifiable Collection<? extends T> values) {
        return __newInstanceFromValidArguments(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, initialCapacity --------------------

    //#region -------------------- values, initialCapacity byte --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                         final byte initialCapacity) {
        if (initialCapacity < 0)
            return __newInstanceFromValidArguments(values, 0);
        return __newInstanceFromValidArguments(values, initialCapacity);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                         final byte initialCapacity) {
        if (initialCapacity < 0)
            return __newInstanceFromValidArguments(values, 0);
        return __newInstanceFromValidArguments(values, initialCapacity);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                         final byte initialCapacity) {
        if (initialCapacity < 0)
            return __newInstanceFromValidArguments(values, 0);
        return __newInstanceFromValidArguments(values, initialCapacity);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                         final byte initialCapacity) {
        if (initialCapacity < 0)
            return __newInstanceFromValidArguments(values, 0);
        return __newInstanceFromValidArguments(values, initialCapacity);
    }

    //#endregion -------------------- values, initialCapacity byte --------------------
    //#region -------------------- values, initialCapacity short --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                         final short initialCapacity) {
        if (initialCapacity < 0)
            return __newInstanceFromValidArguments(values, 0);
        return __newInstanceFromValidArguments(values, initialCapacity);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                         final short initialCapacity) {
        if (initialCapacity < 0)
            return __newInstanceFromValidArguments(values, 0);
        return __newInstanceFromValidArguments(values, initialCapacity);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                         final short initialCapacity) {
        if (initialCapacity < 0)
            return __newInstanceFromValidArguments(values, 0);
        return __newInstanceFromValidArguments(values, initialCapacity);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                         final short initialCapacity) {
        if (initialCapacity < 0)
            return __newInstanceFromValidArguments(values, 0);
        return __newInstanceFromValidArguments(values, initialCapacity);
    }

    //#endregion -------------------- values, initialCapacity short --------------------
    //#region -------------------- values, initialCapacity int --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                         final int initialCapacity) {
        if (initialCapacity < 0)
            return __newInstanceFromValidArguments(values, 0);
        return __newInstanceFromValidArguments(values, initialCapacity);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                         final int initialCapacity) {
        if (initialCapacity < 0)
            return __newInstanceFromValidArguments(values, 0);
        return __newInstanceFromValidArguments(values, initialCapacity);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                         final int initialCapacity) {
        if (initialCapacity < 0)
            return __newInstanceFromValidArguments(values, 0);
        return __newInstanceFromValidArguments(values, initialCapacity);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                         final int initialCapacity) {
        if (initialCapacity < 0)
            return __newInstanceFromValidArguments(values, 0);
        return __newInstanceFromValidArguments(values, initialCapacity);
    }

    //#endregion -------------------- values, initialCapacity int --------------------
    //#region -------------------- values, initialCapacity long --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                         final long initialCapacity) {
        if (initialCapacity < 0L)
            return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                         final long initialCapacity) {
        if (initialCapacity < 0L)
            return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                         final long initialCapacity) {
        if (initialCapacity < 0L)
            return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                         final long initialCapacity) {
        if (initialCapacity < 0L)
            return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    //#endregion -------------------- values, initialCapacity long --------------------

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- values, initialCapacity, loadFactor --------------------

    //#region -------------------- values, initialCapacity byte, loadFactor float --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                         final byte initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                         final byte initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                         final byte initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                         final byte initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity byte, loadFactor float --------------------
    //#region -------------------- values, initialCapacity byte, loadFactor double --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                         final byte initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                         final byte initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                         final byte initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                         final byte initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, initialCapacity, (float) loadFactor);
    }

    //#endregion -------------------- values, initialCapacity byte, loadFactor double --------------------
    //#region -------------------- values, initialCapacity short, loadFactor float --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                         final short initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                         final short initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                         final short initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                         final short initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity short, loadFactor float --------------------
    //#region -------------------- values, initialCapacity short, loadFactor double --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                         final short initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                         final short initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                         final short initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                         final short initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, initialCapacity, (float) loadFactor);
    }

    //#endregion -------------------- values, initialCapacity short, loadFactor double --------------------
    //#region -------------------- values, initialCapacity int, loadFactor float --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                         final int initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                         final int initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                         final int initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                         final int initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity int, loadFactor float --------------------
    //#region -------------------- values, initialCapacity int, loadFactor double --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                         final int initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                         final int initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                         final int initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                         final int initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, initialCapacity, (float) loadFactor);
    }

    //#endregion -------------------- values, initialCapacity int, loadFactor double --------------------
    //#region -------------------- values, initialCapacity long, loadFactor float --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                         final long initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0L)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, (int) initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                         final long initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0L)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, (int) initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                         final long initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0L)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, (int) initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                         final long initialCapacity,
                                                                         final float loadFactor) {
        if (initialCapacity < 0L)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, 0, loadFactor);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (Float.isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0F)
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, loadFactor);
        if (Float.isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, (int) initialCapacity, loadFactor);
    }

    //#endregion -------------------- values, initialCapacity long, loadFactor float --------------------
    //#region -------------------- values, initialCapacity long, loadFactor double --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                         final long initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0L)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, (int) initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, (int) initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                         final long initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0L)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, (int) initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, (int) initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                         final long initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0L)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, (int) initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, (int) initialCapacity, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstance(final @Nullable Collection<? extends T> values,
                                                                         final long initialCapacity,
                                                                         final double loadFactor) {
        if (initialCapacity < 0L)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, 0, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, 0, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, 0, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, 0, (float) loadFactor);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            if (isNaN(loadFactor))
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_LOAD_FACTOR);
            else if (loadFactor <= 0.0D)
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, DEFAULT_SMALL_LOAD_FACTOR);
            else if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, MAX_FLOAT_VALUE);
            else
                return __newInstanceFromValidArguments(values, MAX_INT_VALUE, (float) loadFactor);
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_LOAD_FACTOR);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, (int) initialCapacity, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, (int) initialCapacity, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, (int) initialCapacity, (float) loadFactor);
    }

    //#endregion -------------------- values, initialCapacity long, loadFactor double --------------------

    //#endregion -------------------- values, initialCapacity, loadFactor --------------------
    //#region -------------------- values, loadFactor --------------------

    //#region -------------------- values, loadFactor float --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstanceWithNoInitialCapacity(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                              final float loadFactor) {
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceWithNoInitialCapacity(final @Nullable CollectionHolder<? extends T> values,
                                                                                              final float loadFactor) {
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceWithNoInitialCapacity(final T @Nullable @Unmodifiable [] values,
                                                                                              final float loadFactor) {
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceWithNoInitialCapacity(final @Nullable Collection<? extends T> values,
                                                                                              final float loadFactor) {
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values);
        if (loadFactor <= 0.0F)
            return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, loadFactor);
    }

    //#endregion -------------------- values, loadFactor float --------------------
    //#region -------------------- values, loadFactor double --------------------


    private static <T extends @Nullable Object> HashSet<T> __newInstanceWithNoInitialCapacity(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                              final double loadFactor) {
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceWithNoInitialCapacity(final @Nullable CollectionHolder<? extends T> values,
                                                                                              final double loadFactor) {
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceWithNoInitialCapacity(final T @Nullable @Unmodifiable [] values,
                                                                                              final double loadFactor) {
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, (float) loadFactor);
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceWithNoInitialCapacity(final @Nullable Collection<? extends T> values,
                                                                                              final double loadFactor) {
        if (isNaN(loadFactor))
            return __newInstanceFromValidArguments(values);
        if (loadFactor <= 0.0D)
            return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, MAX_FLOAT_VALUE);
        return __newInstanceFromValidArguments(values, DEFAULT_INITIAL_CAPACITY, (float) loadFactor);
    }

    //#endregion -------------------- values, loadFactor double --------------------

    //#endregion -------------------- values, loadFactor --------------------

    //#region -------------------- New instance from valid arguments --------------------

    private static <T extends @Nullable Object> HashSet<T> __newInstanceFromValidArguments(final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return new HashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);

        final var size = values.size();
        if (size == 0)
            return new HashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);

        final var newInstance = new HashSet<T>(size, DEFAULT_LOAD_FACTOR);
        var index = -1;
        while (++index < size)
            newInstance.add(values.get(index));
        return newInstance;
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceFromValidArguments(final @Nullable CollectionHolder<? extends T> values) {
        if (values == null)
            return new HashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
        if (values.isEmpty())
            return new HashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
        return new HashSet<>(values.toCollection());
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceFromValidArguments(final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return new HashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);

        final var size = values.length;
        if (size == 0)
            return new HashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR); // We do not keep the empty array any longer.

        final var newInstance = new HashSet<T>(size, DEFAULT_LOAD_FACTOR);
        var index = -1;
        while (++index < size)
            newInstance.add(values[index]);
        return newInstance;
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceFromValidArguments(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new HashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
        if (values.isEmpty())
            return new HashSet<>(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
        return new HashSet<>(values);
    }


    private static <T extends @Nullable Object> HashSet<T> __newInstanceFromValidArguments(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                           final int initialCapacity) {
        if (values == null)
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);

        final var size = values.size();
        if (size == 0)
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);

        final var newInstance = new HashSet<T>(max(initialCapacity, size), DEFAULT_LOAD_FACTOR);
        var index = -1;
        while (++index < size)
            newInstance.add(values.get(index));
        return newInstance;
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceFromValidArguments(final @Nullable CollectionHolder<? extends T> values,
                                                                                           final int initialCapacity) {
        if (values == null)
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);
        if (values.isEmpty())
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);

        final var size = values.size();
        final var newInstance = new HashSet<T>(max(initialCapacity, size), DEFAULT_LOAD_FACTOR);
        newInstance.addAll(values.toCollection());
        return newInstance;
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceFromValidArguments(final T @Nullable @Unmodifiable [] values,
                                                                                           final int initialCapacity) {
        if (values == null)
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);

        final var size = values.length;
        if (size == 0)
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR); // We do not keep the empty array any longer.

        final var newInstance = new HashSet<T>(max(initialCapacity, size), DEFAULT_LOAD_FACTOR);
        var index = -1;
        while (++index < size)
            newInstance.add(values[index]);
        return newInstance;
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceFromValidArguments(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                           final int initialCapacity) {
        if (values == null)
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);
        if (values.isEmpty())
            return new HashSet<>(initialCapacity, DEFAULT_LOAD_FACTOR);

        final var size = values.size();
        final var newInstance = new HashSet<T>(max(initialCapacity, size), DEFAULT_LOAD_FACTOR);
        newInstance.addAll(values);
        return newInstance;
    }


    private static <T extends @Nullable Object> HashSet<T> __newInstanceFromValidArguments(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                           final int initialCapacity,
                                                                                           final float loadFactor) {
        if (values == null)
            return new HashSet<>(initialCapacity, loadFactor);

        final var size = values.size();
        if (size == 0)
            return new HashSet<>(initialCapacity, loadFactor);

        final var newInstance = new HashSet<T>(max(initialCapacity, size), loadFactor);
        var index = -1;
        while (++index < size)
            newInstance.add(values.get(index));
        return newInstance;
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceFromValidArguments(final @Nullable CollectionHolder<? extends T> values,
                                                                                           final int initialCapacity,
                                                                                           final float loadFactor) {
        if (values == null)
            return new HashSet<>(initialCapacity, loadFactor);
        if (values.isEmpty())
            return new HashSet<>(initialCapacity, loadFactor);

        final var size = values.size();
        final var newInstance = new HashSet<T>(max(initialCapacity, size), loadFactor);
        newInstance.addAll(values.toCollection());
        return newInstance;
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceFromValidArguments(final T @Nullable @Unmodifiable [] values,
                                                                                           final int initialCapacity,
                                                                                           final float loadFactor) {
        if (values == null)
            return new HashSet<>(initialCapacity, loadFactor);

        final var size = values.length;
        if (size == 0)
            return new HashSet<>(initialCapacity, loadFactor); // We do not keep the empty array any longer.

        final var newInstance = new HashSet<T>(max(initialCapacity, size), loadFactor);
        var index = -1;
        while (++index < size)
            newInstance.add(values[index]);
        return newInstance;
    }

    private static <T extends @Nullable Object> HashSet<T> __newInstanceFromValidArguments(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                           final int initialCapacity,
                                                                                           final float loadFactor) {
        if (values == null)
            return new HashSet<>(initialCapacity, loadFactor);
        if (values.isEmpty())
            return new HashSet<>(initialCapacity, loadFactor);

        final var size = values.size();
        final var newInstance = new HashSet<T>(max(initialCapacity, size), loadFactor);
        newInstance.addAll(values);
        return newInstance;
    }

    //#endregion -------------------- New instance from valid arguments --------------------

    //#endregion -------------------- Core methods --------------------

}
