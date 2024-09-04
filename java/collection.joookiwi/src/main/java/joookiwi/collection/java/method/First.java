package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException;
import joookiwi.collection.java.exception.EmptyCollectionHolderException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_2;

public final class First
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private First() { throw new ImpossibleConstructionException("The utility class “First” cannot be constructed.", First.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ ---------------------

    /**
     * Get the first element in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @throws NullPointerException           The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException The {@code collection} <b>is empty</b>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> @NotNull T first(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception
        if (collection.size() == 0)
            throw new EmptyCollectionHolderException();
        return __withNoArgument(collection);
    }

    /**
     * Get the first element in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @throws NullPointerException           The {@code collection} was <b>null</b> or <b>undefined</b>
     * @throws EmptyCollectionHolderException The {@code collection} {@link CollectionHolder#isEmpty is empty}
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> @NotNull T first(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        return __withNoArgument(collection);
    }

    //#endregion -------------------- ∅ --------------------
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
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                              final @Nullable ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoArgument(collection);
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
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final @Nullable CollectionHolder<? extends T> collection,
                              final @Nullable ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoArgument(collection);
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
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                              final @Nullable Predicate<? super T> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoArgument(collection);
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
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final @Nullable CollectionHolder<? extends T> collection,
                              final @Nullable Predicate<? super T> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoArgument(collection);
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
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                              final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoArgument(collection);
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
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final @Nullable CollectionHolder<? extends T> collection,
                              final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection."); // TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoArgument(collection);
        return __with0Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> T __withNoArgument(final @NotNull MinimalistCollectionHolder<? extends T> collection) {
        return collection.get(0);
    }


    private static <T> T __with0Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                         final @NotNull BooleanSupplier predicate,
                                         final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.getAsBoolean())
                return collection.get(index);
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }

    private static <T> T __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                         final @NotNull Predicate<? super T> predicate,
                                         final int size) {
        var index = -1;
        while (++index < size) {
            var value = collection.get(index);
            if (predicate.test(value))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }

    private static <T> T __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                         final @NotNull ObjIntPredicate<? super T> predicate,
                                         final int size) {
        var index = -1;
        while (++index < size) {
            var value = collection.get(index);
            if (predicate.test(value, index))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }

    //#endregion -------------------- Loop methods --------------------

}
