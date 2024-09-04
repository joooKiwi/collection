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
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_2;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_3;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_4;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_5;

public final class IndexOfLast
        extends UtilityWithIndex {

    @Contract(ALWAYS_FAIL_0)
    private IndexOfLast() { throw new ImpossibleConstructionException("The utility class “IndexOfLast” cannot be constructed.", IndexOfLast.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- minimalist - predicate (T, int) → boolean --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- minimalist - predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T, int) → boolean --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------

    //#region -------------------- minimalist - predicate (T) → boolean --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- minimalist - predicate (T) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------

    //#region -------------------- minimalist - predicate () → boolean --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- minimalist - predicate () → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate () → boolean --------------------


    //#region -------------------- minimalist - predicate (T, int) → boolean, from --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- minimalist - predicate (T, int) → boolean, from --------------------
    //#region -------------------- predicate (T, int) → boolean, from --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- predicate (T, int) → boolean, from --------------------

    //#region -------------------- minimalist - predicate (T) → boolean, from --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- minimalist - predicate (T) → boolean, from --------------------
    //#region -------------------- predicate (T) → boolean, from --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- predicate (T) → boolean, from --------------------

    //#region -------------------- minimalist - predicate () → boolean, from --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, predicate);
        return __core(collection, predicate, fromIndex);
    }

    //#endregion -------------------- predicate () → boolean, from --------------------


    //#region -------------------- minimalist - predicate (T, int) → boolean, from, to --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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

    //#endregion -------------------- minimalist - predicate (T, int) → boolean, from, to --------------------
    //#region -------------------- predicate (T, int) → boolean, from, to --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
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

    //#region -------------------- minimalist - predicate (T) → boolean, from, to --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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

    //#endregion -------------------- minimalist - predicate (T) → boolean, from, to --------------------
    //#region -------------------- predicate (T) → boolean, from, to --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
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

    //#region -------------------- minimalist - predicate () → boolean, from, to --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, predicate, fromIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex);
        return __core(collection, predicate, fromIndex, toIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
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


    //#region -------------------- minimalist - predicate (T, int) → boolean, from, to, limit --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
                return __core(collection, predicate, fromIndex, toIndex);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __coreWithNoTo(collection, predicate, fromIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                return __core(collection, predicate, fromIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            return __coreWithNoTo(collection, predicate, fromIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (fromIndex == null)
                return __coreWithNoFrom(collection, predicate, toIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, predicate, limit);
            else
                return __coreWithNoTo(collection, predicate, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __core(collection, predicate);
                else
                    return __core(collection, predicate, fromIndex);
            else if (fromIndex == null)
                return __coreWithNoFrom(collection, predicate, toIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, predicate, limit);
            else
                return __coreWithNoTo(collection, predicate, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    //#endregion -------------------- minimalist - predicate (T, int) → boolean, from, to, limit --------------------
    //#region -------------------- predicate (T, int) → boolean, from, to, limit --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            return __core(collection, predicate, fromIndex, toIndex);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __coreWithNoTo(collection, predicate, fromIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                return __core(collection, predicate, fromIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            return __coreWithNoTo(collection, predicate, fromIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (fromIndex == null)
                return __coreWithNoFrom(collection, predicate, toIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, predicate, limit);
            else
                return __coreWithNoTo(collection, predicate, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __core(collection, predicate);
                else
                    return __core(collection, predicate, fromIndex);
            else if (fromIndex == null)
                return __coreWithNoFrom(collection, predicate, toIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, predicate, limit);
            else
                return __coreWithNoTo(collection, predicate, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    //#endregion -------------------- predicate (T, int) → boolean, from, to, limit --------------------

    //#region -------------------- minimalist - predicate (T) → boolean, from, to, limit --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            return __core(collection, predicate, fromIndex, toIndex);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __coreWithNoTo(collection, predicate, fromIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                return __core(collection, predicate, fromIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            return __coreWithNoTo(collection, predicate, fromIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (fromIndex == null)
                return __coreWithNoFrom(collection, predicate, toIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, predicate, limit);
            else
                return __coreWithNoTo(collection, predicate, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __core(collection, predicate);
                else
                    return __core(collection, predicate, fromIndex);
            else if (fromIndex == null)
                return __coreWithNoFrom(collection, predicate, toIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, predicate, limit);
            else
                return __coreWithNoTo(collection, predicate, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    //#endregion -------------------- minimalist - predicate (T) → boolean, from, to, limit --------------------
    //#region -------------------- predicate (T) → boolean, from, to, limit --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            return __core(collection, predicate, fromIndex, toIndex);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __coreWithNoTo(collection, predicate, fromIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                return __core(collection, predicate, fromIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            return __coreWithNoTo(collection, predicate, fromIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (fromIndex == null)
                return __coreWithNoFrom(collection, predicate, toIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, predicate, limit);
            else
                return __coreWithNoTo(collection, predicate, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull Predicate<? super T> predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __core(collection, predicate);
                else
                    return __core(collection, predicate, fromIndex);
            else if (fromIndex == null)
                return __coreWithNoFrom(collection, predicate, toIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, predicate, limit);
            else
                return __coreWithNoTo(collection, predicate, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    //#endregion -------------------- predicate (T) → boolean, from, to, limit --------------------

    //#region -------------------- minimalist - predicate () → boolean, from, to, limit --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            return __core(collection, predicate, fromIndex, toIndex);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __coreWithNoTo(collection, predicate, fromIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                return __core(collection, predicate, fromIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            return __coreWithNoTo(collection, predicate, fromIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (fromIndex == null)
                return __coreWithNoFrom(collection, predicate, toIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, predicate, limit);
            else
                return __coreWithNoTo(collection, predicate, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __core(collection, predicate);
                else
                    return __core(collection, predicate, fromIndex);
            else if (fromIndex == null)
                return __coreWithNoFrom(collection, predicate, toIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, predicate, limit);
            else
                return __coreWithNoTo(collection, predicate, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    //#endregion -------------------- minimalist - predicate () → boolean, from, to, limit --------------------
    //#region -------------------- predicate () → boolean, from, to, limit --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            return __core(collection, predicate, fromIndex, toIndex);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __coreWithNoTo(collection, predicate, fromIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                return __core(collection, predicate, fromIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            return __coreWithNoTo(collection, predicate, fromIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (fromIndex == null)
                return __coreWithNoFrom(collection, predicate, toIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, predicate, limit);
            else
                return __coreWithNoTo(collection, predicate, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @NotNull BooleanSupplier predicate,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __core(collection, predicate);
                else
                    return __core(collection, predicate, fromIndex);
            else if (fromIndex == null)
                return __coreWithNoFrom(collection, predicate, toIndex);
            else
                return __core(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, predicate, limit);
            else
                return __coreWithNoTo(collection, predicate, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, predicate, toIndex, limit);
        return __core(collection, predicate, fromIndex, toIndex, limit);
    }

    //#endregion -------------------- predicate () → boolean, from, to, limit --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- Core methods (minimalist - predicate (T, int) → boolean) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __withoutALimit(collection, predicate, 0, size);
    }

    //#endregion -------------------- Core methods (minimalist - predicate (T, int) → boolean) --------------------
    //#region -------------------- Core methods (predicate (T, int) → boolean) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection.isEmpty())
            return null;
        return __withoutALimit(collection, predicate, 0, collection.size());
    }

    //#endregion -------------------- Core methods (predicate (T, int) → boolean) --------------------

    //#region -------------------- Core methods (minimalist - predicate (T) → boolean) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __withoutALimit(collection, predicate, 0, size);
    }

    //#endregion -------------------- Core methods (minimalist - predicate (T) → boolean) --------------------
    //#region -------------------- Core methods (predicate (T) → boolean) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate) {
        if (collection.isEmpty())
            return null;
        return __withoutALimit(collection, predicate, 0, collection.size());
    }

    //#endregion -------------------- Core methods (predicate (T) → boolean) --------------------

    //#region -------------------- Core methods (minimalist - predicate () → boolean) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull BooleanSupplier predicate) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __withoutALimit(predicate, 0, size);
    }

    //#endregion -------------------- Core methods (minimalist - predicate () → boolean) --------------------
    //#region -------------------- Core methods (predicate () → boolean) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull BooleanSupplier predicate) {
        if (collection.isEmpty())
            return null;
        return __withoutALimit(predicate, 0, collection.size());
    }

    //#endregion -------------------- Core methods (predicate () → boolean) --------------------


    //#region -------------------- Core methods (minimalist - predicate (T, int) → boolean, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate,
                                                final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __withoutALimit(collection, predicate, _startingIndex(fromIndex, size), size);
    }

    //#endregion -------------------- Core methods (minimalist - predicate (T, int) → boolean, from) --------------------
    //#region -------------------- Core methods (predicate (T, int) → boolean, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate,
                                                final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __withoutALimit(collection, predicate, _startingIndex(fromIndex, size), size);
    }

    //#endregion -------------------- Core methods (predicate (T, int) → boolean, from) --------------------

    //#region -------------------- Core methods (minimalist - predicate (T) → boolean, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate,
                                                final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __withoutALimit(collection, predicate, _startingIndex(fromIndex, size), size);
    }

    //#endregion -------------------- Core methods (minimalist - predicate (T) → boolean, from) --------------------
    //#region -------------------- Core methods (predicate (T) → boolean, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate,
                                                final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __withoutALimit(collection, predicate, _startingIndex(fromIndex, size), size);
    }

    //#endregion -------------------- Core methods (predicate (T) → boolean, from0 --------------------

    //#region -------------------- Core methods (minimalist - predicate () → boolean, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull BooleanSupplier predicate,
                                                final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;

        return __withoutALimit(predicate, _startingIndex(fromIndex, size), size);
    }

    //#endregion -------------------- Core methods (minimalist - predicate () → boolean, from) --------------------
    //#region -------------------- Core methods (predicate () → boolean, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull BooleanSupplier predicate,
                                                final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __withoutALimit(predicate, _startingIndex(fromIndex, size), size);
    }

    //#endregion -------------------- Core methods (predicate () → boolean, from) --------------------


    //#region -------------------- Core methods (minimalist - predicate (T, int) → boolean, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate,
                                                final int fromIndex,
                                                final int toIndex) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(collection, predicate, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull ObjIntPredicate<? super T> predicate,
                                                          final int toIndex) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        final var endingIndex = _endingIndex(toIndex, size);
        return __withoutALimit(collection, predicate, 0, endingIndex);
    }

    //#endregion -------------------- Core methods (minimalist - predicate (T, int) → boolean, from, to) --------------------
    //#region -------------------- Core methods (predicate (T, int) → boolean, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate,
                                                final int fromIndex,
                                                final int toIndex) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(collection, predicate, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final @NotNull ObjIntPredicate<? super T> predicate,
                                                          final int toIndex) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        final var endingIndex = _endingIndex(toIndex, collection.size());
        return __withoutALimit(collection, predicate, 0, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate (T, int) → boolean, from, to) --------------------

    //#region -------------------- Core methods (minimalist - predicate (T) → boolean, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate,
                                                final int fromIndex,
                                                final int toIndex) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(collection, predicate, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull Predicate<? super T> predicate,
                                                          final int toIndex) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        final var endingIndex = _endingIndex(toIndex, size);
        return __withoutALimit(collection, predicate, 0, endingIndex);
    }

    //#endregion -------------------- Core methods (minimalist - predicate (T) → boolean, from, to) --------------------
    //#region -------------------- Core methods (predicate (T) → boolean, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate,
                                                final int fromIndex,
                                                final int toIndex) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(collection, predicate, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final @NotNull Predicate<? super T> predicate,
                                                          final int toIndex) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        final var endingIndex = _endingIndex(toIndex, collection.size());
        return __withoutALimit(collection, predicate, 0, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate (T) → boolean, from, to) --------------------

    //#region -------------------- Core methods (minimalist - predicate () → boolean, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull BooleanSupplier predicate,
                                                final int fromIndex,
                                                final int toIndex) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(predicate, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull BooleanSupplier predicate,
                                                          final int toIndex) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        final var endingIndex = _endingIndex(toIndex, size);
        return __withoutALimit(predicate, 0, endingIndex);
    }

    //#endregion -------------------- Core methods (minimalist - predicate () → boolean, from, to) --------------------
    //#region -------------------- Core methods (predicate () → boolean, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull BooleanSupplier predicate,
                                                final int fromIndex,
                                                final int toIndex) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(predicate, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final @NotNull BooleanSupplier predicate,
                                                          final int toIndex) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        final var endingIndex = _endingIndex(toIndex, collection.size());
        return __withoutALimit(predicate, 0, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate () → boolean, from, to) --------------------


    //#region -------------------- Core methods (minimalist - predicate (T, int) → boolean, from, to, limit --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate,
                                                final int fromIndex,
                                                final int toIndex,
                                                final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, fromIndex, toIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection, predicate, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull ObjIntPredicate<? super T> predicate,
                                                          final int toIndex,
                                                          final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (ending/maximum index) --------------------

        final var endingIndex = _endingIndex(toIndex, size);
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, 0, toIndex);
        if (maximumIndex > endingIndex)
            return null;

        //#endregion -------------------- Initialization (ending/maximum index) --------------------

        return __withALimit(collection, predicate, 0, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoTo(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                        final @NotNull ObjIntPredicate<? super T> predicate,
                                                        final int fromIndex,
                                                        final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/maximum index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = size - 1;
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, fromIndex, endingIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/maximum index) --------------------

        return __withALimit(collection, predicate, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFromAndTo(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                               final @NotNull ObjIntPredicate<? super T> predicate,
                                                               final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (maximum index) --------------------

        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex > size)
            return null;

        //#endregion -------------------- Initialization (maximum index) --------------------

        return __withALimit(collection, predicate, 0, size - 1, maximumIndex);
    }

    //#endregion -------------------- Core methods (minimalist - predicate (T, int) → boolean, from, to, limit --------------------
    //#region -------------------- Core methods (predicate (T, int) → boolean, from, to, limit --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull ObjIntPredicate<? super T> predicate,
                                                final int fromIndex,
                                                final int toIndex,
                                                final int limit) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, fromIndex, toIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection, predicate, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final @NotNull ObjIntPredicate<? super T> predicate,
                                                          final int toIndex,
                                                          final int limit) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (ending/maximum index) --------------------

        final var size = collection.size();
        final var endingIndex = _endingIndex(toIndex, size);
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, 0, toIndex);
        if (maximumIndex > endingIndex)
            return null;

        //#endregion -------------------- Initialization (ending/maximum index) --------------------

        return __withALimit(collection, predicate, 0, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoTo(final @NotNull CollectionHolder<? extends T> collection,
                                                        final @NotNull ObjIntPredicate<? super T> predicate,
                                                        final int fromIndex,
                                                        final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/maximum index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = size - 1;
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, fromIndex, endingIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/maximum index) --------------------

        return __withALimit(collection, predicate, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFromAndTo(final @NotNull CollectionHolder<? extends T> collection,
                                                               final @NotNull ObjIntPredicate<? super T> predicate,
                                                               final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (maximum index) --------------------

        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex > size)
            return null;

        //#endregion -------------------- Initialization (maximum index) --------------------

        return __withALimit(collection, predicate, 0, size - 1, maximumIndex);
    }

    //#endregion -------------------- Core methods (predicate (T, int) → boolean, from, to, limit) --------------------

    //#region -------------------- Core methods (minimalist - predicate (T) → boolean, from, to, limit) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate,
                                                final int fromIndex,
                                                final int toIndex,
                                                final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, fromIndex, toIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection, predicate, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull Predicate<? super T> predicate,
                                                          final int toIndex,
                                                          final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (ending/maximum index) --------------------

        final var endingIndex = _endingIndex(toIndex, size);
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, 0, toIndex);
        if (maximumIndex > endingIndex)
            return null;

        //#endregion -------------------- Initialization (ending/maximum index) --------------------

        return __withALimit(collection, predicate, 0, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoTo(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                        final @NotNull Predicate<? super T> predicate,
                                                        final int fromIndex,
                                                        final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/maximum index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = size - 1;
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, fromIndex, endingIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/maximum index) --------------------

        return __withALimit(collection, predicate, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFromAndTo(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                               final @NotNull Predicate<? super T> predicate,
                                                               final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (maximum index) --------------------

        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex > size)
            return null;

        //#endregion -------------------- Initialization (maximum index) --------------------

        return __withALimit(collection, predicate, 0, size - 1, maximumIndex);
    }

    //#endregion -------------------- Core methods (minimalist - predicate (T) → boolean, from, to, limit) --------------------
    //#region -------------------- Core methods (predicate (T) → boolean, from, to, limit) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull Predicate<? super T> predicate,
                                                final int fromIndex,
                                                final int toIndex,
                                                final int limit) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, fromIndex, toIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection, predicate, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final @NotNull Predicate<? super T> predicate,
                                                          final int toIndex,
                                                          final int limit) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (ending/maximum index) --------------------

        final var size = collection.size();
        final var endingIndex = _endingIndex(toIndex, size);
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, 0, toIndex);
        if (maximumIndex > endingIndex)
            return null;

        //#endregion -------------------- Initialization (ending/maximum index) --------------------

        return __withALimit(collection, predicate, 0, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoTo(final @NotNull CollectionHolder<? extends T> collection,
                                                        final @NotNull Predicate<? super T> predicate,
                                                        final int fromIndex,
                                                        final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/maximum index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = size - 1;
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, fromIndex, endingIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/maximum index) --------------------

        return __withALimit(collection, predicate, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFromAndTo(final @NotNull CollectionHolder<? extends T> collection,
                                                               final @NotNull Predicate<? super T> predicate,
                                                               final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (maximum index) --------------------

        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex > size)
            return null;

        //#endregion -------------------- Initialization (maximum index) --------------------

        return __withALimit(collection, predicate, 0, size - 1, maximumIndex);
    }

    //#endregion -------------------- Core methods (predicate (T) → boolean, from, to, limit) --------------------

    //#region -------------------- Core methods (minimalist - predicate () → boolean, from, to, limit) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @NotNull BooleanSupplier predicate,
                                                final int fromIndex,
                                                final int toIndex,
                                                final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(predicate, fromIndex, toIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(predicate, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull BooleanSupplier predicate,
                                                          final int toIndex,
                                                          final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (ending/maximum index) --------------------

        final var endingIndex = _endingIndex(toIndex, size);
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(predicate, 0, toIndex);
        if (maximumIndex > endingIndex)
            return null;

        //#endregion -------------------- Initialization (ending/maximum index) --------------------

        return __withALimit(predicate, 0, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoTo(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                        final @NotNull BooleanSupplier predicate,
                                                        final int fromIndex,
                                                        final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/maximum index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = size - 1;
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(predicate, fromIndex, endingIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/maximum index) --------------------

        return __withALimit(predicate, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFromAndTo(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                               final @NotNull BooleanSupplier predicate,
                                                               final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (maximum index) --------------------

        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex > size)
            return null;

        //#endregion -------------------- Initialization (maximum index) --------------------

        return __withALimit(predicate, 0, size - 1, maximumIndex);
    }

    //#endregion -------------------- Core methods (minimalist - predicate () → boolean, from, to, limit) --------------------
    //#region -------------------- Core methods (predicate () → boolean, from, to, limit) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @NotNull BooleanSupplier predicate,
                                                final int fromIndex,
                                                final int toIndex,
                                                final int limit) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(predicate, fromIndex, toIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(predicate, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final @NotNull BooleanSupplier predicate,
                                                          final int toIndex,
                                                          final int limit) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (ending/maximum index) --------------------

        final var size = collection.size();
        final var endingIndex = _endingIndex(toIndex, size);
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(predicate, 0, toIndex);
        if (maximumIndex > endingIndex)
            return null;

        //#endregion -------------------- Initialization (ending/maximum index) --------------------

        return __withALimit(predicate, 0, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoTo(final @NotNull CollectionHolder<? extends T> collection,
                                                        final @NotNull BooleanSupplier predicate,
                                                        final int fromIndex,
                                                        final int limit) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/maximum index) --------------------

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = size - 1;
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(predicate, fromIndex, endingIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/maximum index) --------------------

        return __withALimit(predicate, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFromAndTo(final @NotNull CollectionHolder<? extends T> collection,
                                                               final @NotNull BooleanSupplier predicate,
                                                               final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (maximum index) --------------------

        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex > size)
            return null;

        //#endregion -------------------- Initialization (maximum index) --------------------

        return __withALimit(predicate, 0, size - 1, maximumIndex);
    }

    //#endregion -------------------- Core methods (predicate () → boolean, from, to, limit) --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static @Nullable Integer __withoutALimit(@NotNull BooleanSupplier predicate,
                                                     int startingIndex,
                                                     int endingIndex) {
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            if (predicate.getAsBoolean())
                return index;
        return null;
    }

    private static <T> @Nullable Integer __withoutALimit(@NotNull MinimalistCollectionHolder<? extends T> collection,
                                                         @NotNull Predicate<? super T> predicate,
                                                         int startingIndex,
                                                         int endingIndex) {
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            if (predicate.test(collection.get(index)))
                return index;
        return null;
    }

    private static <T> @Nullable Integer __withoutALimit(@NotNull MinimalistCollectionHolder<? extends T> collection,
                                                         @NotNull ObjIntPredicate<? super T> predicate,
                                                         int startingIndex,
                                                         int endingIndex) {
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            if (predicate.test(collection.get(index), index))
                return index;
        return null;
    }


    private static @Nullable Integer __withALimit(@NotNull BooleanSupplier predicate,
                                                  int startingIndex,
                                                  int endingIndex,
                                                  int maximumIndex) {
        var index = endingIndex + 1;
        if (index >= maximumIndex)
            index = maximumIndex;
        while (--index >= startingIndex)
            if (predicate.getAsBoolean())
                return index;
        return null;
    }

    private static <T> @Nullable Integer __withALimit(@NotNull MinimalistCollectionHolder<? extends T> collection,
                                                      @NotNull Predicate<? super T> predicate,
                                                      int startingIndex,
                                                      int endingIndex,
                                                      int maximumIndex) {
        var index = endingIndex + 1;
        if (index >= maximumIndex)
            index = maximumIndex;
        while (--index >= startingIndex)
            if (predicate.test(collection.get(index)))
                return index;
        return null;
    }

    private static <T> @Nullable Integer __withALimit(@NotNull MinimalistCollectionHolder<? extends T> collection,
                                                      @NotNull ObjIntPredicate<? super T> predicate,
                                                      int startingIndex,
                                                      int endingIndex,
                                                      int maximumIndex) {
        var index = endingIndex + 1;
        if (index >= maximumIndex)
            index = maximumIndex;
        while (--index >= startingIndex)
            if (predicate.test(collection.get(index), index))
                return index;
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
