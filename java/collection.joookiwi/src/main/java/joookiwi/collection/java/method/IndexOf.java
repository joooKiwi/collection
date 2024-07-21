package joookiwi.collection.java.method;

import java.util.Objects;
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
import static joookiwi.collection.java.CommonContracts.*;

public final class IndexOf
        extends UtilityWithIndex {

    @Contract(ALWAYS_FAIL_0)
    private IndexOf() { throw new ImpossibleConstructionException("The utility class \"IndexOf\" cannot be constructed.", IndexOf.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- element --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param <T>        The {@code collection} type
     * @return The index associated to the {@code element} or <b>null</b>
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Object element) {
        if (collection == null)
            return null;
        return __indexOf(collection, element);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param <T>        The {@code collection} type
     * @return The index associated to the {@code element} or <b>null</b>
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(@Nullable CollectionHolder<? extends T> collection, @Nullable Object element) {
        if (collection == null)
            return null;
        return __indexOf(collection, element);
    }

    //#endregion -------------------- element --------------------
    //#region -------------------- element, fromIndex --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param <T>        The {@code collection} type
     * @return The index associated to the {@code element} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Object element, @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __indexOf(collection, element);
        return __indexOf(collection, element, fromIndex);
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
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(@Nullable CollectionHolder<? extends T> collection, @Nullable Object element, @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __indexOf(collection, element);
        return __indexOf(collection, element, fromIndex);
    }

    //#endregion -------------------- element, fromIndex --------------------
    //#region -------------------- element, fromIndex, toIndex --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param <T>        The {@code collection} type
     * @return The index associated to the {@code element} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} and {@code toIndex} are not within a valid range
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Object element, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __indexOf(collection, element);
            else
                return __indexOf(collection, element, fromIndex);
        if (fromIndex == null)
            return __indexOf(collection, element, 0, toIndex);
        return __indexOf(collection, element, fromIndex, toIndex);
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
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(@Nullable CollectionHolder<? extends T> collection, @Nullable Object element, @Nullable Integer fromIndex, @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __indexOf(collection, element);
            else
                return __indexOf(collection, element, fromIndex);
        if (fromIndex == null)
            return __indexOf(collection, element, 0, toIndex);
        return __indexOf(collection, element, fromIndex, toIndex);
    }
    //#endregion -------------------- element, fromIndex, toIndex --------------------
    //#region -------------------- element, fromIndex, toIndex, limit --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a range (if provided)
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @param <T>        The {@code collection} type
     * @return The index associated to the {@code element} within the range or <b>null</b>
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} and {@code limit} are not within a valid range
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Object element, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __indexOf(collection, element);
                else
                    return __indexOf(collection, element, fromIndex);
            else if (fromIndex == null)
                return __indexOf(collection, element, 0, toIndex);
            else
                return __indexOf(collection, element, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __indexOf(collection, element); // TODO handle null fromIndex, toIndex with non-null limit
            else
                return __indexOf(collection, element, fromIndex); // TODO handle null toIndex with non-null limit
        if (fromIndex == null)
            return __indexOf(collection, element, 0, toIndex, limit);
        return __indexOf(collection, element, fromIndex, toIndex, limit);
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
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(@Nullable CollectionHolder<? extends T> collection, @Nullable Object element, @Nullable Integer fromIndex, @Nullable Integer toIndex, @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __indexOf(collection, element);
                else
                    return __indexOf(collection, element, fromIndex);
            else if (fromIndex == null)
                return __indexOf(collection, element, 0, toIndex);
            else
                return __indexOf(collection, element, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __indexOf(collection, element); // TODO handle null fromIndex, toIndex with non-null limit
            else
                return __indexOf(collection, element, fromIndex); // TODO handle null toIndex with non-null limit
        if (fromIndex == null)
            return __indexOf(collection, element, 0, toIndex, limit);
        return __indexOf(collection, element, fromIndex, toIndex, limit);
    }

    //#endregion -------------------- element, fromIndex, toIndex, limit --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- element --------------------

    private static <T> @Nullable Integer __indexOf(final @NotNull MinimalistCollectionHolder<? extends T> collection, final @Nullable Object element) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __withoutALimit(collection, element, -1, size - 1);
    }

    private static <T> @Nullable Integer __indexOf(final @NotNull CollectionHolder<? extends T> collection, final @Nullable Object element) {
        if (collection.isEmpty())
            return null;
        return __withoutALimit(collection, element, -1, collection.size() - 1);
    }

    //#endregion -------------------- element --------------------
    //#region -------------------- element, fromIndex --------------------

    private static <T> @Nullable Integer __indexOf(final @NotNull MinimalistCollectionHolder<? extends T> collection, final @Nullable Object element, final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __withoutALimit(collection, element, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T> @Nullable Integer __indexOf(final @NotNull CollectionHolder<? extends T> collection, final @Nullable Object element, final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __withoutALimit(collection, element, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- element, fromIndex --------------------
    //#region -------------------- element, fromIndex, toIndex --------------------

    private static <T> @Nullable Integer __indexOf(final @NotNull MinimalistCollectionHolder<? extends T> collection, final @Nullable Object element, final int fromIndex, final int toIndex) {
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

        return __withoutALimit(collection, element, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __indexOf(final @NotNull CollectionHolder<? extends T> collection, final @Nullable Object element, final int fromIndex, final int toIndex) {
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

        return __withoutALimit(collection, element, startingIndex, endingIndex);
    }

    //#endregion -------------------- element, fromIndex, toIndex --------------------
    //#region -------------------- element, fromIndex, toIndex, limit --------------------

    private static <T> @Nullable Integer __indexOf(final @NotNull MinimalistCollectionHolder<? extends T> collection, final @Nullable Object element, final int fromIndex, final int toIndex, final int limit) {
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
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection, element, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __indexOf(final @NotNull CollectionHolder<? extends T> collection, final @Nullable Object element, final int fromIndex, final int toIndex, final int limit) {
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
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection, element, startingIndex, endingIndex, maximumIndex);
    }

    //#endregion -------------------- element, fromIndex, toIndex, limit --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static @Nullable Integer __withoutALimit(final @NotNull MinimalistCollectionHolder<?> collection, final @Nullable Object element, final int startingIndex, final int endingIndex) {
        var index = startingIndex;
        if (element == null) {
            while (++index <= endingIndex)
                if (collection.get(index) == null)
                    return index;
            return null;
        }
        while (++index <= endingIndex)
            if (Objects.equals(collection.get(index), element))
                return index;
        return null;
    }

    private static @Nullable Integer __withALimit(final @NotNull MinimalistCollectionHolder<?> collection, final @Nullable Object element, final int startingIndex, final int endingIndex, final int maximumIndex) {
        var index = startingIndex;
        if (element == null) {
            while (++index <= endingIndex)
                if (index >= maximumIndex)
                    return null;
                else if (collection.get(index) == null)
                    return index;
            return null;
        }
        while (++index <= endingIndex)
            if (index >= maximumIndex)
                return null;
            else if (Objects.equals(collection.get(index), element))
                return index;
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
