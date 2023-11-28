package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionConstants;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ToReverse
        extends Utility {

    @Contract("-> fail")
    private ToReverse() { throw new ImpossibleConstructionException("The utility class \"ToReverse\" cannot be constructed.", ToReverse.class); }

    //#region -------------------- Facade methods --------------------

    /**
     * Reverse the {@code collection} from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript reverse()</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    public static <T> @NotNull CollectionHolder<T> toReverse(@Nullable CollectionHolder<T> collection) {
        if (collection == null)
            return CollectionConstants.emptyCollectionHolder();
        if (collection.isEmpty())
            return CollectionConstants.emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __simpleReverse(collection));
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
    public static <T> @NotNull CollectionHolder<T> toReverse(@Nullable CollectionHolder<T> collection, @Nullable Integer fromIndex) {
        if (collection == null)
            return CollectionConstants.emptyCollectionHolder();
        if (collection.isEmpty())
            return CollectionConstants.emptyCollectionHolder();

        return new GenericCollectionHolder<>(() -> {
            //#region -------------------- Initialization (starting index) --------------------

            var size = collection.getSize();
            int startingIndex = Objects.requireNonNull(StartingIndex.startingIndex(collection, fromIndex, size));

            //#endregion -------------------- Initialization (starting index) --------------------

            return __simpleReverseWithStaringIndex(collection, size, startingIndex);
        });
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
    public static <T> @NotNull CollectionHolder<T> toReverse(@Nullable CollectionHolder<T> collection, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        if (collection == null)
            return CollectionConstants.emptyCollectionHolder();
        if (collection.isEmpty())
            return CollectionConstants.emptyCollectionHolder();
        if (fromIndex != null && fromIndex == 0 && toIndex != null && toIndex == 0)
            return CollectionConstants.emptyCollectionHolder();

        return new GenericCollectionHolder<>(() -> {
            //#region -------------------- Initialization (starting/ending index) --------------------

            var size = collection.getSize();
            int startingIndex = Objects.requireNonNull(StartingIndex.startingIndex(collection, fromIndex, size));
            int endingIndex = Objects.requireNonNull(EndingIndex.endingIndex(collection, toIndex, size));

            if (endingIndex < startingIndex)
                throw new CollectionHolderIndexOutOfBoundsException("The ending index \"" + toIndex + '"' + (Objects.equals(toIndex, startingIndex) ? "" : " (\"" + startingIndex + "\" after calculation)") + " is over the starting index \"" + fromIndex + '"' + (Objects.equals(fromIndex, endingIndex) ? "" : " (\"" + endingIndex + "\" after calculation") + '.', toIndex);

            //#endregion -------------------- Initialization (starting/ending index) --------------------

            return __simpleReverseWithStaringAndEndingIndex(collection, startingIndex, endingIndex);
        });
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
    public static <T> @NotNull CollectionHolder<T> toReverse(@Nullable CollectionHolder<T> collection, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        if (collection == null)
            return CollectionConstants.emptyCollectionHolder();
        if (collection.isEmpty())
            return CollectionConstants.emptyCollectionHolder();
        if (fromIndex != null && fromIndex == 0 && toIndex != null && toIndex == 0)
            return CollectionConstants.emptyCollectionHolder();
        if (limit != null && limit == 0)
            return CollectionConstants.emptyCollectionHolder();

        if (limit == null)
            return new GenericCollectionHolder<>(() -> {
                //#region -------------------- Initialization (starting/ending index) --------------------

                var size = collection.getSize();
                int startingIndex = Objects.requireNonNull(StartingIndex.startingIndex(collection, fromIndex, size));
                int endingIndex = Objects.requireNonNull(EndingIndex.endingIndex(collection, toIndex, size));
                if (endingIndex < startingIndex)
                    throw new CollectionHolderIndexOutOfBoundsException("The ending index \"" + toIndex + '"' + (Objects.equals(toIndex, startingIndex) ? "" : " (\"" + startingIndex + "\" after calculation)") + " is over the starting index \"" + fromIndex + '"' + (Objects.equals(fromIndex, endingIndex) ? "" : " (\"" + endingIndex + "\" after calculation") + '.', toIndex);

                //#endregion -------------------- Initialization (starting/ending index) --------------------

                return __simpleReverseWithStaringAndEndingIndex(collection, startingIndex, endingIndex);
            });
        return new GenericCollectionHolder<>(() -> {
            //#region -------------------- Initialization (starting/ending/maximum index) --------------------

            var size = collection.getSize();
            int startingIndex = Objects.requireNonNull(StartingIndex.startingIndex(collection, fromIndex, size));
            int endingIndex = Objects.requireNonNull(EndingIndex.endingIndex(collection, toIndex, size));
            if (endingIndex < startingIndex)
                throw new CollectionHolderIndexOutOfBoundsException("The ending index \"" + toIndex + '"' + (Objects.equals(toIndex, startingIndex) ? "" : " (\"" + startingIndex + "\" after calculation)") + " is over the starting index \"" + fromIndex + '"' + (Objects.equals(fromIndex, endingIndex) ? "" : " (\"" + endingIndex + "\" after calculation") + '.', toIndex);

            int maximumIndex = Objects.requireNonNull(MaximumIndex.maximumIndex(collection, limit, size));
            if (endingIndex - startingIndex < maximumIndex - 1)
                throw new CollectionHolderIndexOutOfBoundsException("The limit \"" + limit + '"' + (Objects.equals(limit, maximumIndex) ? "" : "(\"" + maximumIndex + "\" after calculation") + " cannot be applied within the range \"" + fromIndex + '"' + (Objects.equals(fromIndex, startingIndex) ? "" : " (\"" + startingIndex + "\" after calculation)") + " to \"" + toIndex + '"' + (Objects.equals(toIndex, endingIndex) ? "" : " (\"" + endingIndex + "\" after calculation)") + '.', limit);

            //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

            return __simpleReverseWithStaringAndEndingAndMaximumIndex(collection, startingIndex, endingIndex, maximumIndex);
        });
    }

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @NotNull @Unmodifiable List<T> __simpleReverse(@NotNull CollectionHolder<T> collection) {
        var size = collection.getSize();
        @SuppressWarnings("unchecked cast") var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            newArray[index] = collection.get(index);
        return List.of(newArray);
    }


    private static <T> @NotNull @Unmodifiable List<T> __simpleReverseWithStaringIndex(@NotNull CollectionHolder<T> collection, int size, int startingIndex) {
        @SuppressWarnings("unchecked cast") var newArray = (T[]) new Object[size - startingIndex];
        var index = size - 1;
        while (--index >= startingIndex)
            newArray[index] = collection.get(index);
        return List.of(newArray);
    }


    private static <T> @NotNull @Unmodifiable List<T> __simpleReverseWithStaringAndEndingIndex(@NotNull CollectionHolder<T> collection, int startingIndex, int endingIndex) {
        @SuppressWarnings("unchecked cast") var newArray = (T[]) new Object[endingIndex - startingIndex];
        var indexAdded = -1;
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            newArray[++indexAdded] = collection.get(index);
        return List.of(newArray);
    }

    private static <T> @NotNull @Unmodifiable List<T> __simpleReverseWithStaringAndEndingAndMaximumIndex(@NotNull CollectionHolder<T> collection, int startingIndex, int endingIndex, int maximumIndex) {
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
