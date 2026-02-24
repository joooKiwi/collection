package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.concurrent.atomic.DoubleAdder;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.EmptyHashSet;
import joookiwi.collection.java.extended.ImmutableHashSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Double.isNaN;
import static java.lang.Float.isNaN;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_SMALL_LOAD_FACTOR;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.NumericConstants.MAX_FLOAT_VALUE;
import static joookiwi.collection.java.NumericConstants.MAX_FLOAT_VALUE_AS_DOUBLE;

@NotNullByDefault
public final class HashSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private HashSetCreator() { throw new ImpossibleConstructionException("The utility class “HashSetCreator” cannot be constructed.", HashSetCreator.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// An [EmptyHashSet] instance
    public static <T extends @Nullable Object> EmptyHashSet<T> HashSet() { return EmptyHashSet.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToHashSet.toHashSet(values); }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable CollectionHolder<? extends T> values) { return ToHashSet.toHashSet(values); }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final T @Nullable @Unmodifiable [] values) { return ToHashSet.toHashSet(values); }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable @Unmodifiable Collection<? extends T> values) { return __newInstance(values); }

    //#endregion -------------------- values --------------------
    //#region -------------------- loadFactor --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final float loadFactor) { return new ImmutableHashSet<>(loadFactor); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final double loadFactor) { return __newInstance(loadFactor); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable Float loadFactor) { return new ImmutableHashSet<>(loadFactor); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return new ImmutableHashSet<>();
        return __newInstance(loadFactor);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return new ImmutableHashSet<>();
        return __newInstance(loadFactor.sum());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return new ImmutableHashSet<>();
        return __newInstance(loadFactor.get());
    }

    //#endregion -------------------- loadFactor --------------------
    //#region -------------------- values, loadFactor --------------------

    //#region -------------------- values, loadFactor float --------------------

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                           final float loadFactor) { return ToHashSet.toHashSet(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                           final float loadFactor) { return ToHashSet.toHashSet(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final T @Nullable @Unmodifiable [] values,
                                                                           final float loadFactor) { return ToHashSet.toHashSet(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                           final float loadFactor) { return __newInstance(values, loadFactor); }

    //#endregion -------------------- values, loadFactor float --------------------
    //#region -------------------- values, loadFactor double --------------------

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                           final double loadFactor) { return __newInstance(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                           final double loadFactor) { return __newInstance(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final T @Nullable @Unmodifiable [] values,
                                                                           final double loadFactor) { return __newInstance(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                           final double loadFactor) { return __newInstance(values, loadFactor); }

    //#endregion -------------------- values, loadFactor double --------------------
    //#region -------------------- values, loadFactor float? --------------------

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                           final @Nullable Float loadFactor) { return ToHashSet.toHashSet(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                           final @Nullable Float loadFactor) { return ToHashSet.toHashSet(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final T @Nullable @Unmodifiable [] values,
                                                                           final @Nullable Float loadFactor) { return ToHashSet.toHashSet(values, loadFactor); }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                           final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return __newInstance(values);
        return __newInstance(values, loadFactor);
    }

    //#endregion -------------------- values, loadFactor float? --------------------
    //#region -------------------- values, loadFactor double? --------------------

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                           final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToHashSet.toHashSet(values);
        return __newInstance(values, loadFactor);
    }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                           final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToHashSet.toHashSet(values);
        return __newInstance(values, loadFactor);
    }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final T @Nullable @Unmodifiable [] values,
                                                                           final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return ToHashSet.toHashSet(values);
        return __newInstance(values, loadFactor);
    }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                           final @Nullable Double loadFactor) {
        if (loadFactor == null)
            return __newInstance(values);
        return __newInstance(values, loadFactor);
    }

    //#endregion -------------------- values, loadFactor double? --------------------
    //#region -------------------- values, loadFactor DoubleAdder? --------------------

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                           final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToHashSet.toHashSet(values);
        return __newInstance(values, loadFactor.sum());
    }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                           final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToHashSet.toHashSet(values);
        return __newInstance(values, loadFactor.sum());
    }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final T @Nullable @Unmodifiable [] values,
                                                                           final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return ToHashSet.toHashSet(values);
        return __newInstance(values, loadFactor.sum());
    }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                           final @Nullable DoubleAdder loadFactor) {
        if (loadFactor == null)
            return __newInstance(values);
        return __newInstance(values, loadFactor.sum());
    }

    //#endregion -------------------- values, loadFactor DoubleAdder? --------------------
    //#region -------------------- values, loadFactor DoubleAccumulator? --------------------

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                           final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToHashSet.toHashSet(values);
        return __newInstance(values, loadFactor.get());
    }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable CollectionHolder<? extends T> values,
                                                                           final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToHashSet.toHashSet(values);
        return __newInstance(values, loadFactor.get());
    }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final T @Nullable @Unmodifiable [] values,
                                                                           final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return ToHashSet.toHashSet(values);
        return __newInstance(values, loadFactor.get());
    }

    public static <T extends @Nullable Object> ImmutableHashSet<T> HashSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                           final @Nullable DoubleAccumulator loadFactor) {
        if (loadFactor == null)
            return __newInstance(values);
        return __newInstance(values, loadFactor.get());
    }

    //#endregion -------------------- values, loadFactor DoubleAccumulator? --------------------

    //#endregion -------------------- values, loadFactor --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    private static <T extends @Nullable Object> ImmutableHashSet<T> __newInstance(final double loadFactor) {
        if (isNaN(loadFactor))
            return new ImmutableHashSet<>();
        if (loadFactor <= 0.0D)
            return new ImmutableHashSet<>(DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return new ImmutableHashSet<>(MAX_FLOAT_VALUE);
        return new ImmutableHashSet<>((float) loadFactor);
    }


    private static <T extends @Nullable Object> ImmutableHashSet<T> __newInstance(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                  final double loadFactor) {
        if (isNaN(loadFactor))
            return ToHashSet.toHashSet(values);
        if (loadFactor <= 0.0D)
            return ToHashSet.toHashSet(values, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToHashSet.toHashSet(values, MAX_FLOAT_VALUE);
        return ToHashSet.toHashSet(values, (float) loadFactor);
    }

    private static <T extends @Nullable Object> ImmutableHashSet<T> __newInstance(final @Nullable CollectionHolder<? extends T> values,
                                                                                  final double loadFactor) {
        if (isNaN(loadFactor))
            return ToHashSet.toHashSet(values);
        if (loadFactor <= 0.0D)
            return ToHashSet.toHashSet(values, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToHashSet.toHashSet(values, MAX_FLOAT_VALUE);
        return ToHashSet.toHashSet(values, (float) loadFactor);
    }

    private static <T extends @Nullable Object> ImmutableHashSet<T> __newInstance(final T @Nullable @Unmodifiable [] values,
                                                                                  final double loadFactor) {
        if (isNaN(loadFactor))
            return ToHashSet.toHashSet(values);
        if (loadFactor <= 0.0D)
            return ToHashSet.toHashSet(values, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            return ToHashSet.toHashSet(values, MAX_FLOAT_VALUE);
        return ToHashSet.toHashSet(values, (float) loadFactor);
    }


    private static <T extends @Nullable Object> ImmutableHashSet<T> __newInstance(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyHashSet.getInstance();
        if (values.isEmpty())
            return EmptyHashSet.getInstance();
        return new ImmutableHashSet<>(values);
    }


    private static <T extends @Nullable Object> ImmutableHashSet<T> __newInstance(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                  final float loadFactor) {
        if (isNaN(loadFactor))
            if (values == null)
                return EmptyHashSet.getInstance();
            else if (values.isEmpty())
                return EmptyHashSet.getInstance();
            else
                return new ImmutableHashSet<>(values);
        if (loadFactor <= 0.0F)
            if (values == null)
                return EmptyHashSet.getInstance();
            else if (values.isEmpty())
                return EmptyHashSet.getInstance();
            else
                return new ImmutableHashSet<>(values, DEFAULT_SMALL_LOAD_FACTOR);
        if (values == null)
            return EmptyHashSet.getInstance();
        if (values.isEmpty())
            return EmptyHashSet.getInstance();
        return new ImmutableHashSet<>(values, loadFactor);
    }

    private static <T extends @Nullable Object> ImmutableHashSet<T> __newInstance(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                  final double loadFactor) {
        if (isNaN(loadFactor))
            if (values == null)
                return EmptyHashSet.getInstance();
            else if (values.isEmpty())
                return EmptyHashSet.getInstance();
            else
                return new ImmutableHashSet<>(values);
        if (loadFactor <= 0.0D)
            if (values == null)
                return EmptyHashSet.getInstance();
            else if (values.isEmpty())
                return EmptyHashSet.getInstance();
            else
                return new ImmutableHashSet<>(values, DEFAULT_SMALL_LOAD_FACTOR);
        if (loadFactor > MAX_FLOAT_VALUE_AS_DOUBLE)
            if (values == null)
                return EmptyHashSet.getInstance();
            else if (values.isEmpty())
                return EmptyHashSet.getInstance();
            else
                return new ImmutableHashSet<>(values, MAX_FLOAT_VALUE);
        if (values == null)
            return EmptyHashSet.getInstance();
        if (values.isEmpty())
            return EmptyHashSet.getInstance();
        return new ImmutableHashSet<>(values, (float) loadFactor);
    }
    //#endregion -------------------- Core methods --------------------

}
