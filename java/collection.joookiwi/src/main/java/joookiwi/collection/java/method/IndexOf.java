package joookiwi.collection.java.method;

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
public final class IndexOf
        extends AliasUtility {

    @Contract(ALWAYS_FAIL_0)
    private IndexOf() { throw new ImpossibleConstructionException("The utility class “IndexOf” cannot be constructed.", IndexOf.class); }

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
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final T element) { return FirstIndexOf.firstIndexOf(collection, element); }

    /// Get the **first** occurrence equivalent to the value received
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final T element) { return FirstIndexOf.firstIndexOf(collection, element); }

    /// Get the **first** occurrence equivalent to the value received
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                            final T element) { return FirstIndexOf.firstIndexOf(collection, element); }

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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final T element,
                                                                                            final int from) { return FirstIndexOf.firstIndexOf(collection, element, from); }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final T element,
                                                                                            final int from) { return FirstIndexOf.firstIndexOf(collection, element, from); }

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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                            final T element,
                                                                                            final int from) { return FirstIndexOf.firstIndexOf(collection, element, from); }


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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final T element,
                                                                                            final @Nullable Integer from) { return FirstIndexOf.firstIndexOf(collection, element, from); }

    /// Get the **first** occurrence equivalent to the value received
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final T element,
                                                                                            final @Nullable Integer from) { return FirstIndexOf.firstIndexOf(collection, element, from); }

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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                            final T element,
                                                                                            final @Nullable Integer from) { return FirstIndexOf.firstIndexOf(collection, element, from); }

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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final T element,
                                                                                            final int from,
                                                                                            final int to) { return FirstIndexOf.firstIndexOf(collection, element, from, to); }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final T element,
                                                                                            final int from,
                                                                                            final int to) { return FirstIndexOf.firstIndexOf(collection, element, from, to); }

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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                            final T element,
                                                                                            final int from,
                                                                                            final int to) { return FirstIndexOf.firstIndexOf(collection, element, from, to); }


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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final T element,
                                                                                            final int from,
                                                                                            final @Nullable Integer to) { return FirstIndexOf.firstIndexOf(collection, element, from, to); }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final T element,
                                                                                            final int from,
                                                                                            final @Nullable Integer to) { return FirstIndexOf.firstIndexOf(collection, element, from, to); }

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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                            final T element,
                                                                                            final int from,
                                                                                            final @Nullable Integer to) { return FirstIndexOf.firstIndexOf(collection, element, from, to); }


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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final T element,
                                                                                            final @Nullable Integer from,
                                                                                            final int to) { return FirstIndexOf.firstIndexOf(collection, element, from, to); }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final T element,
                                                                                            final @Nullable Integer from,
                                                                                            final int to) { return FirstIndexOf.firstIndexOf(collection, element, from, to); }

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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                            final T element,
                                                                                            final @Nullable Integer from,
                                                                                            final int to) { return FirstIndexOf.firstIndexOf(collection, element, from, to); }


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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                            final T element,
                                                                                            final @Nullable Integer from,
                                                                                            final @Nullable Integer to) { return FirstIndexOf.firstIndexOf(collection, element, from, to); }

    /// Get the **first** occurrence equivalent to the value received
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see java.util.List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final @Nullable CollectionHolder<? extends T> collection,
                                                                                            final T element,
                                                                                            final @Nullable Integer from,
                                                                                            final @Nullable Integer to) { return FirstIndexOf.firstIndexOf(collection, element, from, to); }

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
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_VALUE) int indexOf(final T @Nullable @Unmodifiable [] collection,
                                                                                            final T element,
                                                                                            final @Nullable Integer from,
                                                                                            final @Nullable Integer to) { return FirstIndexOf.firstIndexOf(collection, element, from, to); }

    //#endregion -------------------- element, from, to --------------------

    //#endregion -------------------- Facade methods --------------------

}
