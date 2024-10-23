package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.function.BooleanSupplier;
import java.util.function.IntPredicate;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_2;

@NotNullByDefault
public final class FindLastIndexedOrNull
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private FindLastIndexedOrNull() { throw new ImpossibleConstructionException("The utility class “FindLastIndexedOrNull” cannot be constructed.", FindLastIndexedOrNull.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (int, T) → boolean --------------------

    /// Get the last element found in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html">Kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findLastIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                        final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, size);
    }

    /// Get the last element found in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findLastIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                        final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, size);
    }

    /// Get the last element found in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findLastIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                        final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (int, T) → boolean --------------------
    //#region -------------------- predicate (int) → boolean --------------------

    /// Get the last element found in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findLastIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                        final @NotNull IntPredicate predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, size);
    }

    /// Get the last element found in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findLastIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                        final @NotNull IntPredicate predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, size);
    }

    /// Get the last element found in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findLastIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                        final @NotNull IntPredicate predicate) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (int) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the last element found in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findLastIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                        final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with0Argument(collection, predicate, size);
    }

    /// Get the last element found in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findLastIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                        final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with0Argument(collection, predicate, size);
    }

    /// Get the last element found in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findLastIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                        final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return null;
        return __with0Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @Nullable T __with0Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   final @NotNull BooleanSupplier predicate,
                                                   final int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.getAsBoolean())
                return collection.get(index);
        return null;
    }

    private static <T> @Nullable T __with0Argument(final T @NotNull @Unmodifiable [] collection,
                                                   final @NotNull BooleanSupplier predicate,
                                                   final int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.getAsBoolean())
                return collection[index];
        return null;
    }


    private static <T> @Nullable T __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   final @NotNull IntPredicate predicate,
                                                   final int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.test(index))
                return collection.get(index);
        return null;
    }

    private static <T> @Nullable T __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                   final @NotNull IntPredicate predicate,
                                                   final int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.test(index))
                return collection[index];
        return null;
    }


    private static <T> @Nullable T __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   final @NotNull IntObjPredicate<? super T> predicate,
                                                   final int size) {
        var index = size;
        while (index-- > 0) {
            final var value = collection.get(index);
            if (predicate.test(index, value))
                return value;
        }
        return null;
    }

    private static <T> @Nullable T __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                   final @NotNull IntObjPredicate<? super T> predicate,
                                                   final int size) {
        var index = size;
        while (index-- > 0) {
            final var value = collection[index];
            if (predicate.test(index, value))
                return value;
        }
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
