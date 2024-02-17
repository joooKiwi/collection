package joookiwi.collection.java.method;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LastOrNull
        extends Utility {

    @Contract("-> fail")
    private LastOrNull() { throw new ImpossibleConstructionException("The utility class \"LastOrNull\" cannot be constructed.", LastOrNull.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- () --------------------

    /**
     * Get the last element in the current {@code collection}
     * or <b>null</b> if the {@code collection} <b>is empty</b>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault()</a>
     */
    @ExtensionFunction
    @Contract("null -> null")
    public static <T> @Nullable T lastOrNull(@Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        return __withNoPredicate(collection, size);
    }

    /**
     * Get the last element in the current {@code collection}
     * or <b>null</b> if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault()</a>
     */
    @ExtensionFunction
    @Contract("null -> null")
    public static <T> @Nullable T lastOrNull(@Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        return __withNoPredicate(collection, collection.size());
    }

    //#endregion -------------------- () --------------------
    //#region -------------------- predicate (T, int) → boolean --------------------

    /**
     * Get the last element in the current {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} <b>is empty</b>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> null")
    public static <T> @Nullable T lastOrNull(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with2Argument(collection, predicate, size);
    }

    /**
     * Get the last element in the current {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> null")
    public static <T> @Nullable T lastOrNull(@Nullable CollectionHolder<? extends T> collection, @Nullable BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return __withNoPredicate(collection, collection.size());
        return __with2Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /**
     * Get the last element in the current {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} <b>is empty</b>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> null")
    public static <T> @Nullable T lastOrNull(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with1Argument(collection, predicate, size);
    }

    /**
     * Get the last element in the current {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> null")
    public static <T> @Nullable T lastOrNull(@Nullable CollectionHolder<? extends T> collection, @Nullable Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return __withNoPredicate(collection, collection.size());
        return __with1Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /**
     * Get the last element in the current {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} <b>is empty</b>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> null")
    public static <T> @Nullable T lastOrNull(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return null;

        var size = collection.size();
        if (size == 0)
            return null;
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with0Argument(collection, predicate, size);
    }

    /**
     * Get the last element in the current {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> null")
    public static <T> @Nullable T lastOrNull(@Nullable CollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return __withNoPredicate(collection, collection.size());
        return __with0Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> T __withNoPredicate(@NotNull MinimalistCollectionHolder<? extends T> collection, int size) {
        return collection.get(size - 1);
    }

    private static <T> @Nullable T __with0Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate, int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.get())
                return collection.get(index);
        return null;
    }

    private static <T> @Nullable T __with1Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate, int size) {
        var index = size;
        while (index-- > 0) {
            var value = collection.get(index);
            if (predicate.apply(value))
                return value;
        }
        return null;
    }

    private static <T> @Nullable T __with2Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate, int size) {
        var index = size;
        while (index-- > 0) {
            var value = collection.get(index);
            if (predicate.apply(value, index))
                return value;
        }
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}
