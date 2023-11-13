package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException;
import joookiwi.collection.java.exception.EmptyCollectionHolderException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public final class First
        extends Utility {

    @Contract("-> fail")
    private First() { throw new ImpossibleConstructionException("The utility class \"First\" cannot be constructed.", First.class); }

    /**
     * Get the first element in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @throws NullPointerException           The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html">Kotlin first()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
     * @extensionFunction
     */
    @Contract("null -> fail")
    public static <T> @NotNull T first(@Nullable CollectionHolder<T> collection) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException("No element at the index 0 could be found since it is empty.");

        return collection.get(0);
    }

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     * @extensionFunction
     */
    @Contract("null, _ -> fail")
    public static <T> @NotNull T first(@Nullable CollectionHolder<T> collection, @Nullable BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException("No element at the index 0 could be found since it is empty.");
        if (predicate == null)
            return collection.get(0);

        var size = collection.getSize();
        var index = -1;
        while (++index < size) {
            var value = collection.get(index);
            if (predicate.apply(value, index))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     * @extensionFunction
     */
    @Contract("null, _ -> fail")
    public static <T> @NotNull T first(@Nullable CollectionHolder<T> collection, @Nullable Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException("No element at the index 0 could be found since it is empty.");
        if (predicate == null)
            return collection.get(0);

        var size = collection.getSize();
        var index = -1;
        while (++index < size) {
            var value = collection.get(index);
            if (predicate.apply(value))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     * @extensionFunction
     */
    @Contract("null, _ -> fail")
    public static <T> @NotNull T first(@Nullable CollectionHolder<T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException("No element at the index 0 could be found since it is empty.");
        if (predicate == null)
            return collection.get(0);

        var size = collection.getSize();
        var index = -1;
        while (++index < size)
            if (predicate.get())
                return collection.get(index);
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }

}
