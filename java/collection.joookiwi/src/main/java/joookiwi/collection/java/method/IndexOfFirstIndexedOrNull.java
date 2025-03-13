package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.IntPredicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.annotation.OnlyGivePositiveValue;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_2;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_3;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_4;

@NotNullByDefault
public final class IndexOfFirstIndexedOrNull
        extends UtilityWithIndex {

    @Contract(ALWAYS_FAIL_0)
    private IndexOfFirstIndexedOrNull() { throw new ImpossibleConstructionException("The utility class “IndexOfFirstIndexedOrNull” cannot be constructed.", IndexOfFirstIndexedOrNull.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (int, T) → boolean --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate (int, T) → boolean --------------------
    //#region -------------------- predicate (int) → boolean --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntPredicate predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate (int) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#region -------------------- predicate (int, T) → boolean, from --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- predicate (int, T) → boolean, from --------------------
    //#region -------------------- predicate (int) → boolean, from --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- predicate (int) → boolean, from --------------------
    //#region -------------------- predicate () → boolean, from --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- predicate () → boolean, from --------------------

    //#region -------------------- predicate (int, T) → boolean, from, to --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, fromIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, fromIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, fromIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    //#endregion -------------------- predicate (int, T) → boolean, from, to --------------------
    //#region -------------------- predicate (int) → boolean, from, to --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, fromIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, fromIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull IntPredicate predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, fromIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    //#endregion -------------------- predicate (int) → boolean, from, to --------------------
    //#region -------------------- predicate () → boolean, from, to --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final int fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, fromIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, fromIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index (`0` by default)
    /// @param toIndex    The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                                                            final @Nullable Integer fromIndex,
                                                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, fromIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    //#endregion -------------------- predicate () → boolean, from, to --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- Core methods (predicate (int, T) → boolean) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull IntObjPredicate<? super T> predicate) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, 0, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection.isEmpty())
            return null;
        return __with2Argument(collection, predicate, 0, collection.size() - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull IntObjPredicate<? super T> predicate) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, 0, size - 1);
    }

    //#endregion -------------------- Core methods (predicate (int, T) → boolean) --------------------
    //#region -------------------- Core methods (predicate (int) → boolean) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull IntPredicate predicate) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(predicate, 0, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull IntPredicate predicate) {
        if (collection.isEmpty())
            return null;
        return __with1Argument(predicate, 0, collection.size() - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull IntPredicate predicate) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with1Argument(predicate, 0, size - 1);
    }

    //#endregion -------------------- Core methods (predicate (int) → boolean) --------------------
    //#region -------------------- Core methods (predicate () → boolean) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull BooleanSupplier predicate) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with0Argument(predicate, 0, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull BooleanSupplier predicate) {
        if (collection.isEmpty())
            return null;
        return __with0Argument(predicate, 0, collection.size() - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull BooleanSupplier predicate) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with0Argument(predicate, 0, size - 1);
    }

    //#endregion -------------------- Core methods (predicate () → boolean) --------------------

    //#region -------------------- Core methods (predicate (int, T) → boolean, from) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull IntObjPredicate<? super T> predicate,
                                                                         final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull IntObjPredicate<? super T> predicate,
                                                                         final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __with2Argument(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull IntObjPredicate<? super T> predicate,
                                                                         final int fromIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- Core methods (predicate (int, T) → boolean, from) --------------------
    //#region -------------------- Core methods (predicate (int) → boolean, from) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull IntPredicate predicate,
                                                                         final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(predicate, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull IntPredicate predicate,
                                                                         final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __with1Argument(predicate, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull IntPredicate predicate,
                                                                         final int fromIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with1Argument(predicate, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- Core methods (predicate (int) → boolean, from) --------------------
    //#region -------------------- Core methods (predicate () → boolean, from) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull BooleanSupplier predicate,
                                                                         final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with0Argument(predicate, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull BooleanSupplier predicate,
                                                                         final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __with0Argument(predicate, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull BooleanSupplier predicate,
                                                                         final int fromIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with0Argument(predicate, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- Core methods (predicate () → boolean, from) --------------------

    //#region -------------------- Core methods (predicate (int, T) → boolean, from, to) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull IntObjPredicate<? super T> predicate,
                                                                         final int fromIndex,
                                                                         final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __with2Argument(collection, predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull IntObjPredicate<? super T> predicate,
                                                                         final int fromIndex,
                                                                         final int toIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __with2Argument(collection, predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull IntObjPredicate<? super T> predicate,
                                                                         final int fromIndex,
                                                                         final int toIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __with2Argument(collection, predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate (int, T) → boolean, from, to) --------------------
    //#region -------------------- Core methods (predicate (int) → boolean, from, to) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull IntPredicate predicate,
                                                                         final int fromIndex,
                                                                         final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __with1Argument(predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull IntPredicate predicate,
                                                                         final int fromIndex,
                                                                         final int toIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __with1Argument(predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull IntPredicate predicate,
                                                                         final int fromIndex,
                                                                         final int toIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __with1Argument(predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate (int) → boolean, from, to) --------------------
    //#region -------------------- Core methods (predicate () → boolean, from, to) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull BooleanSupplier predicate,
                                                                         final int fromIndex,
                                                                         final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __with0Argument(predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull BooleanSupplier predicate,
                                                                         final int fromIndex,
                                                                         final int toIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __with0Argument(predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull BooleanSupplier predicate,
                                                                         final int fromIndex,
                                                                         final int toIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __with0Argument(predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate () → boolean, from, to) --------------------

    //#region -------------------- Core methods (predicate (int, T) → boolean, to) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                   final @NotNull IntObjPredicate<? super T> predicate,
                                                                                   final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, 0, _endingIndex(toIndex, size));
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                                                   final @NotNull IntObjPredicate<? super T> predicate,
                                                                                   final int toIndex) {
        if (collection.isEmpty())
            return null;
        return __with2Argument(collection, predicate, 0, _endingIndex(toIndex, collection.size()));
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final T @NotNull @Unmodifiable [] collection,
                                                                                   final @NotNull IntObjPredicate<? super T> predicate,
                                                                                   final int toIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, 0, _endingIndex(toIndex, size));
    }

    //#endregion -------------------- Core methods (predicate (int, T) → boolean, to) --------------------
    //#region -------------------- Core methods (predicate (int) → boolean, to) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                   final @NotNull IntPredicate predicate,
                                                                                   final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(predicate, 0, _endingIndex(toIndex, size));
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                                                   final @NotNull IntPredicate predicate,
                                                                                   final int toIndex) {
        if (collection.isEmpty())
            return null;
        return __with1Argument(predicate, 0, _endingIndex(toIndex, collection.size()));
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final T @NotNull @Unmodifiable [] collection,
                                                                                   final @NotNull IntPredicate predicate,
                                                                                   final int toIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with1Argument(predicate, 0, _endingIndex(toIndex, size));
    }

    //#endregion -------------------- Core methods (predicate (int) → boolean, to) --------------------
    //#region -------------------- Core methods (predicate () → boolean, to) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                   final @NotNull BooleanSupplier predicate,
                                                                                   final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with0Argument(predicate, 0, _endingIndex(toIndex, size));
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                                                   final @NotNull BooleanSupplier predicate,
                                                                                   final int toIndex) {
        if (collection.isEmpty())
            return null;
        return __with0Argument(predicate, 0, _endingIndex(toIndex, collection.size()));
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final T @NotNull @Unmodifiable [] collection,
                                                                                   final @NotNull BooleanSupplier predicate,
                                                                                   final int toIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with0Argument(predicate, 0, _endingIndex(toIndex, size));
    }

    //#endregion -------------------- Core methods (predicate () → boolean, to) --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static @Nullable Integer __with0Argument(final @NotNull BooleanSupplier predicate,
                                                     final int startingIndex,
                                                     final int endingIndex) {
        var index = startingIndex;
        while (++index <= endingIndex)
            if (predicate.getAsBoolean())
                return index;
        return null;
    }


    private static @Nullable Integer __with1Argument(final @NotNull IntPredicate predicate,
                                                     final int startingIndex,
                                                     final int endingIndex) {
        var index = startingIndex;
        while (++index <= endingIndex)
            if (predicate.test(index))
                return index;
        return null;
    }


    private static <T extends @Nullable Object> @Nullable Integer __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                  final @NotNull IntObjPredicate<? super T> predicate,
                                                                                  final int startingIndex,
                                                                                  final int endingIndex) {
        var index = startingIndex;
        while (++index <= endingIndex)
            if (predicate.test(index, collection.get(index)))
                return index;
        return null;
    }

    private static <T extends @Nullable Object> @Nullable Integer __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                                                  final @NotNull IntObjPredicate<? super T> predicate,
                                                                                  final int startingIndex,
                                                                                  final int endingIndex) {
        var index = startingIndex;
        while (++index <= endingIndex)
            if (predicate.test(index, collection[index]))
                return index;
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
