package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.EmptyLinkedHashSet;
import joookiwi.collection.java.extended.ImmutableLinkedHashSet;
import joookiwi.collection.java.extended.MutableLinkedHashSet;
import joookiwi.collection.java.helper.NumberComparator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Double.isNaN;
import static java.lang.Float.isNaN;
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
public final class LinkedHashSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private LinkedHashSetCreator() { throw new ImpossibleConstructionException("The utility class “LinkedHashSetCreator” cannot be constructed.", LinkedHashSetCreator.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// An [EmptyLinkedHashSet] instance
    public static <T extends @Nullable Object> EmptyLinkedHashSet<T> LinkedHashSet() { return EmptyLinkedHashSet.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToLinkedHashSet.toLinkedHashSet(values); }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable CollectionHolder<? extends T> values) { return ToLinkedHashSet.toLinkedHashSet(values); }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final T @Nullable @Unmodifiable [] values) { return ToLinkedHashSet.toLinkedHashSet(values); }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values) { return __newInstance(values); }

    //#endregion -------------------- values --------------------
    //#region -------------------- loadFactor --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final float loadFactor) { return new ImmutableLinkedHashSet<>(loadFactor); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final double loadFactor) { return __newInstance(loadFactor); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable Float loadFactor) { return new ImmutableLinkedHashSet<>(loadFactor); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return new ImmutableLinkedHashSet<>();
        return __newInstance(loadFactor);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return new ImmutableLinkedHashSet<>();
        return __newInstance(loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return new ImmutableLinkedHashSet<>();
        return __newInstance(loadFactor.get());
    }

    //#endregion -------------------- loadFactor --------------------
    //#region -------------------- values, loadFactor --------------------

    //#region -------------------- values, loadFactor float --------------------

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                       final float loadFactor) { return ToLinkedHashSet.toLinkedHashSet(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                       final float loadFactor) { return ToLinkedHashSet.toLinkedHashSet(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                       final float loadFactor) { return ToLinkedHashSet.toLinkedHashSet(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                       final float loadFactor) { return __newInstance(values, loadFactor); }

    //#endregion -------------------- values, loadFactor float --------------------
    //#region -------------------- values, loadFactor double --------------------

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                       final double loadFactor) { return __newInstance(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                       final double loadFactor) { return __newInstance(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                       final double loadFactor) { return __newInstance(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                       final double loadFactor) { return __newInstance(values, loadFactor); }

    //#endregion -------------------- values, loadFactor double --------------------
    //#region -------------------- values, loadFactor float? --------------------

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                       final @Nullable Float loadFactor) { return ToLinkedHashSet.toLinkedHashSet(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                       final @Nullable Float loadFactor) { return ToLinkedHashSet.toLinkedHashSet(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                       final @Nullable Float loadFactor) { return ToLinkedHashSet.toLinkedHashSet(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                       final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values);
        return __newInstance(values, loadFactor);
    }

    //#endregion -------------------- values, loadFactor float? --------------------
    //#region -------------------- values, loadFactor double? --------------------

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                       final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToLinkedHashSet.toLinkedHashSet(values);
        return __newInstance(values, loadFactor);
    }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                       final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToLinkedHashSet.toLinkedHashSet(values);
        return __newInstance(values, loadFactor);
    }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                       final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToLinkedHashSet.toLinkedHashSet(values);
        return __newInstance(values, loadFactor);
    }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                       final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values);
        return __newInstance(values, loadFactor);
    }

    //#endregion -------------------- values, loadFactor double? --------------------
    //#region -------------------- values, loadFactor DoubleAdder? --------------------

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                       final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToLinkedHashSet.toLinkedHashSet(values);
        return __newInstance(values, loadFactor.sum());
    }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                       final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToLinkedHashSet.toLinkedHashSet(values);
        return __newInstance(values, loadFactor.sum());
    }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                       final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToLinkedHashSet.toLinkedHashSet(values);
        return __newInstance(values, loadFactor.sum());
    }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                       final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values);
        return __newInstance(values, loadFactor.sum());
    }

    //#endregion -------------------- values, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, loadFactor DoubleAccumulator? --------------------

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                       final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToLinkedHashSet.toLinkedHashSet(values);
        return __newInstance(values, loadFactor.get());
    }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                       final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToLinkedHashSet.toLinkedHashSet(values);
        return __newInstance(values, loadFactor.get());
    }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final T @Nullable @Unmodifiable [] values,
                                                                                       final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToLinkedHashSet.toLinkedHashSet(values);
        return __newInstance(values, loadFactor.get());
    }

    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> LinkedHashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                       final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values);
        return __newInstance(values, loadFactor.get());
    }

    //#endregion -------------------- values, loadFactor DoubleAccumulator? --------------------

    //#endregion -------------------- values, loadFactor --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    private static <T extends @Nullable Object> ImmutableLinkedHashSet<T> __newInstance(final double loadFactor) {
        if (isNaN(loadFactor))
            return new ImmutableLinkedHashSet<>();
        if (loadFactor <= 0.0D)
            return new ImmutableLinkedHashSet<>(DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return new ImmutableLinkedHashSet<>(MAX_FLOAT_VALUE);
        return new ImmutableLinkedHashSet<>((float) loadFactor);
    }


    private static <T extends @Nullable Object> ImmutableLinkedHashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                        final double loadFactor) {
        if (isNaN(loadFactor))
            return ToLinkedHashSet.toLinkedHashSet(values);
        if (loadFactor <= 0.0D)
            return ToLinkedHashSet.toLinkedHashSet(values, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToLinkedHashSet.toLinkedHashSet(values, MAX_FLOAT_VALUE);
        return ToLinkedHashSet.toLinkedHashSet(values, (float) loadFactor);
    }

    private static <T extends @Nullable Object> ImmutableLinkedHashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                                        final double loadFactor) {
        if (isNaN(loadFactor))
            return ToLinkedHashSet.toLinkedHashSet(values);
        if (loadFactor <= 0.0D)
            return ToLinkedHashSet.toLinkedHashSet(values, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToLinkedHashSet.toLinkedHashSet(values, MAX_FLOAT_VALUE);
        return ToLinkedHashSet.toLinkedHashSet(values, (float) loadFactor);
    }

    private static <T extends @Nullable Object> ImmutableLinkedHashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                                        final double loadFactor) {
        if (isNaN(loadFactor))
            return ToLinkedHashSet.toLinkedHashSet(values);
        if (loadFactor <= 0.0D)
            return ToLinkedHashSet.toLinkedHashSet(values, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToLinkedHashSet.toLinkedHashSet(values, MAX_FLOAT_VALUE);
        return ToLinkedHashSet.toLinkedHashSet(values, (float) loadFactor);
    }


    private static <T extends @Nullable Object> ImmutableLinkedHashSet<T> __newInstance(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyLinkedHashSet.getInstance();
        if (values.isEmpty())
            return EmptyLinkedHashSet.getInstance();
        return new ImmutableLinkedHashSet<>(values);
    }


    private static <T extends @Nullable Object> ImmutableLinkedHashSet<T> __newInstance(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                        final float loadFactor) {
        if (isNaN(loadFactor))
            if (values == null)
                return EmptyLinkedHashSet.getInstance();
            else if (values.isEmpty())
                return EmptyLinkedHashSet.getInstance();
            else
                return new ImmutableLinkedHashSet<>(values);
        if (loadFactor <= 0.0F)
            if (values == null)
                return EmptyLinkedHashSet.getInstance();
            else if (values.isEmpty())
                return EmptyLinkedHashSet.getInstance();
            else
                return new ImmutableLinkedHashSet<>(values, DEFAULT_SMALL_LOAD_FACTOR);
        if (values == null)
            return EmptyLinkedHashSet.getInstance();
        if (values.isEmpty())
            return EmptyLinkedHashSet.getInstance();
        return new ImmutableLinkedHashSet<>(values, loadFactor);
    }

    private static <T extends @Nullable Object> ImmutableLinkedHashSet<T> __newInstance(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                        final double loadFactor) {
        if (isNaN(loadFactor))
            if (values == null)
                return EmptyLinkedHashSet.getInstance();
            else if (values.isEmpty())
                return EmptyLinkedHashSet.getInstance();
            else
                return new ImmutableLinkedHashSet<>(values);
        if (loadFactor <= 0.0D)
            if (values == null)
                return EmptyLinkedHashSet.getInstance();
            else if (values.isEmpty())
                return EmptyLinkedHashSet.getInstance();
            else
                return new ImmutableLinkedHashSet<>(values, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            if (values == null)
                return EmptyLinkedHashSet.getInstance();
            else if (values.isEmpty())
                return EmptyLinkedHashSet.getInstance();
            else
                return new ImmutableLinkedHashSet<>(values, MAX_FLOAT_VALUE);
        if (values == null)
            return EmptyLinkedHashSet.getInstance();
        if (values.isEmpty())
            return EmptyLinkedHashSet.getInstance();
        return new ImmutableLinkedHashSet<>(values, (float) loadFactor);
    }

    //#endregion -------------------- Core methods --------------------

}
