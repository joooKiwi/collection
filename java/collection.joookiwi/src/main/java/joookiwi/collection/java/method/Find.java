package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_2;

@NotNullByDefault
public final class Find
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private Find() { throw new ImpossibleConstructionException("The utility class “Find” cannot be constructed.", Find.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Get the first element found or `null` if nothing was found
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T find(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                       final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, size);
    }

    /// Get the first element found or `null` if nothing was found
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T find(final @Nullable CollectionHolder<? extends T> collection,
                                       final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, size);
    }

    /// Get the first element found or `null` if nothing was found
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T find(final T @Nullable @Unmodifiable [] collection,
                                       final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Get the first element found or `null` if nothing was found
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T find(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                       final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, size);
    }

    /// Get the first element found or `null` if nothing was found
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T find(final @Nullable CollectionHolder<? extends T> collection,
                                       final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, size);
    }

    /// Get the first element found or `null` if nothing was found
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T find(final T @Nullable @Unmodifiable [] collection,
                                       final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return null;
        return __with1Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the first element found or `null` if nothing was found
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T find(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                       final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with0Argument(collection, predicate, size);
    }

    /// Get the first element found or `null` if nothing was found
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T find(final @Nullable CollectionHolder<? extends T> collection,
                                       final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return __with0Argument(collection, predicate, size);
    }

    /// Get the first element found or `null` if nothing was found
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/find">Array.find(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html">Kotlin find(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T find(final T @Nullable @Unmodifiable [] collection,
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
                                                   final @NotNull Predicate<? super T> predicate,
                                                   final int size) {
        var index = -1;
        while (++index < size) {
            final var value = collection.get(index);
            if (predicate.test(value))
                return value;
        }
        return null;
    }

    private static <T> @Nullable T __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                   final @NotNull Predicate<? super T> predicate,
                                                   final int size) {
        var index = -1;
        while (++index < size) {
            final var value = collection[index];
            if (predicate.test(value))
                return value;
        }
        return null;
    }


    private static <T> @Nullable T __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   final @NotNull ObjIntPredicate<? super T> predicate,
                                                   final int size) {
        var index = -1;
        while (++index < size) {
            final var value = collection.get(index);
            if (predicate.test(value, index))
                return value;
        }
        return null;
    }

    private static <T> @Nullable T __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                   final @NotNull ObjIntPredicate<? super T> predicate,
                                                   final int size) {
        var index = -1;
        while (++index < size) {
            final var value = collection[index];
            if (predicate.test(value, index))
                return value;
        }
        return null;
    }

    //#endregion -------------------- Loop methods --------------------


}