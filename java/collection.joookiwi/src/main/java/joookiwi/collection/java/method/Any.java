package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public final class Any
        extends Utility {

    @Contract("-> fail")
    private Any() { throw new ImpossibleConstructionException("The utility class \"Any\" cannot be constructed.", Any.class); }

    /**
     * Tell if the {@code collection} {@link CollectionHolder#isNotEmpty is not empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @return <b>false</b> if null is received or {@link CollectionHolder#isNotEmpty} otherwise
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html">Kotlin any()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any()</a>
     * @extensionFunction
     */
    public static <T> boolean any(@Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        return collection.isNotEmpty();
    }

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     * @extensionFunction
     */
    public static <T> boolean any(@Nullable CollectionHolder<? extends T> collection, @Nullable BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return collection.isNotEmpty();
        if (collection.isEmpty())
            return false;

        var size = collection.getSize();
        var index = -1;
        while (++index < size)
            if (predicate.apply(collection.get(index), index))
                return true;
        return false;
    }

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     * @extensionFunction
     */
    public static <T> boolean any(@Nullable CollectionHolder<? extends T> collection, @Nullable Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return collection.isNotEmpty();
        if (collection.isEmpty())
            return false;

        var size = collection.getSize();
        var index = -1;
        while (++index < size)
            if (predicate.apply(collection.get(index)))
                return true;
        return false;
    }

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     * @extensionFunction
     */
    public static <T> boolean any(@Nullable CollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return collection.isNotEmpty();
        if (collection.isEmpty())
            return false;

        var size = collection.getSize();
        var index = -1;
        while (++index < size)
            if (predicate.get())
                return true;
        return false;
    }

}
