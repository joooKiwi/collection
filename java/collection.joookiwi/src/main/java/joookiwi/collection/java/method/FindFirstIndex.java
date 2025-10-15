package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.annotation.OnlyGivePositiveValue;
import joookiwi.collection.java.callback.ObjIntPredicate;
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

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_2;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_3;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_4;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public final class FindFirstIndex
        extends AliasUtility {

    @Contract(ALWAYS_FAIL_0)
    private FindFirstIndex() { throw new ImpossibleConstructionException("The utility class “FindFirstIndex” cannot be constructed.", FindFirstIndex.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Get the first index matching the `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate) { return IndexOfFirst.indexOfFirst(collection, predicate); }

    /// Get the first index matching the `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate) { return IndexOfFirst.indexOfFirst(collection, predicate); }

    /// Get the first index matching the `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final ObjIntPredicate<? super T> predicate) { return IndexOfFirst.indexOfFirst(collection, predicate); }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Get the first index matching the `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate) { return IndexOfFirst.indexOfFirst(collection, predicate); }

    /// Get the first index matching the `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate) { return IndexOfFirst.indexOfFirst(collection, predicate); }

    /// Get the first index matching the `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final Predicate<? super T> predicate) { return IndexOfFirst.indexOfFirst(collection, predicate); }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the first index matching the `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate) { return IndexOfFirst.indexOfFirst(collection, predicate); }

    /// Get the first index matching the `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate) { return IndexOfFirst.indexOfFirst(collection, predicate); }

    /// Get the first index matching the `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final BooleanSupplier predicate) { return IndexOfFirst.indexOfFirst(collection, predicate); }

    //#endregion -------------------- predicate () → boolean --------------------

    //#region -------------------- predicate (T, int) → boolean, from --------------------

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final int from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final int from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final int from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }


    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final @Nullable Integer from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final @Nullable Integer from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final @Nullable Integer from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    //#endregion -------------------- predicate (T, int) → boolean, from --------------------
    //#region -------------------- predicate (T) → boolean, from --------------------

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final int from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final int from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final int from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }


    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final @Nullable Integer from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final @Nullable Integer from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final @Nullable Integer from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    //#endregion -------------------- predicate (T) → boolean, from --------------------
    //#region -------------------- predicate () → boolean, from --------------------

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final int from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final int from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final int from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }


    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final @Nullable Integer from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final @Nullable Integer from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` is `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException `from` is not within a valid range
    /// @throws IndexOutOfBoundsException No index could be found
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final @Nullable Integer from) { return IndexOfFirst.indexOfFirst(collection, predicate, from); }

    //#endregion -------------------- predicate () → boolean, from --------------------

    //#region -------------------- predicate (T, int) → boolean, from, to --------------------

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final int from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final int from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final int from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }


    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final int from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final int from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final int from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }


    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }


    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final ObjIntPredicate<? super T> predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    //#endregion -------------------- predicate (T, int) → boolean, from, to --------------------
    //#region -------------------- predicate (T) → boolean, from, to --------------------

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final int from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final int from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final int from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }


    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final int from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final int from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final int from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }


    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }


    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final Predicate<? super T> predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    //#endregion -------------------- predicate (T) → boolean, from, to --------------------
    //#region -------------------- predicate () → boolean, from, to --------------------

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final int from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final int from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final int from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }


    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final int from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final int from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final int from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }


    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final int to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }


    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException    The `collection` is `null`
    /// @throws EmptyCollectionException   The `collection` **is empty**
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException  No index could be found
    /// @throws InvalidIndexRangeException `to` is before `from` after the calculation
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findIndex">ReadonlyArray.findIndex(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html">Kotlin indexOfFirst(predicate)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_FAIL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final BooleanSupplier predicate,
                                                                                                       final @Nullable Integer from,
                                                                                                       final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(collection, predicate, from, to); }

    //#endregion -------------------- predicate () → boolean, from, to --------------------

    //#endregion -------------------- Facade methods --------------------

}
