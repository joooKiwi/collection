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

public final class FirstOrNull
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private FirstOrNull() { throw new ImpossibleConstructionException("The utility class “FirstOrNull” cannot be constructed.", FirstOrNull.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- () --------------------

    /**
     * Get the first element in the {@code collection}
     * or <b>null</b> if the {@code collection} <b>is empty</b>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_1)
    public static <T> @Nullable T firstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return null;
        if (collection.size() == 0)
            return null;
        return __withNoArgument(collection);
    }

    /**
     * Get the first element in the {@code collection}
     * or <b>null</b> if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_1)
    public static <T> @Nullable T firstOrNull(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        return __withNoArgument(collection);
    }

    //#endregion -------------------- () --------------------
    //#region -------------------- predicate (T, int) → boolean --------------------

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} <b>is empty</b>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T firstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                              final @Nullable ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with0Argument(collection, predicate, size);
    }

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T firstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                              final @Nullable ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with0Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} <b>is empty</b>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T firstOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                              final @Nullable Predicate<? super T> predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with1Argument(collection, predicate, size);
    }

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T firstOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                              final @Nullable Predicate<? super T> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with1Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} <b>is empty</b>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T firstOrNull(final @Nullable MinimalistCollectionHolder<T> collection,
                                              final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with2Argument(collection, predicate, size);
    }

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T> @Nullable T firstOrNull(final @Nullable CollectionHolder<T> collection,
                                              final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return __withNoArgument(collection);
        return __with2Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> T __withNoArgument(final @NotNull MinimalistCollectionHolder<? extends T> collection) {
        return collection.get(0);
    }


    private static <T> @Nullable T __with0Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   final @NotNull ObjIntPredicate<? super T> predicate,
                                                   final int size) {
        var index = -1;
        while (++index < size) {
            var value = collection.get(index);
            if (predicate.test(value, index))
                return value;
        }
        return null;
    }

    private static <T> @Nullable T __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   final @NotNull Predicate<? super T> predicate,
                                                   final int size) {
        var index = -1;
        while (++index < size) {
            var value = collection.get(index);
            if (predicate.test(value))
                return value;
        }
        return null;
    }

    private static <T> @Nullable T __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   final @NotNull BooleanSupplier predicate,
                                                   final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.getAsBoolean())
                return collection.get(index);
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
