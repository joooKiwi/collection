package joookiwi.collection.java.method;

import java.util.Objects;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
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

public final class LastIndexOf
        extends UtilityWithIndex {

    @Contract(ALWAYS_FAIL_0)
    private LastIndexOf() { throw new ImpossibleConstructionException("The utility class “LastIndexOf” cannot be constructed.", LastIndexOf.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- minimalist - element --------------------

    /**
     * Get the <b>last</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element) {
        if (collection == null)
            return null;
        return __core(collection, element);
    }

    //#endregion -------------------- minimalist - element --------------------
    //#region -------------------- element --------------------

    /**
     * Get the <b>last</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element) {
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
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
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
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
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
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
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
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
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
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
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
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
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
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
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
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
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
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
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
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
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
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
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
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
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

    //#region -------------------- minimalist - element, from, to, limit --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            return __core(collection, element, fromIndex, toIndex);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __coreWithNoTo(collection, element, fromIndex, limit);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                return __core(collection, element, fromIndex);
            else
                return __core(collection, element, fromIndex, toIndex);
        if (toIndex == null)
            return __coreWithNoTo(collection, element, fromIndex, limit);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex, limit);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (fromIndex == null)
                return __coreWithNoFrom(collection, element, toIndex);
            else
                return __core(collection, element, fromIndex, toIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex, limit);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, element, limit);
            else
                return __coreWithNoTo(collection, element, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex, limit);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __core(collection, element);
                else
                    return __core(collection, element, fromIndex);
            else if (fromIndex == null)
                return __coreWithNoFrom(collection, element, toIndex);
            else
                return __core(collection, element, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, element, limit);
            else
                return __coreWithNoTo(collection, element, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex, limit);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    //#endregion -------------------- minimalist - element, from, to, limit --------------------
    //#region -------------------- element, from, to, limit --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final int fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            return __core(collection, element, fromIndex, toIndex);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __coreWithNoTo(collection, element, fromIndex, limit);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                return __core(collection, element, fromIndex);
            else
                return __core(collection, element, fromIndex, toIndex);
        if (toIndex == null)
            return __coreWithNoTo(collection, element, fromIndex, limit);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex, limit);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (fromIndex == null)
                return __coreWithNoFrom(collection, element, toIndex);
            else
                return __core(collection, element, fromIndex, toIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex, limit);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final int limit) {
        if (collection == null)
            return null;
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, element, limit);
            else
                return __coreWithNoTo(collection, element, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex, limit);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the {@code collection}
     * from a start to an end applying a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param element    The element to find
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.List#lastIndexOf(Object)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_5)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Object element,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final @Nullable Integer toIndex,
                                                                                     final @Nullable Integer limit) {
        if (collection == null)
            return null;
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __core(collection, element);
                else
                    return __core(collection, element, fromIndex);
            else if (fromIndex == null)
                return __coreWithNoFrom(collection, element, toIndex);
            else
                return __core(collection, element, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, element, limit);
            else
                return __coreWithNoTo(collection, element, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex, limit);
        return __core(collection, element, fromIndex, toIndex, limit);
    }

    //#endregion -------------------- element, from, to, limit --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- Core methods (minimalist - element) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @Nullable Object element) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __withoutALimit(collection, element, -1, size -1);
    }

    //#endregion -------------------- Core methods (minimalist - element) --------------------
    //#region -------------------- Core methods (element) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @Nullable Object element) {
        if (collection.isEmpty())
            return null;
        return __withoutALimit(collection, element, -1, collection.size() -1);
    }

    //#endregion -------------------- Core methods (element) --------------------

    //#region -------------------- Core methods (minimalist - element, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @Nullable Object element,
                                                final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __withoutALimit(collection, element, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- Core methods (minimalist - element, from) --------------------
    //#region -------------------- Core methods (element, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @Nullable Object element,
                                                final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __withoutALimit(collection, element, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- Core methods (element, from) --------------------

    //#region -------------------- Core methods (minimalist - element, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @Nullable Object element,
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

        return __withoutALimit(collection, element, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final @Nullable Object element,
                                                          final int toIndex) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return null;
        if (toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        final var endingIndex = _endingIndex(toIndex, size);
        return __withoutALimit(collection, element, 0, endingIndex);
    }

    //#endregion -------------------- Core methods (minimalist - element, from, to) --------------------
    //#region -------------------- Core methods (element, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @Nullable Object element,
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

        return __withoutALimit(collection, element, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final @Nullable Object element,
                                                          final int toIndex) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (toIndex == 0)
            return null;

        //#endregion -------------------- Early returns --------------------

        final var endingIndex = _endingIndex(toIndex, collection.size());
        return __withoutALimit(collection, element, 0, endingIndex);
    }

    //#endregion -------------------- Core methods (element, from, to) --------------------

    //#region -------------------- Core methods (minimalist - element, from, to, limit) --------------------

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final @Nullable Object element,
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
        if (maximumIndex > endingIndex)
            return null;

        //#endregion -------------------- Initialization (ending/maximum index) --------------------

        return __withALimit(collection, element, 0, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoTo(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                        final @Nullable Object element,
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
        if (endingIndex < startingIndex)
            return null;

        final var maximumIndex = _maximumIndex(limit, size);
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/maximum index) --------------------

        return __withALimit(collection, element, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFromAndTo(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                               final @Nullable Object element,
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

        return __withALimit(collection, element, 0, size - 1, maximumIndex);
    }

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final @Nullable Object element,
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
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection, element, startingIndex, endingIndex, maximumIndex);
    }

    //#endregion -------------------- Core methods (minimalist - element, from, to, limit) --------------------
    //#region -------------------- Core methods (element, from, to, limit) --------------------

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final @Nullable Object element,
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
        if (maximumIndex > endingIndex)
            return null;

        //#endregion -------------------- Initialization (ending/maximum index) --------------------

        return __withALimit(collection, element, 0, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoTo(final @NotNull CollectionHolder<? extends T> collection,
                                                        final @Nullable Object element,
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
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/maximum index) --------------------

        return __withALimit(collection, element, startingIndex, endingIndex, maximumIndex);
    }

    private static <T> @Nullable Integer __coreWithNoFromAndTo(final @NotNull CollectionHolder<? extends T> collection,
                                                               final @Nullable Object element,
                                                               final int limit) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return null;
        if (limit == 0)
            return null;

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (maximum index) --------------------

        final var size = collection.size();
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex > size)
            return null;

        //#endregion -------------------- Initialization (maximum index) --------------------

        return __withALimit(collection, element, 0, size - 1, maximumIndex);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final @Nullable Object element,
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
        if (endingIndex - startingIndex < maximumIndex - 1)
            return null;

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return __withALimit(collection, element, startingIndex, endingIndex, maximumIndex);
    }

    //#endregion -------------------- Core methods (element, from, to, limit) --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static @Nullable Integer __withoutALimit(final @NotNull MinimalistCollectionHolder<?> collection,
                                                     final @Nullable Object element,
                                                     final int startingIndex,
                                                     final int endingIndex) {
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

    private static @Nullable Integer __withALimit(final @NotNull MinimalistCollectionHolder<?> collection,
                                                  final @Nullable Object element,
                                                  final int startingIndex,
                                                  final int endingIndex,
                                                  final int maximumIndex) {
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
