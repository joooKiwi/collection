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

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_2;

@NotNullByDefault
public final class LastIndexedOrNull
        extends AliasUtility {

    @Contract(ALWAYS_FAIL_0)
    private LastIndexedOrNull() { throw new ImpossibleConstructionException("The utility class “LastOrNull” cannot be constructed.", LastIndexedOrNull.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Get the last element in the `collection`
    /// or `null` if it **is empty**
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_1)
    public static <T extends @Nullable Object> @Nullable T lastIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection) { return GetLastOrNull.getLastOrNull(collection); }

    /// Get the last element in the `collection`
    /// or `null` if it [is empty][CollectionHolder#isEmpty]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_1)
    public static <T extends @Nullable Object> @Nullable T lastIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection) { return GetLastOrNull.getLastOrNull(collection); }

    /// Get the last element in the `collection`
    /// or `null` if it **is empty**
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_1)
    public static <T extends @Nullable Object> @Nullable T lastIndexedOrNull(final T @Nullable @Unmodifiable [] collection) { return GetLastOrNull.getLastOrNull(collection); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (int, T) → boolean --------------------

    /// Find the last element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html">Kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T lastIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final @Nullable IntObjPredicate<? super T> predicate) {
        if (predicate == null)
            return GetLastOrNull.getLastOrNull(collection);
        return FindLastIndexedOrNull.findLastIndexedOrNull(collection, predicate);
    }

    /// Find the last element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T lastIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final @Nullable IntObjPredicate<? super T> predicate) {
        if (predicate == null)
            return GetLastOrNull.getLastOrNull(collection);
        return FindLastIndexedOrNull.findLastIndexedOrNull(collection, predicate);
    }

    /// Find the last element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T lastIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                             final @Nullable IntObjPredicate<? super T> predicate) {
        if (predicate == null)
            return GetLastOrNull.getLastOrNull(collection);
        return FindLastIndexedOrNull.findLastIndexedOrNull(collection, predicate);
    }

    //#endregion -------------------- (int, T) → boolean --------------------
    //#region -------------------- (int) → boolean --------------------

    /// Find the last element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html">Kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T lastIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final @Nullable IntPredicate predicate) {
        if (predicate == null)
            return GetLastOrNull.getLastOrNull(collection);
        return FindLastIndexedOrNull.findLastIndexedOrNull(collection, predicate);
    }

    /// Find the last element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T lastIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final @Nullable IntPredicate predicate) {
        if (predicate == null)
            return GetLastOrNull.getLastOrNull(collection);
        return FindLastIndexedOrNull.findLastIndexedOrNull(collection, predicate);
    }

    /// Find the last element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T lastIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                             final @Nullable IntPredicate predicate) {
        if (predicate == null)
            return GetLastOrNull.getLastOrNull(collection);
        return FindLastIndexedOrNull.findLastIndexedOrNull(collection, predicate);
    }

    //#endregion -------------------- (int) → boolean --------------------
    //#region -------------------- () → boolean --------------------

    /// Find the last element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html">Kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T lastIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return GetLastOrNull.getLastOrNull(collection);
        return FindLastIndexedOrNull.findLastIndexedOrNull(collection, predicate);
    }

    /// Find the last element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T lastIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return GetLastOrNull.getLastOrNull(collection);
        return FindLastIndexedOrNull.findLastIndexedOrNull(collection, predicate);
    }

    /// Find the last element from the `predicate` in the `collection`
    /// or `null` otherwise
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/findLast">Javascript Array.findLast(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-Null.html">kotlin lastOrNull(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-Last.html">kotlin findLast(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.ENUMERABLE.Lastordefault">c# lastOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T lastIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                             final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return GetLastOrNull.getLastOrNull(collection);
        return FindLastIndexedOrNull.findLastIndexedOrNull(collection, predicate);
    }

    //#endregion -------------------- () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------

}
