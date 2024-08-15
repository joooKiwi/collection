package joookiwi.collection.java.method;

import java.util.ArrayList;
import java.util.List;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.CommonContracts;
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

import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;

public final class ToReverse
        extends UtilityWithIndex {

    @Contract(CommonContracts.ALWAYS_FAIL_0)
    private ToReverse() { throw new ImpossibleConstructionException("The utility class “ToReverse” cannot be constructed.", ToReverse.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- () --------------------

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyCollectionHolder();
        return __toReverse(collection);
    }

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyCollectionHolder();
        return __toReverse(collection);
    }

    //#endregion -------------------- () --------------------
    //#region -------------------- from --------------------

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __toReverse(collection);
        return __toReverse(collection, fromIndex);
    }

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __toReverse(collection);
        return __toReverse(collection, fromIndex);
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
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final @Nullable Integer toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (toIndex == null)
            if (fromIndex == null)
                return __toReverse(collection);
            else
                return __toReverse(collection, fromIndex);
        if (fromIndex == null)
            return __toReverse(collection, 0, toIndex);
        return __toReverse(collection, fromIndex, toIndex);
    }

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} are {@code toIndex} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final @Nullable Integer toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (toIndex == null)
            if (fromIndex == null)
                return __toReverse(collection);
            else
                return __toReverse(collection, fromIndex);
        if (fromIndex == null)
            return __toReverse(collection, 0, toIndex);
        return __toReverse(collection, fromIndex, toIndex);
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
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final @Nullable Integer toIndex,
                                                             final @Nullable Integer limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __toReverse(collection);
                else
                    return __toReverse(collection, fromIndex);
            else if (fromIndex == null)
                return __toReverse(collection, 0, toIndex);
            else
                return __toReverse(collection, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __toReverse(collection); // TODO handle null fromIndex, toIndex with non-null limit
            else
                return __toReverse(collection, fromIndex); // TODO handle null toIndex with non-null limit
        if (fromIndex == null)
            return __toReverse(collection, 0, toIndex, limit);
        return __toReverse(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} and {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final @Nullable Integer toIndex,
                                                             final @Nullable Integer limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __toReverse(collection);
                else
                    return __toReverse(collection, fromIndex);
            else if (fromIndex == null)
                return __toReverse(collection, 0, toIndex);
            else
                return __toReverse(collection, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __toReverse(collection); // TODO handle null fromIndex, toIndex with non-null limit
            else
                return __toReverse(collection, fromIndex); // TODO handle null toIndex with non-null limit
        if (fromIndex == null)
            return __toReverse(collection, 0, toIndex, limit);
        return __toReverse(collection, fromIndex, toIndex, limit);
    }

    //#endregion -------------------- from, to, limit --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- () --------------------

    private static <T> @NotNull CollectionHolder<T> __toReverse(final @NotNull MinimalistCollectionHolder<? extends T> collection) {
        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __reverse(collection, size));
    }

    private static <T> @NotNull CollectionHolder<T> __toReverse(final @NotNull CollectionHolder<? extends T> collection) {
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __reverse(collection, collection.size()));
    }

    //#endregion -------------------- () --------------------
    //#region -------------------- from --------------------

    private static <T> @NotNull CollectionHolder<T> __toReverse(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();

        final var startingIndex = _startingIndex(fromIndex, size);
        return new GenericCollectionHolder<>(() -> __reverseWithStartingIndex(collection, startingIndex, size));
    }

    private static <T> @NotNull CollectionHolder<T> __toReverse(final @NotNull CollectionHolder<? extends T> collection,
                                                                final int fromIndex) {
        if (collection.isEmpty())
            return emptyCollectionHolder();

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        return new GenericCollectionHolder<>(() -> __reverseWithStartingIndex(collection, startingIndex, size));
    }

    //#endregion -------------------- from --------------------
    //#region -------------------- from, to --------------------

    private static <T> @NotNull CollectionHolder<T> __toReverse(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                final int fromIndex,
                                                                final int toIndex) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        if (fromIndex == 0 && toIndex == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The ending index “" + toIndex + '"' + (toIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + fromIndex + '"' + (fromIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', toIndex);

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return new GenericCollectionHolder<>(() -> __reverseWithStaringAndEndingIndex(collection, startingIndex, endingIndex));
    }

    private static <T> @NotNull CollectionHolder<T> __toReverse(final @NotNull CollectionHolder<? extends T> collection,
                                                                final int fromIndex,
                                                                final int toIndex) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return emptyCollectionHolder();
        if (fromIndex == 0 && toIndex == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The ending index “" + toIndex + '"' + (toIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + fromIndex + '"' + (fromIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', toIndex);

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return new GenericCollectionHolder<>(() -> __reverseWithStaringAndEndingIndex(collection, startingIndex, endingIndex));
    }

    //#endregion -------------------- from, to --------------------
    //#region -------------------- from, to, limit --------------------

    private static <T> @NotNull CollectionHolder<T> __toReverse(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                final int fromIndex,
                                                                final int toIndex,
                                                                final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        if (fromIndex == 0 && toIndex == 0)
            return emptyCollectionHolder();
        if (limit == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The ending index “" + toIndex + '"' + (toIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + fromIndex + '"' + (fromIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', toIndex);

        final var maximumIndex = _maximumIndex(limit, size);
        if (endingIndex - startingIndex < maximumIndex - 1)
            throw new CollectionHolderIndexOutOfBoundsException("The limit “" + limit + '"' + (limit == maximumIndex ? "" : "(“" + maximumIndex + "” after calculation") + " cannot be applied within the range “" + fromIndex + '"' + (fromIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " to “" + toIndex + '"' + (toIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation)") + '.', limit);

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return new GenericCollectionHolder<>(() -> __withALimit(collection, startingIndex, endingIndex, maximumIndex));
    }

    private static <T> @NotNull CollectionHolder<T> __toReverse(final @NotNull CollectionHolder<? extends T> collection,
                                                                final int fromIndex,
                                                                final int toIndex,
                                                                final int limit) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return emptyCollectionHolder();
        if (fromIndex == 0 && toIndex == 0)
            return emptyCollectionHolder();
        if (limit == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The ending index “" + toIndex + '"' + (toIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + fromIndex + '"' + (fromIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', toIndex);

        final var maximumIndex = _maximumIndex(limit, size);
        if (endingIndex - startingIndex < maximumIndex - 1)
            throw new CollectionHolderIndexOutOfBoundsException("The limit “" + limit + '"' + (limit == maximumIndex ? "" : "(“" + maximumIndex + "” after calculation") + " cannot be applied within the range “" + fromIndex + '"' + (fromIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " to “" + toIndex + '"' + (toIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation)") + '.', limit);

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return new GenericCollectionHolder<>(() -> __withALimit(collection, startingIndex, endingIndex, maximumIndex));
    }

    //#endregion -------------------- from, to, limit --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @NotNull @Unmodifiable List<T> __reverse(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            newArray[index] = collection.get(index);
        return List.of(newArray);
    }

    private static <T> @NotNull @Unmodifiable List<T> __reverseWithStartingIndex(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                 final int startingIndex,
                                                                                 final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - startingIndex];
        var index = size - 1;
        while (--index >= startingIndex)
            newArray[index] = collection.get(index);
        return List.of(newArray);
    }

    private static <T> @NotNull @Unmodifiable List<T> __reverseWithStaringAndEndingIndex(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                         final int startingIndex,
                                                                                         final int endingIndex) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[endingIndex - startingIndex];
        var indexAdded = -1;
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            newArray[++indexAdded] = collection.get(index);
        return List.of(newArray);
    }


    private static <T> @NotNull @Unmodifiable List<T> __withALimit(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                   final int startingIndex,
                                                                   final int endingIndex,
                                                                   final int maximumIndex) {
        final var temporaryList = new ArrayList<T>(maximumIndex);
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
