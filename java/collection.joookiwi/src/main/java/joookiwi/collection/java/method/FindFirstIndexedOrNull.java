package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.IntPredicate;
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

import static joookiwi.collection.java.CommonContracts.*;

@NotNullByDefault
public final class FindFirstIndexedOrNull
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private FindFirstIndexedOrNull() { throw new ImpossibleConstructionException("The utility class “FindFirstIndexedOrNull” cannot be constructed.", FindFirstIndexedOrNull.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (int, T) → boolean --------------------

    /// Find the first element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Javascript Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                         final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, size);
    }

    /// Find the first element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Javascript Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                         final @NotNull IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        return __with2Argument(collection, predicate, collection.size());
    }

    /// Find the first element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Javascript Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
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

    /// Find the first element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Javascript Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                         final @NotNull IntPredicate predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, size);
    }

    /// Find the first element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Javascript Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findFirstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                         final @NotNull IntPredicate predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        return __with1Argument(collection, predicate, collection.size());
    }

    /// Find the first element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Javascript Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
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

    /// Find the first element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Javascript Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findFirstIndexedOrNull(final @Nullable MinimalistCollectionHolder<T> collection,
                                                         final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with0Argument(collection, predicate, size);
    }

    /// Find the first element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Javascript Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findFirstIndexedOrNull(final @Nullable CollectionHolder<T> collection,
                                                         final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        return __with0Argument(collection, predicate, collection.size());
    }

    /// Find the first element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Javascript Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T findFirstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
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
        var index = -1;
        while (++index < size)
            if (predicate.getAsBoolean())
                return collection.get(index);
        return null;
    }

    private static <T> @Nullable T __with0Argument(final T @NotNull @Unmodifiable [] collection,
                                                   final @NotNull BooleanSupplier predicate,
                                                   final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.getAsBoolean())
                return collection[index];
        return null;
    }


    private static <T> @Nullable T __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   final @NotNull IntPredicate predicate,
                                                   final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.test(index))
                return collection.get(index);
        return null;
    }

    private static <T> @Nullable T __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                   final @NotNull IntPredicate predicate,
                                                   final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.test(index))
                return collection[index];
        return null;
    }


    private static <T> @Nullable T __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   final @NotNull IntObjPredicate<? super T> predicate,
                                                   final int size) {
        var index = -1;
        while (++index < size) {
            final var value = collection.get(index);
            if (predicate.test(index, value))
                return value;
        }
        return null;
    }

    private static <T> @Nullable T __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                   final @NotNull IntObjPredicate<? super T> predicate,
                                                   final int size) {
        var index = -1;
        while (++index < size) {
            final var value = collection[index];
            if (predicate.test(index, value))
                return value;
        }
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
