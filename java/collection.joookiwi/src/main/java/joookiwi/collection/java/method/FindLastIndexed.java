package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.IntPredicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.NullCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_2;

@NotNullByDefault
public final class FindLastIndexed
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private FindLastIndexed() { throw new ImpossibleConstructionException("The utility class “FindLastIndexed” cannot be constructed.", FindLastIndexed.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (int, T) → boolean --------------------

    /// Find the last element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html">Kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, size);
    }

    /// Find the last element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html">Kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                        final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, size);
    }

    /// Find the last element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html">Kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLastIndexed(final T @Nullable @Unmodifiable [] collection,
                                        final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (int, T) → boolean --------------------
    //#region -------------------- predicate (int) → boolean --------------------

    /// Find the last element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html">Kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull IntPredicate predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with1Argument(collection, predicate, size);
    }

    /// Find the last element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html">Kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                        final @NotNull IntPredicate predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with1Argument(collection, predicate, size);
    }

    /// Find the last element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html">Kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLastIndexed(final T @Nullable @Unmodifiable [] collection,
                                        final @NotNull IntPredicate predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with1Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (int) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Find the last element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html">Kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLastIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with0Argument(collection, predicate, size);
    }

    /// Find the last element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html">Kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLastIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                        final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with0Argument(collection, predicate, size);
    }

    /// Find the last element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html">Kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLastIndexed(final T @Nullable @Unmodifiable [] collection,
                                        final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with0Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> T __with0Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                         final @NotNull BooleanSupplier predicate,
                                         final int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.getAsBoolean())
                return collection.get(index);
        throw new IndexOutOfBoundsException("No element could be found from the “findLastIndexed” predicate received in the collection.", size - 1);
    }

    private static <T> T __with0Argument(final T @NotNull @Unmodifiable [] collection,
                                         final @NotNull BooleanSupplier predicate,
                                         final int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.getAsBoolean())
                return collection[index];
        throw new IndexOutOfBoundsException("No element could be found from the “findLastIndexed” predicate received in the collection.", size - 1);
    }


    private static <T> T __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                         final @NotNull IntPredicate predicate,
                                         final int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.test(index))
                return collection.get(index);
        throw new IndexOutOfBoundsException("No element could be found from the “findLastIndexed” predicate received in the collection.", size - 1);
    }

    private static <T> T __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                         final @NotNull IntPredicate predicate,
                                         final int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.test(index))
                return collection[index];
        throw new IndexOutOfBoundsException("No element could be found from the “findLastIndexed” predicate received in the collection.", size - 1);
    }


    private static <T> T __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                         final @NotNull IntObjPredicate<? super T> predicate,
                                         final int size) {
        var index = size;
        while (index-- > 0) {
            final var value = collection.get(index);
            if (predicate.test(index, value))
                return value;
        }
        throw new IndexOutOfBoundsException("No element could be found from the “findLastIndexed” predicate received in the collection.", size - 1);
    }

    private static <T> T __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                         final @NotNull IntObjPredicate<? super T> predicate,
                                         final int size) {
        var index = size;
        while (index-- > 0) {
            final var value = collection[index];
            if (predicate.test(index, value))
                return value;
        }
        throw new IndexOutOfBoundsException("No element could be found from the “findLastIndexed” predicate received in the collection.", size - 1);
    }

    //#endregion -------------------- Loop methods --------------------

}
