package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import java.util.Objects;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.method.EndingIndex.endingIndex;
import static joookiwi.collection.java.method.MaximumIndex.maximumIndex;
import static joookiwi.collection.java.method.StartingIndex.startingIndex;

public final class LastIndexOf
        extends Utility {

    @Contract("-> fail")
    private LastIndexOf() { throw new ImpossibleConstructionException("The utility class \"LastIndexOf\" cannot be constructed.", LastIndexOf.class); }

    //#region -------------------- Facade methods --------------------

    /**
     * Get the <b>last</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param <T>        The {@code collection} type
     * @return The index associated to the {@code element} or <b>null</b>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(@Nullable CollectionHolder<? extends T> collection, @Nullable Object element) {
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------

        return __withoutALimit(collection, element, -1, collection.getSize() -1);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param <T>        The {@code collection} type
     * @return The index associated to the {@code element} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract("null, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(@Nullable CollectionHolder<? extends T> collection, @Nullable Object element, @Nullable Integer fromIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (fromIndex == null)
            return lastIndexOf(collection, element);

        //#endregion -------------------- Intelligent returns --------------------
        //#region -------------------- Early returns --------------------

        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting index) --------------------

        var size = collection.getSize();
        var startingIndex = startingIndex(collection, fromIndex, size);
        if (startingIndex == null)
            return null;

        //#endregion -------------------- Initialization (starting index) --------------------

        return __withoutALimit(collection, element, startingIndex, size - 1);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param <T>        The {@code collection} type
     * @return The index associated to the {@code element} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} and {@code toIndex} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract("null, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(@Nullable CollectionHolder<? extends T> collection, @Nullable Object element, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        //#region -------------------- Intelligent returns --------------------

        if (toIndex == null)
            return lastIndexOf(collection, element, fromIndex);
        if (fromIndex == null)
            return lastIndexOf(collection, element);

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

        var size = collection.getSize();

        var startingIndex = startingIndex(collection, fromIndex, size);
        if (startingIndex == null)
            return null;

        var endingIndex = endingIndex(collection, toIndex, size);
        if (endingIndex == null)
            return null;

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return __withoutALimit(collection, element, startingIndex, endingIndex);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @param <T>        The {@code collection} type
     * @return The index associated to the {@code element} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} and {@code limit} are not within a valid range
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract("null, _, _, _, _ -> null")
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(@Nullable CollectionHolder<? extends T> collection, @Nullable Object element, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        //#region -------------------- Intelligent returns --------------------

        if (limit == null)
            return lastIndexOf(collection, element, fromIndex, toIndex);
        if (toIndex == null)
            return lastIndexOf(collection, element, fromIndex);
        if (fromIndex == null)
            return lastIndexOf(collection, element);

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

        var size = collection.getSize();

        var startingIndex = startingIndex(collection, fromIndex, size);
        if (startingIndex == null)
            return null;

        var endingIndex = endingIndex(collection, toIndex, size);
        if (endingIndex == null)
            return null;

        var maximumIndex = maximumIndex(collection, limit, size);
        if (maximumIndex == null)
            return null;
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection, element, startingIndex, endingIndex, maximumIndex);
    }

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withoutALimit(@NotNull CollectionHolder<?> collection, @Nullable Object element, int startingIndex, int endingIndex) {
        var index = endingIndex + 1;
        if (element == null) {
            while (++index >= startingIndex)
                if (collection.get(index) == null)
                    return index;
            return null;
        }
        while (++index <= endingIndex)
            if (Objects.equals(collection.get(index), element))
                return index;
        return null;
    }

    private static @Range(from = 0, to = MAX_VALUE) @Nullable Integer __withALimit(@NotNull CollectionHolder<?> collection, @Nullable Object element, int startingIndex, int endingIndex, int maximumIndex) {
        var index = endingIndex + 1;
        if (index >= maximumIndex)
            index = maximumIndex;
        if (element == null) {
            while (--index >= startingIndex)
                if (collection.get(index) == null)
                    return index;
            return null;
        }
        while (++index <= endingIndex)
            if (Objects.equals(collection.get(index), element))
                return index;
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
