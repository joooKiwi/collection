package joookiwi.collection.java.method;

import java.util.ArrayList;
import java.util.List;
import joookiwi.collection.java.CollectionConstants;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public final class ToReverse
        extends UtilityWithIndex {

    @Contract("-> fail")
    private ToReverse() { throw new ImpossibleConstructionException("The utility class \"ToReverse\" cannot be constructed.", ToReverse.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- () --------------------

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript reverse()</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    public static <T> @NotNull CollectionHolder<T> toReverse(@Nullable MinimalistCollectionHolder<? extends T> collection) {
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return CollectionConstants.emptyCollectionHolder();

        var size = collection.size();
        if (size == 0)
            return CollectionConstants.emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------

        return new GenericCollectionHolder<>(() -> __reverse(collection, size));
    }

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript reverse()</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    public static <T> @NotNull CollectionHolder<T> toReverse(@Nullable CollectionHolder<? extends T> collection) {
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return CollectionConstants.emptyCollectionHolder();
        if (collection.isEmpty())
            return CollectionConstants.emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------

        return new GenericCollectionHolder<>(() -> __reverse(collection, collection.size()));
    }

    //#endregion -------------------- () --------------------
    //#region -------------------- from --------------------

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript reverse()</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Integer fromIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (fromIndex == null)
            return toReverse(collection);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return CollectionConstants.emptyCollectionHolder();

        var size = collection.size();
        if (size == 0)
            return CollectionConstants.emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------

        var startingIndex = _startingIndex(fromIndex, size);
        return new GenericCollectionHolder<>(() -> __reverseWithStartingIndex(collection, startingIndex, size));
    }

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript reverse()</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(@Nullable CollectionHolder<? extends T> collection, @Nullable Integer fromIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (fromIndex == null)
            return toReverse(collection);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return CollectionConstants.emptyCollectionHolder();
        if (collection.isEmpty())
            return CollectionConstants.emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------

        var size = collection.size();
        var startingIndex = _startingIndex(fromIndex, size);
        return new GenericCollectionHolder<>(() -> __reverseWithStartingIndex(collection, startingIndex, size));
    }

    //#endregion -------------------- from --------------------
    //#region -------------------- from, to --------------------

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} are {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript reverse()</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (toIndex == null)
            return toReverse(collection, fromIndex);
        if (fromIndex == null)
            return toReverse(collection);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return CollectionConstants.emptyCollectionHolder();

        var size = collection.size();
        if (size == 0)
            return CollectionConstants.emptyCollectionHolder();
        if (fromIndex == 0 && toIndex == 0)
            return CollectionConstants.emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        int startingIndex = _startingIndex(fromIndex, size);
        int endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The ending index \"" + toIndex + '"' + (toIndex == startingIndex ? "" : " (\"" + startingIndex + "\" after calculation)") + " is over the starting index \"" + fromIndex + '"' + (fromIndex == endingIndex ? "" : " (\"" + endingIndex + "\" after calculation") + '.', toIndex);

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return new GenericCollectionHolder<>(() -> __reverseWithStaringAndEndingIndex(collection, startingIndex, endingIndex));
    }

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} are {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript reverse()</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(@Nullable CollectionHolder<? extends T> collection, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (toIndex == null)
            return toReverse(collection, fromIndex);
        if (fromIndex == null)
            return toReverse(collection);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return CollectionConstants.emptyCollectionHolder();
        if (collection.isEmpty())
            return CollectionConstants.emptyCollectionHolder();
        if (fromIndex == 0 && toIndex == 0)
            return CollectionConstants.emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        var size = collection.size();
        int startingIndex = _startingIndex(fromIndex, size);
        int endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The ending index \"" + toIndex + '"' + (toIndex == startingIndex ? "" : " (\"" + startingIndex + "\" after calculation)") + " is over the starting index \"" + fromIndex + '"' + (fromIndex == endingIndex ? "" : " (\"" + endingIndex + "\" after calculation") + '.', toIndex);

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return new GenericCollectionHolder<>(() -> __reverseWithStaringAndEndingIndex(collection, startingIndex, endingIndex));
    }

    //#endregion -------------------- from, to --------------------
    //#region -------------------- from, to, limit --------------------

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} and {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript reverse()</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        //#region -------------------- Intelligent returns --------------------

        if (limit == null)
            return toReverse(collection, fromIndex, toIndex);
        if (toIndex == null)
            return toReverse(collection, fromIndex);
        if (fromIndex == null)
            return toReverse(collection);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return CollectionConstants.emptyCollectionHolder();

        var size = collection.size();
        if (size == 0)
            return CollectionConstants.emptyCollectionHolder();
        if (fromIndex == 0 && toIndex == 0)
            return CollectionConstants.emptyCollectionHolder();
        if (limit == 0)
            return CollectionConstants.emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        int startingIndex = _startingIndex(fromIndex, size);
        int endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The ending index \"" + toIndex + '"' + (toIndex == startingIndex ? "" : " (\"" + startingIndex + "\" after calculation)") + " is over the starting index \"" + fromIndex + '"' + (fromIndex == endingIndex ? "" : " (\"" + endingIndex + "\" after calculation") + '.', toIndex);

        int maximumIndex = _maximumIndex(limit, size);
        if (endingIndex - startingIndex < maximumIndex - 1)
            throw new CollectionHolderIndexOutOfBoundsException("The limit \"" + limit + '"' + (limit == maximumIndex ? "" : "(\"" + maximumIndex + "\" after calculation") + " cannot be applied within the range \"" + fromIndex + '"' + (fromIndex == startingIndex ? "" : " (\"" + startingIndex + "\" after calculation)") + " to \"" + toIndex + '"' + (toIndex == endingIndex ? "" : " (\"" + endingIndex + "\" after calculation)") + '.', limit);

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return new GenericCollectionHolder<>(() -> __withALimit(collection, startingIndex, endingIndex, maximumIndex));
    }

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} and {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript reverse()</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(@Nullable CollectionHolder<? extends T> collection, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        //#region -------------------- Intelligent returns --------------------

        if (limit == null)
            return toReverse(collection, fromIndex, toIndex);
        if (toIndex == null)
            return toReverse(collection, fromIndex);
        if (fromIndex == null)
            return toReverse(collection);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return CollectionConstants.emptyCollectionHolder();
        if (collection.isEmpty())
            return CollectionConstants.emptyCollectionHolder();
        if (fromIndex == 0 && toIndex == 0)
            return CollectionConstants.emptyCollectionHolder();
        if (limit == 0)
            return CollectionConstants.emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        var size = collection.size();
        int startingIndex = _startingIndex(fromIndex, size);
        int endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The ending index \"" + toIndex + '"' + (toIndex == startingIndex ? "" : " (\"" + startingIndex + "\" after calculation)") + " is over the starting index \"" + fromIndex + '"' + (fromIndex == endingIndex ? "" : " (\"" + endingIndex + "\" after calculation") + '.', toIndex);

        int maximumIndex = _maximumIndex(limit, size);
        if (endingIndex - startingIndex < maximumIndex - 1)
            throw new CollectionHolderIndexOutOfBoundsException("The limit \"" + limit + '"' + (limit == maximumIndex ? "" : "(\"" + maximumIndex + "\" after calculation") + " cannot be applied within the range \"" + fromIndex + '"' + (fromIndex == startingIndex ? "" : " (\"" + startingIndex + "\" after calculation)") + " to \"" + toIndex + '"' + (toIndex == endingIndex ? "" : " (\"" + endingIndex + "\" after calculation)") + '.', limit);

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return new GenericCollectionHolder<>(() -> __withALimit(collection, startingIndex, endingIndex, maximumIndex));
    }

    //#endregion -------------------- from, to, limit --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @NotNull @Unmodifiable List<T> __reverse(@NotNull MinimalistCollectionHolder<? extends T> collection, int size) {
        @SuppressWarnings("unchecked cast") var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            newArray[index] = collection.get(index);
        return List.of(newArray);
    }

    private static <T> @NotNull @Unmodifiable List<T> __reverseWithStartingIndex(@NotNull MinimalistCollectionHolder<? extends T> collection, int startingIndex, int size) {
        @SuppressWarnings("unchecked cast") var newArray = (T[]) new Object[size - startingIndex];
        var index = size - 1;
        while (--index >= startingIndex)
            newArray[index] = collection.get(index);
        return List.of(newArray);
    }

    private static <T> @NotNull @Unmodifiable List<T> __reverseWithStaringAndEndingIndex(@NotNull MinimalistCollectionHolder<? extends T> collection, int startingIndex, int endingIndex) {
        @SuppressWarnings("unchecked cast") var newArray = (T[]) new Object[endingIndex - startingIndex];
        var indexAdded = -1;
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            newArray[++indexAdded] = collection.get(index);
        return List.of(newArray);
    }


    private static <T> @NotNull @Unmodifiable List<T> __withALimit(@NotNull MinimalistCollectionHolder<? extends T> collection, int startingIndex, int endingIndex, int maximumIndex) {
        var temporaryList = new ArrayList<T>(maximumIndex);
        var index = endingIndex + 1;
        while (--index >= startingIndex) {
            if (temporaryList.size() >= maximumIndex)
                return List.copyOf(temporaryList);
            temporaryList.add(collection.get(index));
        }
        return List.copyOf(temporaryList);
    }

    //#endregion -------------------- Loop methods --------------------

}
