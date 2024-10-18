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
public final class IndexOfFirst
        extends UtilityWithIndex {

    @Contract(ALWAYS_FAIL_0)
    private IndexOfFirst() { throw new ImpossibleConstructionException("The utility class “IndexOfFirst” cannot be constructed.", IndexOfFirst.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
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
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#region -------------------- predicate (T, int) → boolean, from --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- predicate (T, int) → boolean, from --------------------
    //#region -------------------- predicate (T) → boolean, from --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- predicate (T) → boolean, from --------------------
    //#region -------------------- predicate () → boolean, from --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull BooleanSupplier predicate,
                                                                                      final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull BooleanSupplier predicate,
                                                                                      final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull BooleanSupplier predicate,
                                                                                      final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull BooleanSupplier predicate,
                                                                                      final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull BooleanSupplier predicate,
                                                                                      final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull BooleanSupplier predicate,
                                                                                      final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- predicate () → boolean, from --------------------

    //#region -------------------- predicate (T, int) → boolean, from, to --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final int fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final int fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final int fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final int fromIndex,
                                                                                      final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final int fromIndex,
                                                                                      final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final int fromIndex,
                                                                                      final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final @Nullable Integer fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final @Nullable Integer fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                      final @Nullable Integer fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
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
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
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
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull ObjIntPredicate<? super T> predicate,
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

    //#endregion -------------------- predicate (T, int) → boolean, from, to --------------------
    //#region -------------------- predicate (T) → boolean, from, to --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final int fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final int fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final int fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final int fromIndex,
                                                                                      final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final int fromIndex,
                                                                                      final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final int fromIndex,
                                                                                      final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final @Nullable Integer fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final @Nullable Integer fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
                                                                                      final @Nullable Integer fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
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
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
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
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull Predicate<? super T> predicate,
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

    //#endregion -------------------- predicate (T) → boolean, from, to --------------------
    //#region -------------------- predicate () → boolean, from, to --------------------

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @NotNull BooleanSupplier predicate,
                                                                                      final int fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @NotNull BooleanSupplier predicate,
                                                                                      final int fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @NotNull BooleanSupplier predicate,
                                                                                      final int fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }


    /// Get the first index matching the `predicate`
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
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
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
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
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
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
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
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
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final @Nullable CollectionHolder<? extends T> collection,
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
    /// or `null` if it was not in the current `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfFirst(final T @Nullable @Unmodifiable [] collection,
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

    //#region -------------------- Core methods (predicate (T, int) → boolean) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, 0, size - 1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection.isEmpty())
            return null;
        return __with2Argument(collection, predicate, 0, collection.size() - 1);
    }

    private static <T> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, 0, size - 1);
    }

    //#endregion -------------------- Core methods (predicate (T, int) → boolean) --------------------
    //#region -------------------- Core methods (predicate (T) → boolean) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, 0, size - 1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate) {
        if (collection.isEmpty())
            return null;
        return __with1Argument(collection, predicate, 0, collection.size() - 1);
    }

    private static <T> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                final @NotNull Predicate<? super T> predicate) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, 0, size - 1);
    }

    //#endregion -------------------- Core methods (predicate (T) → boolean) --------------------
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

    private static <T> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                final @NotNull BooleanSupplier predicate) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with0Argument(predicate, 0, size - 1);
    }

    //#endregion -------------------- Core methods (predicate () → boolean) --------------------

    //#region -------------------- Core methods (predicate (T, int) → boolean, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate,
                                                final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate,
                                                final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __with2Argument(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate,
                                                final int fromIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- Core methods (predicate (T, int) → boolean, from) --------------------
    //#region -------------------- Core methods (predicate (T) → boolean, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate,
                                                final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate,
                                                final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __with1Argument(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                final @NotNull Predicate<? super T> predicate,
                                                final int fromIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- Core methods (predicate (T) → boolean, from) --------------------
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

    private static <T> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                final @NotNull BooleanSupplier predicate,
                                                final int fromIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with0Argument(predicate, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- Core methods (predicate () → boolean, from) --------------------

    //#region -------------------- Core methods (predicate (T, int) → boolean, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate,
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
                                                final @NotNull ObjIntPredicate<? super T> predicate,
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

    private static <T> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate,
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

    //#endregion -------------------- Core methods (predicate (T, int) → boolean, from, to) --------------------
    //#region -------------------- Core methods (predicate (T) → boolean, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate,
                                                final int fromIndex,
                                                final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __with1Argument(collection, predicate, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate,
                                                final int fromIndex,
                                                final int toIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __with1Argument(collection, predicate, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                final @NotNull Predicate<? super T> predicate,
                                                final int fromIndex,
                                                final int toIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __with1Argument(collection, predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate (T) → boolean, from, to) --------------------
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

    private static <T> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
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

    //#region -------------------- Core methods (predicate (T, int) → boolean, to) --------------------

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull ObjIntPredicate<? super T> predicate,
                                                          final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, 0, _endingIndex(toIndex, size));
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final @NotNull ObjIntPredicate<? super T> predicate,
                                                          final int toIndex) {
        if (collection.isEmpty())
            return null;
        return __with2Argument(collection, predicate, 0, _endingIndex(toIndex, collection.size()));
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final T @NotNull @Unmodifiable [] collection,
                                                          final @NotNull ObjIntPredicate<? super T> predicate,
                                                          final int toIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, 0, _endingIndex(toIndex, size));
    }

    //#endregion -------------------- Core methods (predicate (T, int) → boolean, to) --------------------
    //#region -------------------- Core methods (predicate (T) → boolean, to) --------------------

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull Predicate<? super T> predicate,
                                                          final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, 0, _endingIndex(toIndex, size));
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final @NotNull Predicate<? super T> predicate,
                                                          final int toIndex) {
        if (collection.isEmpty())
            return null;
        return __with1Argument(collection, predicate, 0, _endingIndex(toIndex, collection.size()));
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final T @NotNull @Unmodifiable [] collection,
                                                          final @NotNull Predicate<? super T> predicate,
                                                          final int toIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, 0, _endingIndex(toIndex, size));
    }

    //#endregion -------------------- Core methods (predicate (T) → boolean, to) --------------------
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

    private static <T> @Nullable Integer __coreWithNoFrom(final T @NotNull @Unmodifiable [] collection,
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


    private static <T> @Nullable Integer __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                         final @NotNull Predicate<? super T> predicate,
                                                         final int startingIndex,
                                                         final int endingIndex) {
        var index = startingIndex;
        while (++index <= endingIndex)
            if (predicate.test(collection.get(index)))
                return index;
        return null;
    }

    private static <T> @Nullable Integer __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                         final @NotNull Predicate<? super T> predicate,
                                                         final int startingIndex,
                                                         final int endingIndex) {
        var index = startingIndex;
        while (++index <= endingIndex)
            if (predicate.test(collection[index]))
                return index;
        return null;
    }


    private static <T> @Nullable Integer __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                         final @NotNull ObjIntPredicate<? super T> predicate,
                                                         final int startingIndex,
                                                         final int endingIndex) {
        var index = startingIndex;
        while (++index <= endingIndex)
            if (predicate.test(collection.get(index), index))
                return index;
        return null;
    }

    private static <T> @Nullable Integer __with2Argument(final T @NotNull @Unmodifiable [] collection,
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
