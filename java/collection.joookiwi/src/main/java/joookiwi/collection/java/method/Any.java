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

public final class Any
        extends Utility {

    @Contract("-> fail")
    private Any() { throw new ImpossibleConstructionException("The utility class \"Any\" cannot be constructed.", Any.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- () --------------------

    /**
     * Tell if the {@code collection} {@link MinimalistCollectionHolder#size size} is not <b>0</b>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @return <b>false</b> if null is received or {@link MinimalistCollectionHolder#size size} is not <b>0</b> otherwise
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html">Kotlin any()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any()</a>
     */
    @ExtensionFunction
    @Contract("null -> false")
    public static <T> boolean any(@Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        return collection.size() != 0;
    }

    /**
     * Tell if the {@code collection} {@link CollectionHolder#isNotEmpty is not empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @return <b>false</b> if null is received or {@link CollectionHolder#isNotEmpty isNotEmpty} otherwise
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html">Kotlin any()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any()</a>
     */
    @ExtensionFunction
    @Contract("null -> false")
    public static <T> boolean any(@Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        return collection.isNotEmpty();
    }

    //#endregion -------------------- () --------------------
    //#region -------------------- predicate (T, int) → boolean --------------------

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> false")
    public static <T> boolean any(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return collection.size() != 0;
        if (collection.size() == 0)
            return false;

        return __with2Argument(collection, predicate);
    }


    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> false")
    public static <T> boolean any(@Nullable CollectionHolder<? extends T> collection, @Nullable BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return !collection.isEmpty();
        if (collection.isEmpty())
            return false;

        return __with2Argument(collection, predicate);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> false")
    public static <T> boolean any(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return collection.size() != 0;
        if (collection.size() == 0)
            return false;

        return __with1Argument(collection, predicate);
    }

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> false")
    public static <T> boolean any(@Nullable CollectionHolder<? extends T> collection, @Nullable Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return !collection.isEmpty();
        if (collection.isEmpty())
            return false;

        return __with1Argument(collection, predicate);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> false")
    public static <T> boolean any(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return collection.size() != 0;
        if (collection.size() == 0)
            return false;

        return __with0Argument(collection, predicate);
    }

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> false")
    public static <T> boolean any(@Nullable CollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return !collection.isEmpty();
        if (collection.isEmpty())
            return false;

        return __with0Argument(collection, predicate);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Comparison methods --------------------

    private static boolean __with0Argument(@NotNull MinimalistCollectionHolder<?> collection, @NotNull Supplier<@NotNull Boolean> predicate) {
        var size = collection.size();
        var index = -1;
        while (++index < size)
            if (predicate.get())
                return true;
        return false;
    }

    private static <T> boolean __with1Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate) {
        var size = collection.size();
        var index = -1;
        while (++index < size)
            if (predicate.apply(collection.get(index)))
                return true;
        return false;
    }

    private static <T> boolean __with2Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        var size = collection.size();
        var index = -1;
        while (++index < size)
            if (predicate.apply(collection.get(index), index))
                return true;
        return false;
    }

    //#endregion -------------------- Comparison methods --------------------

}
