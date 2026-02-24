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
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_2;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_3;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_4;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public final class FindLastIndexIndexedOrNull
        extends AliasUtility {

    @Contract(ALWAYS_FAIL_0)
    private FindLastIndexIndexedOrNull() { throw new ImpossibleConstructionException("The utility class “FindLastIndexIndexedOrNull” cannot be constructed.", FindLastIndexIndexedOrNull.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (int, T) → boolean --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate); }

    //#endregion -------------------- predicate (int, T) → boolean --------------------
    //#region -------------------- predicate (int) → boolean --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntPredicate predicate) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate); }

    //#endregion -------------------- predicate (int) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final BooleanSupplier predicate) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate); }

    //#endregion -------------------- predicate () → boolean --------------------

    //#region -------------------- predicate (int, T) → boolean, from --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final int from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final int from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final int from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }


    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final @Nullable Integer from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final @Nullable Integer from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final @Nullable Integer from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    //#endregion -------------------- predicate (int, T) → boolean, from --------------------
    //#region -------------------- predicate (int) → boolean, from --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final int from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final int from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final int from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }


    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final @Nullable Integer from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final @Nullable Integer from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final @Nullable Integer from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    //#endregion -------------------- predicate (int) → boolean, from --------------------
    //#region -------------------- predicate () → boolean, from --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final int from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final int from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final int from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }


    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final @Nullable Integer from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final @Nullable Integer from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final @Nullable Integer from) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from); }

    //#endregion -------------------- predicate () → boolean, from --------------------

    //#region -------------------- predicate (int, T) → boolean, from, to --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final int from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final int from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final int from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }


    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final int from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final int from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final int from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }


    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }


    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntObjPredicate<? super T> predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    //#endregion -------------------- predicate (int, T) → boolean, from, to --------------------
    //#region -------------------- predicate (int) → boolean, from, to --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final int from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final int from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final int from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }


    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final int from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final int from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final int from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }


    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }


    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final IntPredicate predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    //#endregion -------------------- predicate (int) → boolean, from, to --------------------
    //#region -------------------- predicate () → boolean, from, to --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final int from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final int from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final int from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }


    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final int from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final int from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final int from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }


    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }


    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final BooleanSupplier predicate,
                                                                                                                                 final @Nullable Integer from,
                                                                                                                                 final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(collection, predicate, from, to); }

    //#endregion -------------------- predicate () → boolean, from, to --------------------

    //#endregion -------------------- Facade methods --------------------

}
