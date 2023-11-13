package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public final class All
        extends Utility {

    @Contract("-> fail")
    private All() { throw new ImpossibleConstructionException("The utility class \"All\" cannot be constructed.", All.class); }

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @return {boolean} <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @extensionFunction
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All()</a>
     */
    public static <T> boolean all(@Nullable CollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (collection.isEmpty())
            return false;

        var size = collection.getSize();
        var index = -1;
        while (++index < size)
            if (!predicate.apply(collection.get(index), index))
                return false;
        return true;
    }

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @return {boolean} <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @extensionFunction
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All()</a>
     */
    public static <T> boolean all(@Nullable CollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (collection.isEmpty())
            return false;

        var size = collection.getSize();
        var index = -1;
        while (++index < size)
            if (!predicate.apply(collection.get(index)))
                return false;
        return true;
    }

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @return {boolean} <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @extensionFunction
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All()</a>
     */
    public static <T> boolean all(@Nullable CollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (collection.isEmpty())
            return false;

        var size = collection.getSize();
        var index = -1;
        while (++index < size)
            if (!predicate.get())
                return false;
        return true;
    }

}
