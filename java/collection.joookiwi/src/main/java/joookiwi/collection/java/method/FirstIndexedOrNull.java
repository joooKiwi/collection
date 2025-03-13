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
public final class FirstIndexedOrNull
        extends AliasUtility {

    @Contract(ALWAYS_FAIL_0)
    private FirstIndexedOrNull() { throw new ImpossibleConstructionException("The utility class “FirstIndexedOrNull” cannot be constructed.", FirstIndexedOrNull.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Get the first element in the `collection`
    /// or `null` if it **is empty**
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_1)
    public static <T extends @Nullable Object> @Nullable T firstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return null;
        if (collection.size() == 0)
            return null;
        return __withNoArgument(collection);
    }

    /// Get the first element in the `collection`
    /// or `null` if it [is empty][CollectionHolder#isEmpty]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_1)
    public static <T extends @Nullable Object> @Nullable T firstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        return __withNoArgument(collection);
    }

    /// Get the first element in the `collection`
    /// or `null` if it **is empty**
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_1)
    public static <T extends @Nullable Object> @Nullable T firstIndexedOrNull(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return null;
        if (collection.length == 0)
            return null;
        return __withNoArgument(collection);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- predicate (int, T) → boolean --------------------

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    /// or `null` if it **is empty**
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T firstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                     final @Nullable IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with2Argument(collection, predicate, size);
    }

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    /// or `null` if it [is empty][CollectionHolder#isEmpty]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T firstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                     final @Nullable IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with2Argument(collection, predicate, collection.size());
    }

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    /// or `null` if it **is empty**
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T firstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                     final @Nullable IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        if (predicate == null)
            return GetFirstOrNull.getFirstOrNull(collection);

        final var size = collection.length;
        if (size == 0)
            return null;
        return __with2Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (int, T) → boolean --------------------
    //#region -------------------- predicate (int) → boolean --------------------

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    /// or `null` if it **is empty**
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T firstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                     final @Nullable IntPredicate predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with1Argument(collection, predicate, size);
    }

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    /// or `null` if it [is empty][CollectionHolder#isEmpty]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T firstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                     final @Nullable IntPredicate predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with1Argument(collection, predicate, collection.size());
    }

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    /// or `null` if it **is empty**
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T firstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                     final @Nullable IntPredicate predicate) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with1Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (int) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    /// or `null` if it **is empty**
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T firstIndexedOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                     final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with0Argument(collection, predicate, size);
    }

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    /// or `null` if it [is empty][CollectionHolder#isEmpty]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T firstIndexedOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                     final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with0Argument(collection, predicate, collection.size());
    }

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    /// or `null` if it **is empty**
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T firstIndexedOrNull(final T @Nullable @Unmodifiable [] collection,
                                                     final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with0Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> T __withNoArgument(final @NotNull MinimalistCollectionHolder<? extends T> collection) {
        return collection.get(0);
    }

    private static <T extends @Nullable Object> T __withNoArgument(final T @NotNull @Unmodifiable [] collection) {
        return collection[0];
    }


    private static <T extends @Nullable Object> @Nullable T __with0Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                            final @NotNull BooleanSupplier predicate,
                                                                            final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.getAsBoolean())
                return collection.get(index);
        return null;
    }

    private static <T extends @Nullable Object> @Nullable T __with0Argument(final T @NotNull @Unmodifiable [] collection,
                                                                            final @NotNull BooleanSupplier predicate,
                                                                            final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.getAsBoolean())
                return collection[index];
        return null;
    }


    private static <T extends @Nullable Object> @Nullable T __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                            final @NotNull IntPredicate predicate,
                                                                            final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.test(index))
                return collection.get(index);
        return null;
    }

    private static <T extends @Nullable Object> @Nullable T __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                                            final @NotNull IntPredicate predicate,
                                                                            final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.test(index))
                return collection[index];
        return null;
    }


    private static <T extends @Nullable Object> @Nullable T __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
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

    private static <T extends @Nullable Object> @Nullable T __with2Argument(final T @NotNull @Unmodifiable [] collection,
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
