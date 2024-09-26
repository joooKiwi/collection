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
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_2;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_3;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_4;

public final class IndexOf
        extends UtilityWithIndex {

    @Contract(ALWAYS_FAIL_0)
    private IndexOf() { throw new ImpossibleConstructionException("The utility class “IndexOf” cannot be constructed.", IndexOf.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- minimalist - element --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param <T>        The {@code collection} and {@code element} type
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                 final T element) {
        if (collection == null)
            return null;
        return __core(collection, element);
    }

    //#endregion -------------------- minimalist - element --------------------
    //#region -------------------- element --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param <T>        The {@code collection} and {@code element} type
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                 final T element) {
        if (collection == null)
            return null;
        return __core(collection, element);
    }

    //#endregion -------------------- element --------------------

    //#region -------------------- minimalist - element, from --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param <T>        The {@code collection} and {@code element} type
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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                 final T element,
                                                                                 final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, element, fromIndex);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param <T>        The {@code collection} and {@code element} type
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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                 final T element,
                                                                                 final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, element);
        return __core(collection, element, fromIndex);
    }

    //#endregion -------------------- minimalist - element, from --------------------
    //#region -------------------- element, from --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param <T>        The {@code collection} and {@code element} type
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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                 final T element,
                                                                                 final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, element, fromIndex);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param <T>        The {@code collection} and {@code element} type
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
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                 final T element,
                                                                                 final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, element);
        return __core(collection, element, fromIndex);
    }

    //#endregion -------------------- element, from --------------------

    //#region -------------------- minimalist - element, from, to --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param <T>        The {@code collection} and {@code element} type
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                 final T element,
                                                                                 final int fromIndex,
                                                                                 final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, element, fromIndex, toIndex);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param <T>        The {@code collection} and {@code element} type
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                 final T element,
                                                                                 final int fromIndex,
                                                                                 final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, element, fromIndex);
        return __core(collection, element, fromIndex, toIndex);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param <T>        The {@code collection} and {@code element} type
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                 final T element,
                                                                                 final @Nullable Integer fromIndex,
                                                                                 final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex);
        return __core(collection, element, fromIndex, toIndex);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param <T>        The {@code collection} and {@code element} type
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                 final T element,
                                                                                 final @Nullable Integer fromIndex,
                                                                                 final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __core(collection, element);
            else
                return __core(collection, element, fromIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex);
        return __core(collection, element, fromIndex, toIndex);
    }

    //#endregion -------------------- minimalist - element, from, to --------------------
    //#region -------------------- element, from, to --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param <T>        The {@code collection} and {@code element} type
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                 final T element,
                                                                                 final int fromIndex,
                                                                                 final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, element, fromIndex, toIndex);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param <T>        The {@code collection} and {@code element} type
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                 final T element,
                                                                                 final int fromIndex,
                                                                                 final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, element, fromIndex);
        return __core(collection, element, fromIndex, toIndex);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param <T>        The {@code collection} and {@code element} type
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                 final T element,
                                                                                 final @Nullable Integer fromIndex,
                                                                                 final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex);
        return __core(collection, element, fromIndex, toIndex);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param <T>        The {@code collection} and {@code element} type
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#indexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                 final T element,
                                                                                 final @Nullable Integer fromIndex,
                                                                                 final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __core(collection, element);
            else
                return __core(collection, element, fromIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex);
        return __core(collection, element, fromIndex, toIndex);
    }

    //#endregion -------------------- element, from, to --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- Core methods (element) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final T element) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __findInRange(collection, element, -1, size - 1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final T element) {
        if (collection.isEmpty())
            return null;
        return __findInRange(collection, element, -1, collection.size() - 1);
    }

    //#endregion -------------------- Core methods (element) --------------------
    //#region -------------------- Core methods (element, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final T element,
                                                final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __findInRange(collection, element, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final T element,
                                                final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __findInRange(collection, element, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- Core methods (element, from) --------------------
    //#region -------------------- Core methods (element, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final T element,
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

        return __findInRange(collection, element, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final T element,
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

        return __findInRange(collection, element, startingIndex, endingIndex);
    }

    //#endregion -------------------- Core methods (element, from, to) --------------------
    //#region -------------------- Core methods (element, to) --------------------

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final T element,
                                                          final int toIndex) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        final var endingIndex = _endingIndex(toIndex, size);
        return __findInRange(collection, element, 0, endingIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final T element,
                                                          final int toIndex) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        final var endingIndex = _endingIndex(toIndex, collection.size());
        return __findInRange(collection, element, 0, endingIndex);
    }

    //#endregion -------------------- Core methods (element, to) --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @Nullable Integer __findInRange(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                       final T element,
                                                       final int startingIndex,
                                                       final int endingIndex) {
        var index = startingIndex - 1;
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

    //#endregion -------------------- Loop methods --------------------

}
