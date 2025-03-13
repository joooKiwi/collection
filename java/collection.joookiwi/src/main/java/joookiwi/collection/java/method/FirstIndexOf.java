package joookiwi.collection.java.method;

import java.util.Objects;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.annotation.OnlyGivePositiveValue;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.InvalidIndexRangeException;
import joookiwi.collection.java.exception.NullCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_2;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_3;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_4;

@NotNullByDefault
public final class FirstIndexOf
        extends UtilityWithIndex {

    @Contract(ALWAYS_FAIL_0)
    private FirstIndexOf() { throw new ImpossibleConstructionException("The utility class “FirstIndexOf” cannot be constructed.", FirstIndexOf.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- element --------------------

    /// Get the **first** occurrence equivalent to the value received
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                 final T element) {
        if (collection == null)
            throw new NullCollectionException();
        return __core0(collection, element);
    }

    /// Get the **first** occurrence equivalent to the value received
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                 final T element) {
        if (collection == null)
            throw new NullCollectionException();
        return __core0(collection, element);
    }

    /// Get the **first** occurrence equivalent to the value received
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, fromIndex?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, fromIndex?, limit?)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                                 final T element) {
        if (collection == null)
            throw new NullCollectionException();
        return __core0(collection, element);
    }

    //#endregion -------------------- element --------------------
    //#region -------------------- element, from --------------------

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                 final T element,
                                                                                                 final int from) {
        if (collection == null)
            throw new NullCollectionException();
        return __core1(collection, element, from);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                 final T element,
                                                                                                 final int from) {
        if (collection == null)
            throw new NullCollectionException();
        return __core1(collection, element, from);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                                 final T element,
                                                                                                 final int from) {
        if (collection == null)
            throw new NullCollectionException();
        return __core1(collection, element, from);
    }


    /// Get the **first** occurrence equivalent to the value received
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                 final T element,
                                                                                                 final @Nullable Integer from) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __core0(collection, element);
        return __core1(collection, element, from);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                 final T element,
                                                                                                 final @Nullable Integer from) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __core0(collection, element);
        return __core1(collection, element, from);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                                 final T element,
                                                                                                 final @Nullable Integer from) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __core0(collection, element);
        return __core1(collection, element, from);
    }

    //#endregion -------------------- element, from --------------------
    //#region -------------------- element, from, to --------------------

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                 final T element,
                                                                                                 final int from,
                                                                                                 final int to) {
        if (collection == null)
            throw new NullCollectionException();
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                 final T element,
                                                                                                 final int from,
                                                                                                 final int to) {
        if (collection == null)
            throw new NullCollectionException();
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                                 final T element,
                                                                                                 final int from,
                                                                                                 final int to) {
        if (collection == null)
            throw new NullCollectionException();
        return __core2(collection, element, from, to);
    }


    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                 final T element,
                                                                                                 final int from,
                                                                                                 final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            return __core1(collection, element, from);
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                 final T element,
                                                                                                 final int from,
                                                                                                 final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            return __core1(collection, element, from);
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                                 final T element,
                                                                                                 final int from,
                                                                                                 final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            return __core1(collection, element, from);
        return __core2(collection, element, from, to);
    }


    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                 final T element,
                                                                                                 final @Nullable Integer from,
                                                                                                 final int to) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __coreWithNoFrom(collection, element, to);
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                 final T element,
                                                                                                 final @Nullable Integer from,
                                                                                                 final int to) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __coreWithNoFrom(collection, element, to);
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`<code>size - 1` by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                                 final T element,
                                                                                                 final @Nullable Integer from,
                                                                                                 final int to) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __coreWithNoFrom(collection, element, to);
        return __core2(collection, element, from, to);
    }


    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                 final T element,
                                                                                                 final @Nullable Integer from,
                                                                                                 final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            if (from == null)
                return __core0(collection, element);
            else
                return __core1(collection, element, from);
        if (from == null)
            return __coreWithNoFrom(collection, element, to);
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                 final T element,
                                                                                                 final @Nullable Integer from,
                                                                                                 final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            if (from == null)
                return __core0(collection, element);
            else
                return __core1(collection, element, from);
        if (from == null)
            return __coreWithNoFrom(collection, element, to);
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, limit?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int firstIndexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                                 final T element,
                                                                                                 final @Nullable Integer from,
                                                                                                 final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            if (from == null)
                return __core0(collection, element);
            else
                return __core1(collection, element, from);
        if (from == null)
            return __coreWithNoFrom(collection, element, to);
        return __core2(collection, element, from, to);
    }

    //#endregion -------------------- element, from, to --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- element --------------------

    private static <T extends @Nullable Object> int __core0(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                            final T element) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __findInRange(collection, element, 0, size - 1);
    }

    private static <T extends @Nullable Object> int __core0(final @NotNull CollectionHolder<? extends T> collection,
                                                            final T element) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();
        return __findInRange(collection, element, 0, collection.size() - 1);
    }

    private static <T extends @Nullable Object> int __core0(final T @NotNull @Unmodifiable [] collection,
                                                            final T element) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __findInRange(collection, element, 0, size - 1);
    }

    //#endregion -------------------- element --------------------
    //#region -------------------- element, from --------------------

    private static <T extends @Nullable Object> int __core1(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                            final T element,
                                                            final int from) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __findInRange(collection, element, _startingIndex(from, size), size - 1);
    }

    private static <T extends @Nullable Object> int __core1(final @NotNull CollectionHolder<? extends T> collection,
                                                            final T element,
                                                            final int from) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();

        final var size = collection.size();
        return __findInRange(collection, element, _startingIndex(from, size), size - 1);
    }

    private static <T extends @Nullable Object> int __core1(final T @NotNull @Unmodifiable [] collection,
                                                            final T element,
                                                            final int from) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __findInRange(collection, element, _startingIndex(from, size), size - 1);
    }

    //#endregion -------------------- element, from --------------------
    //#region -------------------- element, from, to --------------------

    private static <T extends @Nullable Object> int __core2(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                            final T element,
                                                            final int from,
                                                            final int to) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();

        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        _validateInRange(from, startingIndex, to, endingIndex);
        return __findInRange(collection, element, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> int __core2(final @NotNull CollectionHolder<? extends T> collection,
                                                            final T element,
                                                            final int from,
                                                            final int to) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();

        final var size = collection.size();
        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        _validateInRange(from, startingIndex, to, endingIndex);
        return __findInRange(collection, element, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> int __core2(final T @NotNull @Unmodifiable [] collection,
                                                            final T element,
                                                            final int from,
                                                            final int to) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();

        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        _validateInRange(from, startingIndex, to, endingIndex);
        return __findInRange(collection, element, startingIndex, endingIndex);
    }

    //#endregion -------------------- element, from, to --------------------
    //#region -------------------- element, to --------------------

    private static <T extends @Nullable Object> int __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                     final T element,
                                                                     final int to) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __findInRange(collection, element, 0, _endingIndex(to, size));
    }

    private static <T extends @Nullable Object> int __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                                     final T element,
                                                                     final int to) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();
        return __findInRange(collection, element, 0, _endingIndex(to, collection.size()));
    }

    private static <T extends @Nullable Object> int __coreWithNoFrom(final T @NotNull @Unmodifiable [] collection,
                                                                     final T element,
                                                                     final int to) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __findInRange(collection, element, 0, _endingIndex(to, size));
    }

    //#endregion -------------------- element, to --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> int __findInRange(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                  final T element,
                                                                  final int startingIndex,
                                                                  final int endingIndex) {
        var index = startingIndex - 1;
        if (element == null) {
            while (++index <= endingIndex)
                if (collection.get(index) == null)
                    return index;
            throw new IndexOutOfBoundsException("Index out of bound. No index could be found from the starting (“" + startingIndex + "”) to the ending (“" + endingIndex + "”) indexes in the collection.", index);
        }
        while (++index <= endingIndex)
            if (Objects.equals(collection.get(index), element))
                return index;
        throw new IndexOutOfBoundsException("Index out of bound. No index could be found from the starting (“" + startingIndex + "”) to the ending (“" + endingIndex + "”) indexes in the collection.", index);
    }

    private static <T extends @Nullable Object> int __findInRange(final T @NotNull @Unmodifiable [] collection,
                                                                  final T element,
                                                                  final int startingIndex,
                                                                  final int endingIndex) {
        var index = startingIndex - 1;
        if (element == null) {
            while (++index <= endingIndex)
                if (collection[index] == null)
                    return index;
            throw new IndexOutOfBoundsException("Index out of bound. No index could be found from the starting (“" + startingIndex + "”) to the ending (“" + endingIndex + "”) indexes in the collection.", index);
        }
        while (++index <= endingIndex)
            if (Objects.equals(collection[index], element))
                return index;
        throw new IndexOutOfBoundsException("Index out of bound. No index could be found from the starting (“" + startingIndex + "”) to the ending (“" + endingIndex + "”) indexes in the collection.", index);
    }

    //#endregion -------------------- Loop methods --------------------

}
