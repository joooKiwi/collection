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

import static joookiwi.collection.java.CommonContracts.*;

public final class Last
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private Last() { throw new ImpossibleConstructionException("The utility class \"Last\" cannot be constructed.", Last.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- () --------------------

    /**
     * Get the last element in the current {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @throws NullPointerException           The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException The {@code collection} <b>is empty</b>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> @NotNull T last(@Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        return __withNoPredicate(collection, size);
    }

    /**
     * Get the last element in the current {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @throws NullPointerException           The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> @NotNull T last(@Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        return __withNoPredicate(collection, collection.size());
    }

    //#endregion -------------------- () --------------------
    //#region -------------------- predicate (T, int) → boolean --------------------

    /**
     * Get the last element in the current {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} <b>is empty</b>
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable BiFunction<? super T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with2Argument(collection, predicate, size);
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
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(@Nullable CollectionHolder<? extends T> collection, @Nullable BiFunction<? super T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, collection.size());
        return __with2Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /**
     * Get the last element in the current {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} <b>is empty</b>
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Function<? super T, @NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with1Argument(collection, predicate, size);
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
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(@Nullable CollectionHolder<? extends T> collection, @Nullable Function<? super T, @NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, collection.size());
        return __with1Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /**
     * Get the last element in the current {@code collection}
     * matching the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @throws NullPointerException                      The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException            The {@code collection} <b>is empty</b>
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@code predicate}
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with0Argument(collection, predicate, size);
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
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(@Nullable CollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
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

    private static <T> T __with0Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull Supplier<@NotNull Boolean> predicate, int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.get())
                return collection.get(index);
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1);
    }

    private static <T> T __with1Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull Function<? super T, @NotNull Boolean> predicate, int size) {
        var index = size;
        while (index-- > 0) {
            var value = collection.get(index);
            if (predicate.apply(value))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1);
    }

    private static <T> T __with2Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull BiFunction<? super T, @NotNull Integer, @NotNull Boolean> predicate, int size) {
        var index = size;
        while (index-- > 0) {
            var value = collection.get(index);
            if (predicate.apply(value, index))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1);
    }

    //#endregion -------------------- Loop methods --------------------

}
