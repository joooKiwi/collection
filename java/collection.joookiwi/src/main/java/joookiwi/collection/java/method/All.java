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

public final class All
        extends Utility {

    @Contract("-> fail")
    private All() { throw new ImpossibleConstructionException("The utility class \"All\" cannot be constructed.", All.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> false")
    public static <T> boolean all(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;

        var size = collection.size();
        if (size == 0)
            return false;
        return __with2Argument(collection, predicate, size);
    }

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> false")
    public static <T> boolean all(@Nullable CollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (collection.isEmpty())
            return false;
        return __with2Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> false")
    public static <T> boolean all(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;

        var size = collection.size();
        if (size == 0)
            return false;
        return __with1Argument(collection, predicate, size);
    }

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> false")
    public static <T> boolean all(@Nullable CollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (collection.isEmpty())
            return false;
        return __with1Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> false")
    public static <T> boolean all(@Nullable MinimalistCollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return false;

        var size = collection.size();
        if (size == 0)
            return false;
        return __with0Argument(predicate, size);
    }

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> false")
    public static <T> boolean all(@Nullable CollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (collection.isEmpty())
            return false;
        return __with0Argument(predicate, collection.size());
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static boolean __with0Argument(@NotNull Supplier<@NotNull Boolean> predicate, int size) {
        var index = -1;
        while (++index < size)
            if (!predicate.get())
                return false;
        return true;
    }

    private static <T> boolean __with1Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate, int size) {
        var index = -1;
        while (++index < size)
            if (!predicate.apply(collection.get(index)))
                return false;
        return true;
    }

    private static <T> boolean __with2Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate, int size) {
        var index = -1;
        while (++index < size)
            if (!predicate.apply(collection.get(index), index))
                return false;
        return true;
    }

    //#endregion -------------------- Loop methods --------------------

}
