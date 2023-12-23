package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.annotation.OnlyGivePositiveValue;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.method.EndingIndex.endingIndex;
import static joookiwi.collection.java.method.MaximumIndex.maximumIndex;
import static joookiwi.collection.java.method.StartingIndex.startingIndex;

public final class IndexOfLastIndexed
        extends Utility {

    @Contract("-> fail")
    private IndexOfLastIndexed() { throw new ImpossibleConstructionException("The utility class \"IndexOfLastIndexed\" cannot be constructed.", IndexOfLastIndexed.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- indexOfLastIndexed(collection, predicate) methods --------------------

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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(@Nullable CollectionHolder<? extends T> collection, @Nullable BiFunction<@NotNull Integer, T, @NotNull Boolean> predicate) {
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------

        return __withoutALimit(collection, predicate, -1, collection.size());
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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(@Nullable CollectionHolder<? extends T> collection, @Nullable Function<@NotNull Integer, @NotNull Boolean> predicate) {
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------

        return __withoutALimit(predicate, -1, collection.size());
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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(@Nullable CollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------

        return __withoutALimit(predicate, -1, collection.size());
    }

    //#endregion -------------------- indexOfLastIndexed(collection, predicate) methods --------------------
    //#region -------------------- indexOfLastIndexed(collection, predicate, fromIndex) methods --------------------

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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(@Nullable CollectionHolder<? extends T> collection, @Nullable BiFunction<@NotNull Integer, T, @NotNull Boolean> predicate, @Nullable Integer fromIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (fromIndex == null)
            return indexOfLastIndexed(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting index) --------------------

        var size = collection.size();
        var startingIndex = startingIndex(collection, fromIndex, size);
        if (startingIndex == null)
            return null;

        //#endregion -------------------- Initialization (starting index) --------------------

        return __withoutALimit(collection, predicate, startingIndex, size - 1);
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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(@Nullable CollectionHolder<? extends T> collection, @Nullable Function<@NotNull Integer, @NotNull Boolean> predicate, @Nullable Integer fromIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (fromIndex == null)
            return indexOfLastIndexed(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting index) --------------------

        var size = collection.size();
        var startingIndex = startingIndex(collection, fromIndex, size);
        if (startingIndex == null)
            return null;

        //#endregion -------------------- Initialization (starting index) --------------------

        return __withoutALimit(predicate, startingIndex, size - 1);
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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(@Nullable CollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate, @Nullable Integer fromIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (fromIndex == null)
            return indexOfLastIndexed(collection, predicate);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting index) --------------------

        var size = collection.size();
        var startingIndex = startingIndex(collection, fromIndex, size);
        if (startingIndex == null)
            return null;

        //#endregion -------------------- Initialization (starting index) --------------------

        return __withoutALimit(predicate, startingIndex, size - 1);
    }

    //#endregion -------------------- indexOfLastIndexed(collection, predicate, fromIndex) methods --------------------
    //#region -------------------- indexOfLastIndexed(collection, predicate, fromIndex, toIndex) methods --------------------

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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(@Nullable CollectionHolder<? extends T> collection, @Nullable BiFunction<@NotNull Integer, T, @NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (toIndex == null)
            return indexOfLastIndexed(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLastIndexed(collection, predicate);

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

        var startingIndex = startingIndex(collection, fromIndex, size);
        if (startingIndex == null)
            return null;

        var endingIndex = endingIndex(collection, toIndex, size);
        if (endingIndex == null)
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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(@Nullable CollectionHolder<? extends T> collection, @Nullable Function<@NotNull Integer, @NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (toIndex == null)
            return indexOfLastIndexed(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLastIndexed(collection, predicate);

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

        var startingIndex = startingIndex(collection, fromIndex, size);
        if (startingIndex == null)
            return null;

        var endingIndex = endingIndex(collection, toIndex, size);
        if (endingIndex == null)
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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(@Nullable CollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (toIndex == null)
            return indexOfLastIndexed(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLastIndexed(collection, predicate);

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

        var startingIndex = startingIndex(collection, fromIndex, size);
        if (startingIndex == null)
            return null;

        var endingIndex = endingIndex(collection, toIndex, size);
        if (endingIndex == null)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- indexOfLastIndexed(collection, predicate, fromIndex, toIndex) methods --------------------
    //#region -------------------- indexOfLastIndexed(collection, predicate, fromIndex, toIndex, limit) methods --------------------

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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(@Nullable CollectionHolder<? extends T> collection, @Nullable BiFunction<@NotNull Integer, T, @NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        //#region -------------------- Intelligent returns --------------------

        if (limit == null)
            return indexOfLastIndexed(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            return indexOfLastIndexed(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLastIndexed(collection, predicate);

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

        var startingIndex = startingIndex(collection, fromIndex, size);
        if (startingIndex == null)
            return null;

        var endingIndex = endingIndex(collection, toIndex, size);
        if (endingIndex == null)
            return null;

        var maximumIndex = maximumIndex(collection, limit, size);
        if (maximumIndex == null)
            return null;
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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(@Nullable CollectionHolder<? extends T> collection, @Nullable Function<@NotNull Integer, @NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        //#region -------------------- Intelligent returns --------------------

        if (limit == null)
            return indexOfLastIndexed(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            return indexOfLastIndexed(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLastIndexed(collection, predicate);

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

        var startingIndex = startingIndex(collection, fromIndex, size);
        if (startingIndex == null)
            return null;

        var endingIndex = endingIndex(collection, toIndex, size);
        if (endingIndex == null)
            return null;

        var maximumIndex = maximumIndex(collection, limit, size);
        if (maximumIndex == null)
            return null;
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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOfLastIndexed(@Nullable CollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        //#region -------------------- Intelligent returns --------------------

        if (limit == null)
            return indexOfLastIndexed(collection, predicate, fromIndex, toIndex);
        if (toIndex == null)
            return indexOfLastIndexed(collection, predicate, fromIndex);
        if (fromIndex == null)
            return indexOfLastIndexed(collection, predicate);

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

        var startingIndex = startingIndex(collection, fromIndex, size);
        if (startingIndex == null)
            return null;

        var endingIndex = endingIndex(collection, toIndex, size);
        if (endingIndex == null)
            return null;

        var maximumIndex = maximumIndex(collection, limit, size);
        if (maximumIndex == null)
            return null;
        if (maximumIndex == size)
            return __withoutALimit(predicate, fromIndex, toIndex);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(predicate, startingIndex, endingIndex, maximumIndex);
    }

    //#endregion -------------------- indexOfLastIndexed(collection, predicate, fromIndex, toIndex, limit) methods --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withoutALimit(Supplier<@NotNull Boolean> predicate, int startingIndex, int endingIndex) {
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            if (predicate.get())
                return index;
        return null;
    }

    private static @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withoutALimit(Function<@NotNull Integer, @NotNull Boolean> predicate, int startingIndex, int endingIndex) {
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            if (predicate.apply(index))
                return index;
        return null;
    }

    private static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withoutALimit(CollectionHolder<? extends T> collection, BiFunction<@NotNull Integer, T, @NotNull Boolean> predicate, int startingIndex, int endingIndex) {
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            if (predicate.apply(index, collection.get(index)))
                return index;
        return null;
    }


    private static @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withALimit(Supplier<@NotNull Boolean> predicate, int startingIndex, int endingIndex, int maximumIndex) {
        var index = endingIndex + 1;
        if (index >= maximumIndex)
            index = maximumIndex;
        while (--index >= startingIndex)
            if (predicate.get())
                return index;
        return null;
    }

    private static @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withALimit(Function<@NotNull Integer, @NotNull Boolean> predicate, int startingIndex, int endingIndex, int maximumIndex) {
        var index = endingIndex + 1;
        if (index >= maximumIndex)
            index = maximumIndex;
        while (--index >= startingIndex)
            if (predicate.apply(index))
                return index;
        return null;
    }

    private static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withALimit(CollectionHolder<? extends T> collection, BiFunction<@NotNull Integer, T, @NotNull Boolean> predicate, int startingIndex, int endingIndex, int maximumIndex) {
        var index = endingIndex + 1;
        if (index >= maximumIndex)
            index = maximumIndex;
        while (--index >= startingIndex)
            if (predicate.apply(index, collection.get(index)))
                return index;
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
