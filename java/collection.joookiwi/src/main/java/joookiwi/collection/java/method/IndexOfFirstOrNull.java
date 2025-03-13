package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.annotation.OnlyGivePositiveValue;
import joookiwi.collection.java.callback.ObjIntPredicate;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
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
public final class IndexOfFirstOrNull
        extends UtilityWithIndex {

    @Contract(ALWAYS_FAIL_0)
    private IndexOfFirstOrNull() { throw new ImpossibleConstructionException("The utility class “IndexOfFirstOrNull” cannot be constructed.", IndexOfFirstOrNull.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate) {
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate) {
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate) {
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate) {
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#region -------------------- predicate (T, int) → boolean, from --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final int from) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final int from) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final int from) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from) {
        if (collection == null)
            return null;
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from) {
        if (collection == null)
            return null;
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from) {
        if (collection == null)
            return null;
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    //#endregion -------------------- predicate (T, int) → boolean, from --------------------
    //#region -------------------- predicate (T) → boolean, from --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final int from) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final int from) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final int from) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from) {
        if (collection == null)
            return null;
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from) {
        if (collection == null)
            return null;
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from) {
        if (collection == null)
            return null;
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    //#endregion -------------------- predicate (T) → boolean, from --------------------
    //#region -------------------- predicate () → boolean, from --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final int from) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final int from) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final int from) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final @Nullable Integer from) {
        if (collection == null)
            return null;
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final @Nullable Integer from) {
        if (collection == null)
            return null;
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final @Nullable Integer from) {
        if (collection == null)
            return null;
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    //#endregion -------------------- predicate () → boolean, from --------------------

    //#region -------------------- predicate (T, int) → boolean, from, to --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final int from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final int from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final int from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from, to);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final int from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final int from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final int from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    //#endregion -------------------- predicate (T, int) → boolean, from, to --------------------
    //#region -------------------- predicate (T) → boolean, from, to --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final int from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final int from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final int from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from, to);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final int from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final int from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final int from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    //#endregion -------------------- predicate (T) → boolean, from, to --------------------
    //#region -------------------- predicate () → boolean, from, to --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final int from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final int from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final int from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        return __core(collection, predicate, from, to);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final int from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final int from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final int from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final int to) {
        if (collection == null)
            return null;
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirstOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                                                     final @Nullable Integer from,
                                                                                                                     final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    //#endregion -------------------- predicate () → boolean, from, to --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- Core methods (predicate (T, int) → boolean) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull ObjIntPredicate<? super T> predicate) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, 0, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection.isEmpty())
            return null;
        return __with2Argument(collection, predicate, 0, collection.size() - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull ObjIntPredicate<? super T> predicate) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, 0, size - 1);
    }

    //#endregion -------------------- Core methods (predicate (T, int) → boolean) --------------------
    //#region -------------------- Core methods (predicate (T) → boolean) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull Predicate<? super T> predicate) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, 0, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull Predicate<? super T> predicate) {
        if (collection.isEmpty())
            return null;
        return __with1Argument(collection, predicate, 0, collection.size() - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull Predicate<? super T> predicate) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, 0, size - 1);
    }

    //#endregion -------------------- Core methods (predicate (T) → boolean) --------------------
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

    //#region -------------------- Core methods (predicate (T, int) → boolean, from) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull ObjIntPredicate<? super T> predicate,
                                                                         final int from) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;
        return __with2Argument(collection, predicate, startingIndex, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull ObjIntPredicate<? super T> predicate,
                                                                         final int from) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;
        return __with2Argument(collection, predicate, startingIndex, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull ObjIntPredicate<? super T> predicate,
                                                                         final int from) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;
        return __with2Argument(collection, predicate, startingIndex, size - 1);
    }

    //#endregion -------------------- Core methods (predicate (T, int) → boolean, from) --------------------
    //#region -------------------- Core methods (predicate (T) → boolean, from) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull Predicate<? super T> predicate,
                                                                         final int from) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;
        return __with1Argument(collection, predicate, startingIndex, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull Predicate<? super T> predicate,
                                                                         final int from) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;
        return __with1Argument(collection, predicate, startingIndex, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull Predicate<? super T> predicate,
                                                                         final int from) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;
        return __with1Argument(collection, predicate, startingIndex, size - 1);
    }

    //#endregion -------------------- Core methods (predicate (T) → boolean, from) --------------------
    //#region -------------------- Core methods (predicate () → boolean, from) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull BooleanSupplier predicate,
                                                                         final int from) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;
        return __with0Argument(predicate, startingIndex, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull BooleanSupplier predicate,
                                                                         final int from) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;
        return __with0Argument(predicate, startingIndex, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull BooleanSupplier predicate,
                                                                         final int from) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;
        return __with0Argument(predicate, startingIndex, size - 1);
    }

    //#endregion -------------------- Core methods (predicate () → boolean, from) --------------------

    //#region -------------------- Core methods (predicate (T, int) → boolean, from, to) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull ObjIntPredicate<? super T> predicate,
                                                                         final int from,
                                                                         final int to) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        if (endingIndex < startingIndex)
            return null;
        return __with2Argument(collection, predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull ObjIntPredicate<? super T> predicate,
                                                                         final int from,
                                                                         final int to) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        if (endingIndex < startingIndex)
            return null;
        return __with2Argument(collection, predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull ObjIntPredicate<? super T> predicate,
                                                                         final int from,
                                                                         final int to) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        if (endingIndex < startingIndex)
            return null;
        return __with2Argument(collection, predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate (T, int) → boolean, from, to) --------------------
    //#region -------------------- Core methods (predicate (T) → boolean, from, to) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull Predicate<? super T> predicate,
                                                                         final int from,
                                                                         final int to) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        if (endingIndex < startingIndex)
            return null;
        return __with1Argument(collection, predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull Predicate<? super T> predicate,
                                                                         final int from,
                                                                         final int to) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        if (endingIndex < startingIndex)
            return null;
        return __with1Argument(collection, predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull Predicate<? super T> predicate,
                                                                         final int from,
                                                                         final int to) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        if (endingIndex < startingIndex)
            return null;
        return __with1Argument(collection, predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate (T) → boolean, from, to) --------------------
    //#region -------------------- Core methods (predicate () → boolean, from, to) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final @NotNull BooleanSupplier predicate,
                                                                         final int from,
                                                                         final int to) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        if (endingIndex < startingIndex)
            return null;
        return __with0Argument(predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                         final @NotNull BooleanSupplier predicate,
                                                                         final int from,
                                                                         final int to) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        if (endingIndex < startingIndex)
            return null;
        return __with0Argument(predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                                         final @NotNull BooleanSupplier predicate,
                                                                         final int from,
                                                                         final int to) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        if (endingIndex < startingIndex)
            return null;
        return __with0Argument(predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate () → boolean, from, to) --------------------

    //#region -------------------- Core methods (predicate (T, int) → boolean, to) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                   final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                   final int to) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        return __with2Argument(collection, predicate, 0, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                                                   final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                   final int to) {
        if (collection.isEmpty())
            return null;

        final var endingIndex = _endingIndexOrNull(to, collection.size());
        if (endingIndex == null)
            return null;
        return __with2Argument(collection, predicate, 0, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final T @NotNull @Unmodifiable [] collection,
                                                                                   final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                   final int to) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        return __with2Argument(collection, predicate, 0, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate (T, int) → boolean, to) --------------------
    //#region -------------------- Core methods (predicate (T) → boolean, to) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                   final @NotNull Predicate<? super T> predicate,
                                                                                   final int to) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        return __with1Argument(collection, predicate, 0, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                                                   final @NotNull Predicate<? super T> predicate,
                                                                                   final int to) {
        if (collection.isEmpty())
            return null;

        final var endingIndex = _endingIndexOrNull(to, collection.size());
        if (endingIndex == null)
            return null;
        return __with1Argument(collection, predicate, 0, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final T @NotNull @Unmodifiable [] collection,
                                                                                   final @NotNull Predicate<? super T> predicate,
                                                                                   final int to) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        return __with1Argument(collection, predicate, 0, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate (T) → boolean, to) --------------------
    //#region -------------------- Core methods (predicate () → boolean, to) --------------------

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                   final @NotNull BooleanSupplier predicate,
                                                                                   final int to) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        return __with0Argument(predicate, 0, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                                                   final @NotNull BooleanSupplier predicate,
                                                                                   final int to) {
        if (collection.isEmpty())
            return null;

        final var endingIndex = _endingIndexOrNull(to, collection.size());
        if (endingIndex == null)
            return null;
        return __with0Argument(predicate, 0, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final T @NotNull @Unmodifiable [] collection,
                                                                                   final @NotNull BooleanSupplier predicate,
                                                                                   final int to) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        return __with0Argument(predicate, 0, endingIndex);
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


    private static <T extends @Nullable Object> @Nullable Integer __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                  final @NotNull Predicate<? super T> predicate,
                                                                                  final int startingIndex,
                                                                                  final int endingIndex) {
        var index = startingIndex;
        while (++index <= endingIndex)
            if (predicate.test(collection.get(index)))
                return index;
        return null;
    }

    private static <T extends @Nullable Object> @Nullable Integer __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                                                  final @NotNull Predicate<? super T> predicate,
                                                                                  final int startingIndex,
                                                                                  final int endingIndex) {
        var index = startingIndex;
        while (++index <= endingIndex)
            if (predicate.test(collection[index]))
                return index;
        return null;
    }


    private static <T extends @Nullable Object> @Nullable Integer __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                  final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                  final int startingIndex,
                                                                                  final int endingIndex) {
        var index = startingIndex;
        while (++index <= endingIndex)
            if (predicate.test(collection.get(index), index))
                return index;
        return null;
    }

    private static <T extends @Nullable Object> @Nullable Integer __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                                                  final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                  final int startingIndex,
                                                                                  final int endingIndex) {
        var index = startingIndex;
        while (++index <= endingIndex)
            if (predicate.test(collection[index], index))
                return index;
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
