package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public final class LastOrNull
        extends Utility {

    @Contract("-> fail")
    private LastOrNull() { throw new ImpossibleConstructionException("The utility class \"LastOrNull\" cannot be constructed.", LastOrNull.class); }

    //#region -------------------- Facade methods --------------------

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
    public static <T> @Nullable T lastOrNull(@Nullable CollectionHolder<T> collection) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        return collection.get(collection.size() - 1);
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
    public static <T> @Nullable T lastOrNull(@Nullable CollectionHolder<T> collection, @Nullable BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return collection.get(-1);

        var index = collection.size();
        while (index-- > 0) {
            var value = collection.get(index);
            if (predicate.apply(value, index))
                return value;
        }
        return null;
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
    public static <T> @Nullable T lastOrNull(@Nullable CollectionHolder<T> collection, @Nullable Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return collection.get(collection.size() - 1);

        var index = collection.size();
        while (index-- > 0) {
            var value = collection.get(index);
            if (predicate.apply(value))
                return value;
        }
        return null;
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
    public static <T> @Nullable T lastOrNull(@Nullable CollectionHolder<T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return collection.get(collection.size() - 1);

        var index = collection.size();
        while (index-- > 0)
            if (predicate.get())
                return collection.get(index);
        return null;
    }

    //#endregion -------------------- Facade methods --------------------

}
