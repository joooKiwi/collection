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
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_2;

public final class LastOrNull
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private LastOrNull() { throw new ImpossibleConstructionException("The utility class “LastOrNull” cannot be constructed.", LastOrNull.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Get the last element in the current `collection`
    /// or `null` if the `collection` **is empty**
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_1)
    public static <T> @Nullable T lastOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        return __withNoPredicate(collection, size);
    }

    /// Get the last element in the current `collection`
    /// or `null` if the `collection` [is empty][#isEmpty]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_1)
    public static <T> @Nullable T lastOrNull(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        return __withNoPredicate(collection, collection.size());
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → boolean --------------------

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    /// or `null` if the `collection` **is empty**
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T lastOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                             final @Nullable ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with2Argument(collection, predicate, size);
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    /// or `null` if the `collection` [is empty][#isEmpty]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T lastOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                             final @Nullable ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return __withNoPredicate(collection, collection.size());
        return __with2Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- (T, int) → boolean --------------------
    //#region -------------------- (T) → boolean --------------------

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    /// or `null` if the `collection` **is empty**
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T lastOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                             final @Nullable Predicate<? super T> predicate) {
        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with1Argument(collection, predicate, size);
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    /// or `null` if the `collection` [is empty][#isEmpty]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T lastOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                             final @Nullable Predicate<? super T> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return __withNoPredicate(collection, collection.size());
        return __with1Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- (T) → boolean --------------------
    //#region -------------------- () → boolean --------------------

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    /// or `null` if the `collection` **is empty**
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T lastOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                             final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with0Argument(collection, predicate, size);
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    /// or `null` if the `collection` [is empty][#isEmpty]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T lastOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                             final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return __withNoPredicate(collection, collection.size());
        return __with0Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> T __withNoPredicate(@NotNull MinimalistCollectionHolder<? extends T> collection,
                                           int size) {
        return collection.get(size - 1);
    }

    private static <T> @Nullable T __with0Argument(@NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   @NotNull BooleanSupplier predicate,
                                                   int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.getAsBoolean())
                return collection.get(index);
        return null;
    }

    private static <T> @Nullable T __with1Argument(@NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   @NotNull Predicate<? super T> predicate,
                                                   int size) {
        var index = size;
        while (index-- > 0) {
            var value = collection.get(index);
            if (predicate.test(value))
                return value;
        }
        return null;
    }

    private static <T> @Nullable T __with2Argument(@NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   @NotNull ObjIntPredicate<? super T> predicate,
                                                   int size) {
        var index = size;
        while (index-- > 0) {
            var value = collection.get(index);
            if (predicate.test(value, index))
                return value;
        }
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
