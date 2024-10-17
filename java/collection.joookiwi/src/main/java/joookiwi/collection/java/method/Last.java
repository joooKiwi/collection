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
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_2;

@NotNullByDefault
public final class Last
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private Last() { throw new ImpossibleConstructionException("The utility class “Last” cannot be constructed.", Last.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Get the last element in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @throws NullPointerException           The `collection` was `null` or **undefined**
    /// @throws EmptyCollectionHolderException The `collection` **is empty**
    /// @see java.util.SequencedCollection#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> @NotNull T last(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        return __withNoPredicate(collection, size);
    }

    /// Get the last element in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @throws NullPointerException           The `collection` was `null` or **undefined**
    /// @throws EmptyCollectionHolderException The `collection` [is empty][#isEmpty]
    /// @see java.util.SequencedCollection#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> @NotNull T last(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        return __withNoPredicate(collection, collection.size());
    }

    /// Get the last element in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    /// @throws NullPointerException           The `collection` was `null` or **undefined**
    /// @throws EmptyCollectionHolderException The `collection` **is empty**
    /// @see java.util.SequencedCollection#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> @NotNull T last(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionHolderException();
        return __withNoPredicate(collection, size);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullPointerException                      The `collection` was `null` or **undefined**
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                      final @Nullable ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with2Argument(collection, predicate, size);
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullPointerException                      The `collection` was `null` or **undefined**
    /// @throws EmptyCollectionHolderException            The `collection` [is empty][#isEmpty]
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(final @Nullable CollectionHolder<? extends T> collection,
                                      final @Nullable ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, collection.size());
        return __with2Argument(collection, predicate, collection.size());
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullPointerException                      The `collection` was `null` or **undefined**
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(final T @Nullable @Unmodifiable [] collection,
                                      final @Nullable ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with2Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullPointerException                      The `collection` was `null` or **undefined**
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                      final @Nullable Predicate<? super T> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with1Argument(collection, predicate, size);
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullPointerException                      The `collection` was `null` or **undefined**
    /// @throws EmptyCollectionHolderException            The `collection` [is empty][#isEmpty]
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(final @Nullable CollectionHolder<? extends T> collection,
                                      final @Nullable Predicate<? super T> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, collection.size());
        return __with1Argument(collection, predicate, collection.size());
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullPointerException                      The `collection` was `null` or **undefined**
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(final T @Nullable @Unmodifiable [] collection,
                                      final @Nullable Predicate<? super T> predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with1Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullPointerException                      The `collection` was `null` or **undefined**
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                      final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with0Argument(collection, predicate, size);
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullPointerException                      The `collection` was `null` or **undefined**
    /// @throws EmptyCollectionHolderException            The `collection` [is empty][#isEmpty]
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(final @Nullable CollectionHolder<? extends T> collection,
                                      final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, collection.size());
        return __with0Argument(collection, predicate, collection.size());
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullPointerException                      The `collection` was `null` or **undefined**
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> @NotNull T last(final T @Nullable @Unmodifiable [] collection,
                                      final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            throw new NullPointerException("No element could be retrieved from a null collection.");//TODO change to custom exception

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionHolderException();
        if (predicate == null)
            return __withNoPredicate(collection, size);
        return __with0Argument(collection, predicate, size);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> T __withNoPredicate(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                           final int size) {
        return collection.get(size - 1);
    }

    private static <T> T __withNoPredicate(final T @NotNull @Unmodifiable [] collection,
                                           final int size) {
        return collection[size - 1];
    }


    private static <T> T __with0Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                         final @NotNull BooleanSupplier predicate,
                                         final int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.getAsBoolean())
                return collection.get(index);
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1);
    }

    private static <T> T __with0Argument(final T @NotNull @Unmodifiable [] collection,
                                         final @NotNull BooleanSupplier predicate,
                                         final int size) {
        var index = size;
        while (index-- > 0)
            if (predicate.getAsBoolean())
                return collection[index];
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1);
    }


    private static <T> T __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                         final @NotNull Predicate<? super T> predicate,
                                         final int size) {
        var index = size;
        while (index-- > 0) {
            final var value = collection.get(index);
            if (predicate.test(value))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1);
    }

    private static <T> T __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                         final @NotNull Predicate<? super T> predicate,
                                         final int size) {
        var index = size;
        while (index-- > 0) {
            final var value = collection[index];
            if (predicate.test(value))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1);
    }


    private static <T> T __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                         final @NotNull ObjIntPredicate<? super T> predicate,
                                         final int size) {
        var index = size;
        while (index-- > 0) {
            final var value = collection.get(index);
            if (predicate.test(value, index))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1);
    }

    private static <T> T __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                         final @NotNull ObjIntPredicate<? super T> predicate,
                                         final int size) {
        var index = size;
        while (index-- > 0) {
            final var value = collection[index];
            if (predicate.test(value, index))
                return value;
        }
        throw new CollectionHolderIndexOutOfBoundsException("No element could be found from the filter predicate received in the collection.", size - 1);
    }

    //#endregion -------------------- Loop methods --------------------

}
