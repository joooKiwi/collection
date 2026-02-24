package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.IntPredicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.annotation.OnlyGivePositiveValue;
import joookiwi.collection.java.callback.IntObjPredicate;
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
public final class IndexOfFirstIndexed
        extends UtilityWithIndex {

    @Contract(ALWAYS_FAIL_0)
    private IndexOfFirstIndexed() { throw new ImpossibleConstructionException("The utility class “IndexOfFirstIndexed” cannot be constructed.", IndexOfFirstIndexed.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (int, T) → boolean --------------------

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate);
    }

    /// Get the first index matching the `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntObjPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate (int, T) → boolean --------------------
    //#region -------------------- predicate (int) → boolean --------------------

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate);
    }

    /// Get the first index matching the `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntPredicate predicate) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate (int) → boolean --------------------
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate);
    }

    /// Get the first index matching the `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final BooleanSupplier predicate) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#region -------------------- predicate (int, T) → boolean, from --------------------

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final int from) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final int from) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final int from) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from);
    }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final @Nullable Integer from) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final @Nullable Integer from) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final @Nullable Integer from) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    //#endregion -------------------- predicate (int, T) → boolean, from --------------------
    //#region -------------------- predicate (int) → boolean, from --------------------

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final int from) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final int from) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final int from) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from);
    }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final @Nullable Integer from) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final @Nullable Integer from) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final @Nullable Integer from) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    //#endregion -------------------- predicate (int) → boolean, from --------------------
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final int from) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final int from) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final int from) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from);
    }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final @Nullable Integer from) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final @Nullable Integer from) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final @Nullable Integer from) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __core(collection, predicate);
        return __core(collection, predicate, from);
    }

    //#endregion -------------------- predicate () → boolean, from --------------------

    //#region -------------------- predicate (int, T) → boolean, from, to --------------------

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final int from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final int from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from, to);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final int from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from, to);
    }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final int from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final int from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final int from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntObjPredicate<? super T> predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    //#endregion -------------------- predicate (int, T) → boolean, from, to --------------------
    //#region -------------------- predicate (int) → boolean, from, to --------------------

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final int from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final int from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from, to);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final int from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from, to);
    }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final int from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final int from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final int from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final IntPredicate predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    //#endregion -------------------- predicate (int) → boolean, from, to --------------------
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final int from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final int from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from, to);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final int from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        return __core(collection, predicate, from, to);
    }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final int from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final int from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final int from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            return __core(collection, predicate, from);
        return __core(collection, predicate, from, to);
    }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final int to) {
        if (collection == null)
            throw new NullCollectionException();
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    /// Get the first index matching the `predicate`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final BooleanSupplier predicate,
                                                                                                            final @Nullable Integer from,
                                                                                                            final @Nullable Integer to) {
        if (collection == null)
            throw new NullCollectionException();
        if (to == null)
            if (from == null)
                return __core(collection, predicate);
            else
                return __core(collection, predicate, from);
        if (from == null)
            return __coreWithNoFrom(collection, predicate, to);
        return __core(collection, predicate, from, to);
    }

    //#endregion -------------------- predicate () → boolean, from, to --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- Core methods (predicate (int, T) → boolean) --------------------

    private static <T extends @Nullable Object> int __core(final MinimalistCollectionHolder<? extends T> collection,
                                                           final IntObjPredicate<? super T> predicate) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, 0, size - 1);
    }

    private static <T extends @Nullable Object> int __core(final CollectionHolder<? extends T> collection,
                                                           final IntObjPredicate<? super T> predicate) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, 0, collection.size() - 1);
    }

    private static <T extends @Nullable Object> int __core(final T @Unmodifiable [] collection,
                                                           final IntObjPredicate<? super T> predicate) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, 0, size - 1);
    }

    //#endregion -------------------- Core methods (predicate (int, T) → boolean) --------------------
    //#region -------------------- Core methods (predicate (int) → boolean) --------------------

    private static <T extends @Nullable Object> int __core(final MinimalistCollectionHolder<? extends T> collection,
                                                           final IntPredicate predicate) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with1Argument(predicate, 0, size - 1);
    }

    private static <T extends @Nullable Object> int __core(final CollectionHolder<? extends T> collection,
                                                           final IntPredicate predicate) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();
        return __with1Argument(predicate, 0, collection.size() - 1);
    }

    private static <T extends @Nullable Object> int __core(final T @Unmodifiable [] collection,
                                                           final IntPredicate predicate) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with1Argument(predicate, 0, size - 1);
    }

    //#endregion -------------------- Core methods (predicate (int) → boolean) --------------------
    //#region -------------------- Core methods (predicate () → boolean) --------------------

    private static <T extends @Nullable Object> int __core(final MinimalistCollectionHolder<? extends T> collection,
                                                           final BooleanSupplier predicate) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with0Argument(predicate, 0, size - 1);
    }

    private static <T extends @Nullable Object> int __core(final CollectionHolder<? extends T> collection,
                                                           final BooleanSupplier predicate) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();
        return __with0Argument(predicate, 0, collection.size() - 1);
    }

    private static <T extends @Nullable Object> int __core(final T @Unmodifiable [] collection,
                                                           final BooleanSupplier predicate) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with0Argument(predicate, 0, size - 1);
    }

    //#endregion -------------------- Core methods (predicate () → boolean) --------------------

    //#region -------------------- Core methods (predicate (int, T) → boolean, from) --------------------

    private static <T extends @Nullable Object> int __core(final MinimalistCollectionHolder<? extends T> collection,
                                                           final IntObjPredicate<? super T> predicate,
                                                           final int from) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, _startingIndex(from, size), size - 1);
    }

    private static <T extends @Nullable Object> int __core(final CollectionHolder<? extends T> collection,
                                                           final IntObjPredicate<? super T> predicate,
                                                           final int from) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();

        final var size = collection.size();
        return __with2Argument(collection, predicate, _startingIndex(from, size), size - 1);
    }

    private static <T extends @Nullable Object> int __core(final T @Unmodifiable [] collection,
                                                           final IntObjPredicate<? super T> predicate,
                                                           final int from) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, _startingIndex(from, size), size - 1);
    }

    //#endregion -------------------- Core methods (predicate (int, T) → boolean, from) --------------------
    //#region -------------------- Core methods (predicate (int) → boolean, from) --------------------

    private static <T extends @Nullable Object> int __core(final MinimalistCollectionHolder<? extends T> collection,
                                                           final IntPredicate predicate,
                                                           final int from) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with1Argument(predicate, _startingIndex(from, size), size - 1);
    }

    private static <T extends @Nullable Object> int __core(final CollectionHolder<? extends T> collection,
                                                           final IntPredicate predicate,
                                                           final int from) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();

        final var size = collection.size();
        return __with1Argument(predicate, _startingIndex(from, size), size - 1);
    }

    private static <T extends @Nullable Object> int __core(final T @Unmodifiable [] collection,
                                                           final IntPredicate predicate,
                                                           final int from) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with1Argument(predicate, _startingIndex(from, size), size - 1);
    }

    //#endregion -------------------- Core methods (predicate (int) → boolean, from) --------------------
    //#region -------------------- Core methods (predicate () → boolean, from) --------------------

    private static <T extends @Nullable Object> int __core(final MinimalistCollectionHolder<? extends T> collection,
                                                           final BooleanSupplier predicate,
                                                           final int from) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with0Argument(predicate, _startingIndex(from, size), size - 1);
    }

    private static <T extends @Nullable Object> int __core(final CollectionHolder<? extends T> collection,
                                                           final BooleanSupplier predicate,
                                                           final int from) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();

        final var size = collection.size();
        return __with0Argument(predicate, _startingIndex(from, size), size - 1);
    }

    private static <T extends @Nullable Object> int __core(final T @Unmodifiable [] collection,
                                                           final BooleanSupplier predicate,
                                                           final int from) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with0Argument(predicate, _startingIndex(from, size), size - 1);
    }

    //#endregion -------------------- Core methods (predicate () → boolean, from) --------------------

    //#region -------------------- Core methods (predicate (int, T) → boolean, from, to) --------------------

    private static <T extends @Nullable Object> int __core(final MinimalistCollectionHolder<? extends T> collection,
                                                           final IntObjPredicate<? super T> predicate,
                                                           final int from,
                                                           final int to) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();

        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        _validateInRange(from, startingIndex, to, endingIndex);
        return __with2Argument(collection, predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> int __core(final CollectionHolder<? extends T> collection,
                                                           final IntObjPredicate<? super T> predicate,
                                                           final int from,
                                                           final int to) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();

        final var size = collection.size();
        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        _validateInRange(from, startingIndex, to, endingIndex);
        return __with2Argument(collection, predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> int __core(final T @Unmodifiable [] collection,
                                                           final IntObjPredicate<? super T> predicate,
                                                           final int from,
                                                           final int to) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();

        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        _validateInRange(from, startingIndex, to, endingIndex);
        return __with2Argument(collection, predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate (int, T) → boolean, from, to) --------------------
    //#region -------------------- Core methods (predicate (int) → boolean, from, to) --------------------

    private static <T extends @Nullable Object> int __core(final MinimalistCollectionHolder<? extends T> collection,
                                                           final IntPredicate predicate,
                                                           final int from,
                                                           final int to) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();

        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        _validateInRange(from, startingIndex, to, endingIndex);
        return __with1Argument(predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> int __core(final CollectionHolder<? extends T> collection,
                                                           final IntPredicate predicate,
                                                           final int from,
                                                           final int to) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();

        final var size = collection.size();
        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        _validateInRange(from, startingIndex, to, endingIndex);
        return __with1Argument(predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> int __core(final T @Unmodifiable [] collection,
                                                           final IntPredicate predicate,
                                                           final int from,
                                                           final int to) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();

        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        _validateInRange(from, startingIndex, to, endingIndex);
        return __with1Argument(predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate (int) → boolean, from, to) --------------------
    //#region -------------------- Core methods (predicate () → boolean, from, to) --------------------

    private static <T extends @Nullable Object> int __core(final MinimalistCollectionHolder<? extends T> collection,
                                                           final BooleanSupplier predicate,
                                                           final int from,
                                                           final int to) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();

        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        _validateInRange(from, startingIndex, to, endingIndex);
        return __with0Argument(predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> int __core(final CollectionHolder<? extends T> collection,
                                                           final BooleanSupplier predicate,
                                                           final int from,
                                                           final int to) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();

        final var size = collection.size();
        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        _validateInRange(from, startingIndex, to, endingIndex);
        return __with0Argument(predicate, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> int __core(final T @Unmodifiable [] collection,
                                                           final BooleanSupplier predicate,
                                                           final int from,
                                                           final int to) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();

        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        _validateInRange(from, startingIndex, to, endingIndex);
        return __with0Argument(predicate, startingIndex, endingIndex);
    }

    //#endregion -------------------- Core methods (predicate () → boolean, from, to) --------------------

    //#region -------------------- Core methods (predicate (int, T) → boolean, to) --------------------

    private static <T extends @Nullable Object> int __coreWithNoFrom(final MinimalistCollectionHolder<? extends T> collection,
                                                                     final IntObjPredicate<? super T> predicate,
                                                                     final int to) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, 0, _endingIndex(to, size));
    }

    private static <T extends @Nullable Object> int __coreWithNoFrom(final CollectionHolder<? extends T> collection,
                                                                     final IntObjPredicate<? super T> predicate,
                                                                     final int to) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, 0, _endingIndex(to, collection.size()));
    }

    private static <T extends @Nullable Object> int __coreWithNoFrom(final T @Unmodifiable [] collection,
                                                                     final IntObjPredicate<? super T> predicate,
                                                                     final int to) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, 0, _endingIndex(to, size));
    }

    //#endregion -------------------- Core methods (predicate (int, T) → boolean, to) --------------------
    //#region -------------------- Core methods (predicate (int) → boolean, to) --------------------

    private static <T extends @Nullable Object> int __coreWithNoFrom(final MinimalistCollectionHolder<? extends T> collection,
                                                                     final IntPredicate predicate,
                                                                     final int to) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with1Argument(predicate, 0, _endingIndex(to, size));
    }

    private static <T extends @Nullable Object> int __coreWithNoFrom(final CollectionHolder<? extends T> collection,
                                                                     final IntPredicate predicate,
                                                                     final int to) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();
        return __with1Argument(predicate, 0, _endingIndex(to, collection.size()));
    }

    private static <T extends @Nullable Object> int __coreWithNoFrom(final T @Unmodifiable [] collection,
                                                                     final IntPredicate predicate,
                                                                     final int to) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with1Argument(predicate, 0, _endingIndex(to, size));
    }

    //#endregion -------------------- Core methods (predicate (int) → boolean, to) --------------------
    //#region -------------------- Core methods (predicate () → boolean, to) --------------------

    private static <T extends @Nullable Object> int __coreWithNoFrom(final MinimalistCollectionHolder<? extends T> collection,
                                                                     final BooleanSupplier predicate,
                                                                     final int to) {
        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with0Argument(predicate, 0, _endingIndex(to, size));
    }

    private static <T extends @Nullable Object> int __coreWithNoFrom(final CollectionHolder<? extends T> collection,
                                                                     final BooleanSupplier predicate,
                                                                     final int to) {
        if (collection.isEmpty())
            throw new EmptyCollectionException();
        return __with0Argument(predicate, 0, _endingIndex(to, collection.size()));
    }

    private static <T extends @Nullable Object> int __coreWithNoFrom(final T @Unmodifiable [] collection,
                                                                     final BooleanSupplier predicate,
                                                                     final int to) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with0Argument(predicate, 0, _endingIndex(to, size));
    }

    //#endregion -------------------- Core methods (predicate () → boolean, to) --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static int __with0Argument(final BooleanSupplier predicate,
                                       final int startingIndex,
                                       final int endingIndex) {
        var index = startingIndex - 1;
        while (++index <= endingIndex)
            if (predicate.getAsBoolean())
                return index;
        throw new IndexOutOfBoundsException("Index out of bound. No index could be found from the starting (“" + startingIndex + "”) to the ending (“" + endingIndex + "”) indexes in the collection.", index);
    }


    private static int __with1Argument(final IntPredicate predicate,
                                       final int startingIndex,
                                       final int endingIndex) {
        var index = startingIndex - 1;
        while (++index <= endingIndex)
            if (predicate.test(index))
                return index;
        throw new IndexOutOfBoundsException("Index out of bound. No index could be found from the starting (“" + startingIndex + "”) to the ending (“" + endingIndex + "”) indexes in the collection.", index);
    }


    private static <T extends @Nullable Object> int __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                    final IntObjPredicate<? super T> predicate,
                                                                    final int startingIndex,
                                                                    final int endingIndex) {
        var index = startingIndex - 1;
        while (++index <= endingIndex)
            if (predicate.test(index, collection.get(index)))
                return index;
        throw new IndexOutOfBoundsException("Index out of bound. No index could be found from the starting (“" + startingIndex + "”) to the ending (“" + endingIndex + "”) indexes in the collection.", index);
    }

    private static <T extends @Nullable Object> int __with2Argument(final T @Unmodifiable [] collection,
                                                                    final IntObjPredicate<? super T> predicate,
                                                                    final int startingIndex,
                                                                    final int endingIndex) {
        var index = startingIndex - 1;
        while (++index <= endingIndex)
            if (predicate.test(index, collection[index]))
                return index;
        throw new IndexOutOfBoundsException("Index out of bound. No index could be found from the starting (“" + startingIndex + "”) to the ending (“" + endingIndex + "”) indexes in the collection.", index);
    }

    //#endregion -------------------- Loop methods --------------------

}
