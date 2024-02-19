package joookiwi.collection.java.method;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException;
import joookiwi.collection.java.exception.EmptyCollectionHolderException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class First
        extends Utility {

    @Contract("-> fail")
    private First() { throw new ImpossibleConstructionException("The utility class \"First\" cannot be constructed.", First.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- () --------------------

    /**
     * Get the first element in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @throws NullPointerException           The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException The {@code collection} <b>is empty</b>
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html">Kotlin first()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
     */
    @ExtensionFunction
    @Contract("null -> fail")
    public static <T> @NotNull T first(@Nullable MinimalistCollectionHolder<T> collection) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception
        if (collection.size() == 0)
            throw new EmptyCollectionHolderException();
        return collection.get(0);
    }

    /**
     * Get the first element in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @throws NullPointerException           The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html">Kotlin first()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
     */
    @ExtensionFunction
    @Contract("null -> fail")
    public static <T> @NotNull T first(@Nullable CollectionHolder<T> collection) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        return collection.get(0);
    }

    //#endregion -------------------- () --------------------
    //#region -------------------- predicate (T, int) → boolean --------------------

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} <b>is empty</b>
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> fail")
    public static <T> @NotNull T first(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return collection.get(0);
        return __with2Argument(collection, predicate, size);
    }

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> fail")
    public static <T> @NotNull T first(@Nullable CollectionHolder<? extends T> collection, @Nullable BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return collection.get(0);
        return __with2Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} <b>is empty</b>
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> fail")
    public static <T> @NotNull T first(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception

        var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return collection.get(0);
        return __with1Argument(collection, predicate, size);
    }

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> fail")
    public static <T> @NotNull T first(@Nullable CollectionHolder<? extends T> collection, @Nullable Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return collection.get(0);
        return __with1Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} <b>is empty</b>
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> fail")
    public static <T> @NotNull T first(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception

        var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return collection.get(0);

        return __with0Argument(collection, predicate, size);
    }

    /**
     * Get the first element in the {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> fail")
    public static <T> @NotNull T first(@Nullable CollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return collection.get(0);
        return __with0Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @NotNull T __with0Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate, int size) {
        var index = -1;
        while (++index < size)
            if (predicate.get())
                return collection.get(index);
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }

    private static <T> @NotNull T __with1Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate, int size) {
        var index = -1;
        while (++index < size) {
            var value = collection.get(index);
            if (predicate.apply(value))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }

    private static <T> @NotNull T __with2Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate, int size) {
        var index = -1;
        while (++index < size) {
            var value = collection.get(index);
            if (predicate.apply(value, index))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }

    //#endregion -------------------- Loop methods --------------------

}
