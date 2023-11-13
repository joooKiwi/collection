package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public final class FirstOrNull
        extends Utility {

    @Contract("-> fail")
    private FirstOrNull() { throw new ImpossibleConstructionException("The utility class \"FirstOrNull\" cannot be constructed.", FirstOrNull.class); }

    /**
     * Get the first element in the {@code collection}
     * or <b>null</b> if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault()</a>
     * @extensionFunction
     */
    @Contract("null -> null")
    public static <T> @Nullable T firstOrNull(@Nullable CollectionHolder<T> collection) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        return collection.getOrNull(0);
    }

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
     * @extensionFunction
     */
    @Contract("null, _ -> null")
    public static <T> @Nullable T firstOrNull(@Nullable CollectionHolder<T> collection, @Nullable BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return collection.getOrNull(0);

        var size = collection.getSize();
        var index = -1;
        while (++index < size) {
            var value = collection.get(index);
            if (predicate.apply(value, index))
                return value;
        }
        return null;
    }

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
     * @extensionFunction
     */
    @Contract("null, _ -> null")
    public static <T> @Nullable T firstOrNull(@Nullable CollectionHolder<T> collection, @Nullable Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return collection.getOrNull(0);

        var size = collection.getSize();
        var index = -1;
        while (++index < size) {
            var value = collection.get(index);
            if (predicate.apply(value))
                return value;
        }
        return null;
    }

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     * or <b>null</b> if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html">Kotlin firstOrNull(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault">C# FirstOrDefault(predicate)</a>
     * @extensionFunction
     */
    @Contract("null, _ -> null")
    public static <T> @Nullable T firstOrNull(@Nullable CollectionHolder<T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        if (predicate == null)
            return collection.getOrNull(0);

        var size = collection.getSize();
        var index = -1;
        while (++index < size)
            if (predicate.get())
                return collection.get(index);
        return null;
    }

}
