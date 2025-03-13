package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.NullCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_2;

@NotNullByDefault
public final class FindFirst
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private FindFirst() { throw new ImpossibleConstructionException("The utility class “FindFirst” cannot be constructed.", FindFirst.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Find the first element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> T findFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                           final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, size);
    }

    /// Find the first element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> T findFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                           final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionException();
        if (collection.isEmpty())
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, collection.size());
    }

    /// Find the first element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> T findFirst(final T @Nullable @Unmodifiable [] collection,
                                                           final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with2Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Find the first element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> T findFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                           final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with1Argument(collection, predicate, size);
    }

    /// Find the first element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> T findFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                           final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionException();
        if (collection.isEmpty())
            throw new EmptyCollectionException();
        return __with1Argument(collection, predicate, collection.size());
    }

    /// Find the first element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> T findFirst(final T @Nullable @Unmodifiable [] collection,
                                                           final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with1Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Find the first element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> T findFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                           final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException();
        return __with0Argument(collection, predicate, size);
    }

    /// Find the first element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> T findFirst(final @Nullable CollectionHolder<? extends T> collection,
                                                           final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            throw new NullCollectionException();
        if (collection.isEmpty())
            throw new EmptyCollectionException();
        return __with0Argument(collection, predicate, collection.size());
    }

    /// Find the first element from the `predicate` in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T extends @Nullable Object> T findFirst(final T @Nullable @Unmodifiable [] collection,
                                                           final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            throw new NullCollectionException();

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException();
        return __with0Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> T __with0Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                  final @NotNull BooleanSupplier predicate,
                                                                  final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.getAsBoolean())
                return collection.get(index);
        throw new IndexOutOfBoundsException("No element could be found from the “findFirst” predicate received in the collection.", 0);
    }

    private static <T extends @Nullable Object> T __with0Argument(final T @NotNull @Unmodifiable [] collection,
                                                                  final @NotNull BooleanSupplier predicate,
                                                                  final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.getAsBoolean())
                return collection[index];
        throw new IndexOutOfBoundsException("No element could be found from the “findFirst” predicate received in the collection.", 0);
    }


    private static <T extends @Nullable Object> T __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                  final @NotNull Predicate<? super T> predicate,
                                                                  final int size) {
        var index = -1;
        while (++index < size) {
            final var value = collection.get(index);
            if (predicate.test(value))
                return value;
        }
        throw new IndexOutOfBoundsException("No element could be found from the “findFirst” predicate received in the collection.", 0);
    }

    private static <T extends @Nullable Object> T __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                                  final @NotNull Predicate<? super T> predicate,
                                                                  final int size) {
        var index = -1;
        while (++index < size) {
            final var value = collection[index];
            if (predicate.test(value))
                return value;
        }
        throw new IndexOutOfBoundsException("No element could be found from the “findFirst” predicate received in the collection.", 0);
    }


    private static <T extends @Nullable Object> T __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                  final @NotNull ObjIntPredicate<? super T> predicate,
                                                                  final int size) {
        var index = -1;
        while (++index < size) {
            final var value = collection.get(index);
            if (predicate.test(value, index))
                return value;
        }
        throw new IndexOutOfBoundsException("No element could be found from the “findFirst” predicate received in the collection.", 0);
    }

    private static <T extends @Nullable Object> T __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                                  final @NotNull ObjIntPredicate<? super T> predicate,
                                                                  final int size) {
        var index = -1;
        while (++index < size) {
            final var value = collection[index];
            if (predicate.test(value, index))
                return value;
        }
        throw new IndexOutOfBoundsException("No element could be found from the “findFirst” predicate received in the collection.", 0);
    }

    //#endregion -------------------- Loop methods --------------------


}
