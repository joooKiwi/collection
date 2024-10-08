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
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_2;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_3;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_4;

public final class IndexOfLastIndexed
        extends UtilityWithIndex {

    @Contract(ALWAYS_FAIL_0)
    private IndexOfLastIndexed() { throw new ImpossibleConstructionException("The utility class “IndexOfLastIndexed” cannot be constructed.", IndexOfLastIndexed.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- minimalist - predicate (int, T) → boolean --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- minimalist - predicate (int, T) → boolean --------------------
    //#region -------------------- predicate (int, T) → boolean --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate (int, T) → boolean --------------------

    //#region -------------------- minimalist - predicate (int) → boolean --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntPredicate predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- minimalist - predicate (int) → boolean --------------------
    //#region -------------------- predicate (int) → boolean --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntPredicate predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate (int) → boolean --------------------

    //#region -------------------- minimalist - predicate () → boolean --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- minimalist - predicate () → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate () → boolean --------------------


    //#region -------------------- minimalist - predicate (int, T) → boolean, from --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- minimalist - predicate (int, T) → boolean, from --------------------
    //#region -------------------- predicate (int, T) → boolean, from --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- predicate (int, T) → boolean, from --------------------

    //#region -------------------- minimalist - predicate (int) → boolean, from --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntPredicate predicate,
                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntPredicate predicate,
                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- minimalist - predicate (int) → boolean, from --------------------
    //#region -------------------- predicate (int) → boolean, from --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntPredicate predicate,
                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntPredicate predicate,
                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- predicate (int) → boolean,    from --------------------

    //#region -------------------- minimalist - predicate () → boolean, from --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- minimalist - predicate () → boolean, from --------------------
    //#region -------------------- predicate () → boolean, from --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                            final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                            final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- predicate () → boolean, from --------------------


    //#region -------------------- minimalist - predicate (int, T) → boolean, from, to --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                            final int fromIndex,
                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                            final int fromIndex,
                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                            final @Nullable Integer fromIndex,
                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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

    //#endregion -------------------- minimalist - predicate (int, T) → boolean, from, to --------------------
    //#region -------------------- predicate (int, T) → boolean, from, to --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                            final int fromIndex,
                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                            final int fromIndex,
                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntObjPredicate<? super T> predicate,
                                                                                            final @Nullable Integer fromIndex,
                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
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

    //#region -------------------- minimalist - predicate (int) → boolean, from, to --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntPredicate predicate,
                                                                                            final int fromIndex,
                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntPredicate predicate,
                                                                                            final int fromIndex,
                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntPredicate predicate,
                                                                                            final @Nullable Integer fromIndex,
                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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

    //#endregion -------------------- minimalist - predicate (int) → boolean, from, to --------------------
    //#region -------------------- predicate (int) → boolean, from, to --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntPredicate predicate,
                                                                                            final int fromIndex,
                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntPredicate predicate,
                                                                                            final int fromIndex,
                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull IntPredicate predicate,
                                                                                            final @Nullable Integer fromIndex,
                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
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

    //#region -------------------- minimalist - predicate () → boolean, from, to --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                            final int fromIndex,
                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                            final int fromIndex,
                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                            final @Nullable Integer fromIndex,
                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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

    //#endregion -------------------- minimalist - predicate () → boolean, from, to --------------------
    //#region -------------------- predicate () → boolean, from, to --------------------

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                            final int fromIndex,
                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                            final int fromIndex,
                                                                                            final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                            final @Nullable Integer fromIndex,
                                                                                            final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the last index matching the `predicate`
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
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

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull IntObjPredicate<? super T> predicate) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, 0, size - 1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection.isEmpty())
            return null;
        return __with2Argument(collection, predicate, -1, collection.size());
    }

    //#endregion -------------------- Core methods (predicate (int, T) → boolean) --------------------
    //#region -------------------- Core methods (predicate (int) → boolean) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull IntPredicate predicate) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(predicate, 0, size - 1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull IntPredicate predicate) {
        if (collection.isEmpty())
            return null;
        return __with1Argument(predicate, 0, collection.size() - 1);
    }

    //#endregion -------------------- Core methods (predicate (int) → boolean) --------------------
    //#region -------------------- Core methods (predicate () → boolean) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull BooleanSupplier predicate) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with0Argument(predicate, 0, size - 1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull BooleanSupplier predicate) {
        if (collection.isEmpty())
            return null;
        return __with0Argument(predicate, 0, collection.size() - 1);
    }

    //#endregion -------------------- Core methods (predicate () → boolean) --------------------

    //#region -------------------- Core methods (predicate (int, T) → boolean, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull IntObjPredicate<? super T> predicate,
                                                final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull IntObjPredicate<? super T> predicate,
                                                final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __with2Argument(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- Core methods (predicate (int, T) → boolean, from) --------------------
    //#region -------------------- Core methods (predicate (int) → boolean, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull IntPredicate predicate,
                                                final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(predicate, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull IntPredicate predicate,
                                                final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __with1Argument(predicate, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- Core methods (predicate (int) → boolean, from) --------------------
    //#region -------------------- Core methods (predicate () → boolean, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull BooleanSupplier predicate,
                                                final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with0Argument(predicate, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull BooleanSupplier predicate,
                                                final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __with0Argument(predicate, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- Core methods (predicate () → boolean, from) --------------------

    //#region -------------------- Core methods (predicate (int, T) → boolean, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
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

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
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

    //#endregion -------------------- Core methods (predicate (int, T) → boolean, from, to) --------------------
    //#region -------------------- Core methods (predicate (int) → boolean, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
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

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
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

    //#endregion -------------------- Core methods (predicate (int) → boolean, from, to) --------------------
    //#region -------------------- Core methods (predicate () → boolean, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
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

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
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

    //#endregion -------------------- Core methods (predicate () → boolean, from, to) --------------------

    //#region -------------------- Core methods (predicate (int, T) → boolean, to) --------------------

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull IntObjPredicate<? super T> predicate,
                                                          final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, 0, _endingIndex(toIndex, size));
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final @NotNull IntObjPredicate<? super T> predicate,
                                                          final int toIndex) {
        if (collection.isEmpty())
            return null;
        return __with2Argument(collection, predicate, 0, _endingIndex(toIndex, collection.size()));
    }

    //#endregion -------------------- Core methods (predicate (int, T) → boolean, to) --------------------
    //#region -------------------- Core methods (predicate (int) → boolean, to) --------------------

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull IntPredicate predicate,
                                                          final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(predicate, 0, _endingIndex(toIndex, size));
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final @NotNull IntPredicate predicate,
                                                          final int toIndex) {
        if (collection.isEmpty())
            return null;
        return __with1Argument(predicate, 0, _endingIndex(toIndex, collection.size()));
    }

    //#endregion -------------------- Core methods (predicate (int) → boolean, to) --------------------
    //#region -------------------- Core methods (predicate () → boolean, to) --------------------

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull BooleanSupplier predicate,
                                                          final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with0Argument(predicate, 0, _endingIndex(toIndex, size));
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final @NotNull BooleanSupplier predicate,
                                                          final int toIndex) {
        if (collection.isEmpty())
            return null;
        return __with0Argument(predicate, 0, _endingIndex(toIndex, collection.size()));
    }

    //#endregion -------------------- Core methods (predicate () → boolean, to) --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static @Nullable Integer __with0Argument(final @NotNull BooleanSupplier predicate,
                                                     final int startingIndex,
                                                     final int endingIndex) {
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            if (predicate.getAsBoolean())
                return index;
        return null;
    }

    private static @Nullable Integer __with1Argument(final @NotNull IntPredicate predicate,
                                                     final int startingIndex,
                                                     final int endingIndex) {
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            if (predicate.test(index))
                return index;
        return null;
    }

    private static <T> @Nullable Integer __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                         final @NotNull IntObjPredicate<? super T> predicate,
                                                         final int startingIndex,
                                                         final int endingIndex) {
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            if (predicate.test(index, collection.get(index)))
                return index;
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
