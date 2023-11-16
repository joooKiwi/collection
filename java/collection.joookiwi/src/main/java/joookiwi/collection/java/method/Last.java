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

public final class Last
        extends Utility {

    @Contract("-> fail")
    private Last() { throw new ImpossibleConstructionException("The utility class \"Last\" cannot be constructed.", Last.class); }

    /**
     * Get the last element in the current {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @throws NullPointerException           The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html">Kotlin last()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
     * @extensionFunction
     */
    public static <T> @NotNull T last(@Nullable CollectionHolder<T> collection) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException("No element at the index " + (collection.getSize() - 1) + " could be found since it is empty.");

        return collection.get(collection.getSize() - 1);
    }

    /**
     * Get the last element in the current {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html">Kotlin last()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
     * @extensionFunction
     */
    public static <T> @NotNull T last(@Nullable CollectionHolder<T> collection, @Nullable BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException("No element at the index " + (collection.getSize() - 1) + " could be found since it is empty.");
        if (predicate == null)
            return collection.get(collection.getSize() - 1);

        var size = collection.getSize();
        var index = size;
        while (index-- > 0) {
            var value = collection.get(index);
            if (predicate.apply(value, index))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1);
    }

    /**
     * Get the last element in the current {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html">Kotlin last()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
     * @extensionFunction
     */
    public static <T> @NotNull T last(@Nullable CollectionHolder<T> collection, @Nullable Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException("No element at the index " + (collection.getSize() - 1) + " could be found since it is empty.");
        if (predicate == null)
            return collection.get(collection.getSize() - 1);

        var size = collection.getSize();
        var index = size;
        while (index-- > 0) {
            var value = collection.get(index);
            if (predicate.apply(value))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1);
    }

    /**
     * Get the last element in the current {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html">Kotlin last()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
     * @extensionFunction
     */
    public static <T> @NotNull T last(@Nullable CollectionHolder<T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException("No element at the index " + (collection.getSize() - 1) + " could be found since it is empty.");
        if (predicate == null)
            return collection.get(collection.getSize() - 1);

        var size = collection.getSize();
        var index = size;
        while (index-- > 0)
            if (predicate.get())
                return collection.get(index);
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1);
    }

}
