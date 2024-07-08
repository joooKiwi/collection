package joookiwi.collection.java.method;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.annotation.OnlyGivePositiveValue;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static java.lang.Integer.MAX_VALUE;

public final class IndexOfLast
        extends UtilityWithIndex {

    @Contract("-> fail")
    private IndexOfLast() { throw new ImpossibleConstructionException("The utility class \"IndexOfLast\" cannot be constructed.", IndexOfLast.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract("null, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        return __withoutALimit(collection, predicate, -1, size);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract("null, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable CollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------

        return __withoutALimit(collection, predicate, 0, collection.size() - 1);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract("null, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate) {
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        return __withoutALimit(collection, predicate, -1, size);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract("null, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable CollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate) {
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------

        return __withoutALimit(collection, predicate, 0, collection.size() - 1);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract("null, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate) {
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        return __withoutALimit(predicate, -1, size);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract("null, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable CollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate) {
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------

        return __withoutALimit(predicate, 0, collection.size() - 1);
    }

    //#endregion -------------------- predicate () → boolean --------------------
    //#region -------------------- predicate (T, int) → boolean, from --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate, @Nullable Integer fromIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        return __withoutALimit(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable CollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate, @Nullable Integer fromIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------

        var size = collection.size();
        return __withoutALimit(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- predicate (T, int) → boolean, from --------------------
    //#region -------------------- predicate (T) → boolean,      from --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate, @Nullable Integer fromIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        return __withoutALimit(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable CollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate, @Nullable Integer fromIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------

        var size = collection.size();
        return __withoutALimit(collection, predicate, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- predicate (T) → boolean,      from --------------------
    //#region -------------------- predicate () → boolean,       from --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate, @Nullable Integer fromIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        return __withoutALimit(predicate, _startingIndex(fromIndex, size), size - 1);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable CollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate, @Nullable Integer fromIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------

        var size = collection.size();
        return __withoutALimit(predicate, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- predicate () → boolean,       from --------------------
    //#region -------------------- predicate (T, int) → boolean, from, to --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} and {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (toIndex == null)
            if (fromIndex == null)
                return indexOfLast(collection, predicate);
            else
                return indexOfLast(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        var startingIndex = _startingIndex(fromIndex, size);
        var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(collection, predicate, startingIndex, endingIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} and {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable CollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (toIndex == null)
            if (fromIndex == null)
                return indexOfLast(collection, predicate);
            else
                return indexOfLast(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        var size = collection.size();
        var startingIndex = _startingIndex(fromIndex, size);
        var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(collection, predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- predicate (T, int) → boolean, from, to --------------------
    //#region -------------------- predicate (T) → boolean,      from, to --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} and {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (toIndex == null)
            if (fromIndex == null)
                return indexOfLast(collection, predicate);
            else
                return indexOfLast(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        var startingIndex = _startingIndex(fromIndex, size);
        var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(collection, predicate, startingIndex, endingIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} and {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable CollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (toIndex == null)
            if (fromIndex == null)
                return indexOfLast(collection, predicate);
            else
                return indexOfLast(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        var size = collection.size();
        var startingIndex = _startingIndex(fromIndex, size);
        var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(collection, predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- predicate (T) → boolean,      from, to --------------------
    //#region -------------------- predicate () → boolean,       from, to --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} and {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (toIndex == null)
            if (fromIndex == null)
                return indexOfLast(collection, predicate);
            else
                return indexOfLast(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        var startingIndex = _startingIndex(fromIndex, size);
        var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(predicate, startingIndex, endingIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} and {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable CollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (toIndex == null)
            if (fromIndex == null)
                return indexOfLast(collection, predicate);
            else
                return indexOfLast(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        var size = collection.size();
        var startingIndex = _startingIndex(fromIndex, size);
        var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- predicate () → boolean,       from, to --------------------
    //#region -------------------- predicate (T, int) → boolean, from, to, limit --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} and {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        //#region -------------------- Intelligent returns --------------------

        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return indexOfLast(collection, predicate);
                else
                    return indexOfLast(collection, predicate, fromIndex);
            else
                return indexOfLast(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return indexOfLast(collection, predicate);
            else
                return indexOfLast(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        var startingIndex = _startingIndex(fromIndex, size);
        var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, fromIndex, toIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection, predicate, startingIndex, endingIndex, maximumIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} and {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable CollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        //#region -------------------- Intelligent returns --------------------

        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return indexOfLast(collection, predicate);
                else
                    return indexOfLast(collection, predicate, fromIndex);
            else
                return indexOfLast(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return indexOfLast(collection, predicate);
            else
                return indexOfLast(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        var size = collection.size();
        var startingIndex = _startingIndex(fromIndex, size);
        var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, fromIndex, toIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection, predicate, startingIndex, endingIndex, maximumIndex);
    }

    //#endregion -------------------- predicate (T, int) → boolean, from, to, limit --------------------
    //#region -------------------- predicate (T) → boolean,      from, to, limit --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} and {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        //#region -------------------- Intelligent returns --------------------

        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return indexOfLast(collection, predicate);
                else
                    return indexOfLast(collection, predicate, fromIndex);
            else
                return indexOfLast(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return indexOfLast(collection, predicate);
            else
                return indexOfLast(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        var startingIndex = _startingIndex(fromIndex, size);
        var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, fromIndex, toIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection, predicate, startingIndex, endingIndex, maximumIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} and {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable CollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        //#region -------------------- Intelligent returns --------------------

        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return indexOfLast(collection, predicate);
                else
                    return indexOfLast(collection, predicate, fromIndex);
            else
                return indexOfLast(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return indexOfLast(collection, predicate);
            else
                return indexOfLast(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        var size = collection.size();
        var startingIndex = _startingIndex(fromIndex, size);
        var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(collection, predicate, fromIndex, toIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection, predicate, startingIndex, endingIndex, maximumIndex);
    }

    //#endregion -------------------- predicate (T) → boolean,      from, to, limit --------------------
    //#region -------------------- predicate () → boolean,       from, to, limit --------------------

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} and {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        //#region -------------------- Intelligent returns --------------------

        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return indexOfLast(collection, predicate);
                else
                    return indexOfLast(collection, predicate, fromIndex);
            else
                return indexOfLast(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return indexOfLast(collection, predicate);
            else
                return indexOfLast(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        var startingIndex = _startingIndex(fromIndex, size);
        var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(predicate, fromIndex, toIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(predicate, startingIndex, endingIndex, maximumIndex);
    }

    /**
     * Get the last index matching the {@code predicate}
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @return The index matching the {@code predicate} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} and {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLastIndex" >ReadonlyArray.findLastIndex(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html">Kotlin indexOfLast(predicate)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract("null, _, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLast(@Nullable CollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        //#region -------------------- Intelligent returns --------------------

        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return indexOfLast(collection, predicate);
                else
                    return indexOfLast(collection, predicate, fromIndex);
            else
                return indexOfLast(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return indexOfLast(collection, predicate);
            else
                return indexOfLast(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLast(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (fromIndex == 0 && toIndex == 0)
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        var size = collection.size();
        var startingIndex = _startingIndex(fromIndex, size);
        var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;

        var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex == size)
            return __withoutALimit(predicate, fromIndex, toIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(predicate, startingIndex, endingIndex, maximumIndex);
    }

    //#endregion -------------------- predicate () → boolean,       from, to, limit --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    @OnlyGivePositiveValue
    private static @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withoutALimit(@NotNull Supplier<@NotNull Boolean> predicate, int startingIndex, int endingIndex) {
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            if (predicate.get())
                return index;
        return null;
    }

    @OnlyGivePositiveValue
    private static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withoutALimit(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate, int startingIndex, int endingIndex) {
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            if (predicate.apply(collection.get(index)))
                return index;
        return null;
    }

    @OnlyGivePositiveValue
    private static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withoutALimit(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate, int startingIndex, int endingIndex) {
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            if (predicate.apply(collection.get(index), index))
                return index;
        return null;
    }


    @OnlyGivePositiveValue
    private static @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withALimit(@NotNull Supplier<@NotNull Boolean> predicate, int startingIndex, int endingIndex, int maximumIndex) {
        var index = endingIndex + 1;
        if (index >= maximumIndex)
            index = maximumIndex;
        while (--index >= startingIndex)
            if (predicate.get())
                return index;
        return null;
    }

    @OnlyGivePositiveValue
    private static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withALimit(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate, int startingIndex, int endingIndex, int maximumIndex) {
        var index = endingIndex + 1;
        if (index >= maximumIndex)
            index = maximumIndex;
        while (--index >= startingIndex)
            if (predicate.apply(collection.get(index)))
                return index;
        return null;
    }

    @OnlyGivePositiveValue
    private static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withALimit(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate, int startingIndex, int endingIndex, int maximumIndex) {
        var index = endingIndex + 1;
        if (index >= maximumIndex)
            index = maximumIndex;
        while (--index >= startingIndex)
            if (predicate.apply(collection.get(index), index))
                return index;
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
