package joookiwi.collection.java.method;

import java.util.Objects;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_2;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_3;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_4;

@NotNullByDefault
public final class LastIndexOf
        extends UtilityWithIndex {

    @Contract(ALWAYS_FAIL_0)
    private LastIndexOf() { throw new ImpossibleConstructionException("The utility class “LastIndexOf” cannot be constructed.", LastIndexOf.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- element --------------------

    /// Get the **last** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param <T>        The `collection` and `element` type
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final T element) {
        if (collection == null)
            return null;
        return __core(collection, element);
    }

    /// Get the **last** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param <T>        The `collection` and `element` type
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final T element) {
        if (collection == null)
            return null;
        return __core(collection, element);
    }

    /// Get the **last** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param <T>        The `collection` and `element` type
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                     final T element) {
        if (collection == null)
            return null;
        return __core(collection, element);
    }

    //#endregion -------------------- element --------------------
    //#region -------------------- element, from --------------------

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final T element,
                                                                                     final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, element, fromIndex);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final T element,
                                                                                     final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, element, fromIndex);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                     final T element,
                                                                                     final int fromIndex) {
        if (collection == null)
            return null;
        return __core(collection, element, fromIndex);
    }


    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final T element,
                                                                                     final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, element);
        return __core(collection, element, fromIndex);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final T element,
                                                                                     final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, element);
        return __core(collection, element, fromIndex);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                     final T element,
                                                                                     final @Nullable Integer fromIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __core(collection, element);
        return __core(collection, element, fromIndex);
    }

    //#endregion -------------------- element, from --------------------
    //#region -------------------- element, from, to --------------------

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final T element,
                                                                                     final int fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, element, fromIndex, toIndex);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final T element,
                                                                                     final int fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, element, fromIndex, toIndex);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                     final T element,
                                                                                     final int fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        return __core(collection, element, fromIndex, toIndex);
    }


    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final T element,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, element, fromIndex);
        return __core(collection, element, fromIndex, toIndex);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final T element,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, element, fromIndex);
        return __core(collection, element, fromIndex, toIndex);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                     final T element,
                                                                                     final int fromIndex,
                                                                                     final @Nullable Integer toIndex) {
        if (collection == null)
            return null;
        if (toIndex == null)
            return __core(collection, element, fromIndex);
        return __core(collection, element, fromIndex, toIndex);
    }


    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final T element,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex);
        return __core(collection, element, fromIndex, toIndex);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final T element,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex);
        return __core(collection, element, fromIndex, toIndex);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                     final T element,
                                                                                     final @Nullable Integer fromIndex,
                                                                                     final int toIndex) {
        if (collection == null)
            return null;
        if (fromIndex == null)
            return __coreWithNoFrom(collection, element, toIndex);
        return __core(collection, element, fromIndex, toIndex);
    }


    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final @Nullable CollectionHolder<? extends T> collection,
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

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` and `element` type
    /// @throws joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.List#lastIndexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">ReadonlyArray.lastIndexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T> @Range(from = 0, to = MAX_VALUE) @Nullable Integer lastIndexOf(final T @Nullable @Unmodifiable [] collection,
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

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- Core methods (element) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final T element) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __findLastInRange(collection, element, -1, size -1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final T element) {
        if (collection.isEmpty())
            return null;
        return __findLastInRange(collection, element, -1, collection.size() -1);
    }

    private static <T> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                final T element) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __findLastInRange(collection, element, -1, size -1);
    }

    //#endregion -------------------- Core methods (element) --------------------
    //#region -------------------- Core methods (element, from) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final T element,
                                                final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __findLastInRange(collection, element, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final T element,
                                                final int fromIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        return __findLastInRange(collection, element, _startingIndex(fromIndex, size), size - 1);
    }

    private static <T> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                final T element,
                                                final int fromIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __findLastInRange(collection, element, _startingIndex(fromIndex, size), size - 1);
    }

    //#endregion -------------------- Core methods (element, from) --------------------
    //#region -------------------- Core methods (element, from, to) --------------------

    private static <T> @Nullable Integer __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                final T element,
                                                final int fromIndex,
                                                final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __findLastInRange(collection, element, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __core(final @NotNull CollectionHolder<? extends T> collection,
                                                final T element,
                                                final int fromIndex,
                                                final int toIndex) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __findLastInRange(collection, element, startingIndex, endingIndex);
    }

    private static <T> @Nullable Integer __core(final T @NotNull @Unmodifiable [] collection,
                                                final T element,
                                                final int fromIndex,
                                                final int toIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            return null;
        return __findLastInRange(collection, element, startingIndex, endingIndex);
    }

    //#endregion -------------------- Core methods (element, from, to) --------------------
    //#region -------------------- Core methods (element, to) --------------------

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                          final T element,
                                                          final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __findLastInRange(collection, element, 0, _endingIndex(toIndex, size));
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                          final T element,
                                                          final int toIndex) {
        if (collection.isEmpty())
            return null;
        return __findLastInRange(collection, element, 0, _endingIndex(toIndex, collection.size()));
    }

    private static <T> @Nullable Integer __coreWithNoFrom(final T @NotNull @Unmodifiable [] collection,
                                                          final T element,
                                                          final int toIndex) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __findLastInRange(collection, element, 0, _endingIndex(toIndex, size));
    }

    //#endregion -------------------- Core methods (element, to) --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @Nullable Integer __findLastInRange(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                           final T element,
                                                           final int startingIndex,
                                                           final int endingIndex) {
        var index = endingIndex + 1;
        if (element == null) {
            while (++index >= startingIndex)
                if (collection.get(index) == null)
                    return index;
            return null;
        }
        while (--index >= startingIndex)
            if (Objects.equals(collection.get(index), element))
                return index;
        return null;
    }

    private static <T> @Nullable Integer __findLastInRange(final T @NotNull @Unmodifiable [] collection,
                                                           final T element,
                                                           final int startingIndex,
                                                           final int endingIndex) {
        var index = endingIndex + 1;
        if (element == null) {
            while (++index >= startingIndex)
                if (collection[index] == null)
                    return index;
            return null;
        }
        while (--index >= startingIndex)
            if (Objects.equals(collection[index], element))
                return index;
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
