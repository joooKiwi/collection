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
import joookiwi.collection.java.exception.NullCollectionHolderException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_2;

@NotNullByDefault
public final class FindLast
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private FindLast() { throw new ImpossibleConstructionException("The utility class “FindLast” cannot be constructed.", FindLast.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Get the last element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                 final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionHolderException();

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        return __with2Argument(collection, predicate, size);
    }

    /// Get the last element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLast(final @Nullable CollectionHolder<? extends T> collection,
                                 final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionHolderException();
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        return __with2Argument(collection, predicate, collection.size());
    }

    /// Get the last element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLast(final T @Nullable @Unmodifiable [] collection,
                                 final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionHolderException();

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionHolderException();
        return __with2Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Get the last element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                 final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionHolderException();

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        return __with1Argument(collection, predicate, size);
    }

    /// Get the last element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLast(final @Nullable CollectionHolder<? extends T> collection,
                                 final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionHolderException();
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        return __with1Argument(collection, predicate, collection.size());
    }

    /// Get the last element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLast(final T @Nullable @Unmodifiable [] collection,
                                 final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionHolderException();

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionHolderException();
        return __with1Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the last element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                 final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            throw new NullCollectionHolderException();

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        return __with0Argument(collection, predicate, size);
    }

    /// Get the last element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLast(final @Nullable CollectionHolder<? extends T> collection,
                                 final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            throw new NullCollectionHolderException();
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        return __with0Argument(collection, predicate, collection.size());
    }

    /// Get the last element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T findLast(final T @Nullable @Unmodifiable [] collection,
                                 final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            throw new NullCollectionHolderException();

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionHolderException();
        return __with0Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @Nullable T __with0Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   final @NotNull BooleanSupplier predicate,
                                                   final int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.getAsBoolean())
                return collection.get(index);
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }

    private static <T> @Nullable T __with0Argument(final T @NotNull @Unmodifiable [] collection,
                                                   final @NotNull BooleanSupplier predicate,
                                                   final int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.getAsBoolean())
                return collection[index];
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }


    private static <T> @Nullable T __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   final @NotNull Predicate<? super T> predicate,
                                                   final int size) {
        var index = size;
        while (index-- > 0) {
            final var value = collection.get(index);
            if (predicate.test(value))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }

    private static <T> @Nullable T __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                   final @NotNull Predicate<? super T> predicate,
                                                   final int size) {
        var index = size;
        while (index-- > 0) {
            final var value = collection[index];
            if (predicate.test(value))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }


    private static <T> @Nullable T __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                   final @NotNull ObjIntPredicate<? super T> predicate,
                                                   final int size) {
        var index = size;
        while (index-- > 0) {
            final var value = collection.get(index);
            if (predicate.test(value, index))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }

    private static <T> @Nullable T __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                   final @NotNull ObjIntPredicate<? super T> predicate,
                                                   final int size) {
        var index = size;
        while (index-- > 0) {
            final var value = collection[index];
            if (predicate.test(value, index))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", 0);
    }

    //#endregion -------------------- Loop methods --------------------

}
