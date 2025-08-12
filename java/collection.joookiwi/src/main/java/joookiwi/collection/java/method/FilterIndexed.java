package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.IntPredicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class FilterIndexed
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private FilterIndexed() { throw new ImpossibleConstructionException("The utility class “FilterIndexed” cannot be constructed.", FilterIndexed.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (int, T) → boolean --------------------

    /// Get a new [CollectionHolder]
    /// matching only the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#filter(java.util.function.Predicate) Stream.filter(predicate)
    /// @see java.util.stream.IntStream#filter(IntPredicate) IntStream.filter(predicate)
    /// @see java.util.stream.LongStream#filter(java.util.function.LongPredicate) LongStream.filter(predicate)
    /// @see java.util.stream.DoubleStream#filter(java.util.function.DoublePredicate) DoubleStream.filter(predicate)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/filter">JavaScript Array.filter(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html">Kotlin filterIndexed(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where">C# Where(predicate)</a>
    @ExtensionFunction
    public static <T> CollectionHolder<T> filterIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                        final IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with2Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder]
    /// matching only the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#filter(java.util.function.Predicate) Stream.filter(predicate)
    /// @see java.util.stream.IntStream#filter(IntPredicate) IntStream.filter(predicate)
    /// @see java.util.stream.LongStream#filter(java.util.function.LongPredicate) LongStream.filter(predicate)
    /// @see java.util.stream.DoubleStream#filter(java.util.function.DoublePredicate) DoubleStream.filter(predicate)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/filter">JavaScript Array.filter(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html">Kotlin filterIndexed(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where">C# Where(predicate)</a>
    @ExtensionFunction
    public static <T> CollectionHolder<T> filterIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                        final IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with2Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder]
    /// matching only the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#filter(java.util.function.Predicate) Stream.filter(predicate)
    /// @see java.util.stream.IntStream#filter(IntPredicate) IntStream.filter(predicate)
    /// @see java.util.stream.LongStream#filter(java.util.function.LongPredicate) LongStream.filter(predicate)
    /// @see java.util.stream.DoubleStream#filter(java.util.function.DoublePredicate) DoubleStream.filter(predicate)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/filter">JavaScript Array.filter(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html">Kotlin filterIndexed(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where">C# Where(predicate)</a>
    @ExtensionFunction
    public static <T> CollectionHolder<T> filterIndexed(final T @Nullable @Unmodifiable [] collection,
                                                        final IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with2Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate (int, T) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Get a new [CollectionHolder]
    /// matching only the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#filter(java.util.function.Predicate) Stream.filter(predicate)
    /// @see java.util.stream.IntStream#filter(IntPredicate) IntStream.filter(predicate)
    /// @see java.util.stream.LongStream#filter(java.util.function.LongPredicate) LongStream.filter(predicate)
    /// @see java.util.stream.DoubleStream#filter(java.util.function.DoublePredicate) DoubleStream.filter(predicate)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/filter">JavaScript Array.filter(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html">Kotlin filterIndexed(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where">C# Where(predicate)</a>
    @ExtensionFunction
    public static <T> CollectionHolder<T> filterIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                        final IntPredicate predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with1Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder]
    /// matching only the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#filter(java.util.function.Predicate) Stream.filter(predicate)
    /// @see java.util.stream.IntStream#filter(IntPredicate) IntStream.filter(predicate)
    /// @see java.util.stream.LongStream#filter(java.util.function.LongPredicate) LongStream.filter(predicate)
    /// @see java.util.stream.DoubleStream#filter(java.util.function.DoublePredicate) DoubleStream.filter(predicate)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/filter">JavaScript Array.filter(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html">Kotlin filterIndexed(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where">C# Where(predicate)</a>
    @ExtensionFunction
    public static <T> CollectionHolder<T> filterIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                        final IntPredicate predicate) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with1Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder]
    /// matching only the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#filter(java.util.function.Predicate) Stream.filter(predicate)
    /// @see java.util.stream.IntStream#filter(IntPredicate) IntStream.filter(predicate)
    /// @see java.util.stream.LongStream#filter(java.util.function.LongPredicate) LongStream.filter(predicate)
    /// @see java.util.stream.DoubleStream#filter(java.util.function.DoublePredicate) DoubleStream.filter(predicate)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/filter">JavaScript Array.filter(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html">Kotlin filterIndexed(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where">C# Where(predicate)</a>
    @ExtensionFunction
    public static <T> CollectionHolder<T> filterIndexed(final T @Nullable @Unmodifiable [] collection,
                                                        final IntPredicate predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with1Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get a new [CollectionHolder]
    /// matching only the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#filter(java.util.function.Predicate) Stream.filter(predicate)
    /// @see java.util.stream.IntStream#filter(IntPredicate) IntStream.filter(predicate)
    /// @see java.util.stream.LongStream#filter(java.util.function.LongPredicate) LongStream.filter(predicate)
    /// @see java.util.stream.DoubleStream#filter(java.util.function.DoublePredicate) DoubleStream.filter(predicate)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/filter">JavaScript Array.filter(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html">Kotlin filterIndexed(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where">C# Where(predicate)</a>
    @ExtensionFunction
    public static <T> CollectionHolder<T> filterIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                        final BooleanSupplier predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with0Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder]
    /// matching only the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#filter(java.util.function.Predicate) Stream.filter(predicate)
    /// @see java.util.stream.IntStream#filter(IntPredicate) IntStream.filter(predicate)
    /// @see java.util.stream.LongStream#filter(java.util.function.LongPredicate) LongStream.filter(predicate)
    /// @see java.util.stream.DoubleStream#filter(java.util.function.DoublePredicate) DoubleStream.filter(predicate)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/filter">JavaScript Array.filter(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html">Kotlin filterIndexed(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where">C# Where(predicate)</a>
    @ExtensionFunction
    public static <T> CollectionHolder<T> filterIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                        final BooleanSupplier predicate) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with0Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder]
    /// matching only the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#filter(java.util.function.Predicate) Stream.filter(predicate)
    /// @see java.util.stream.IntStream#filter(IntPredicate) IntStream.filter(predicate)
    /// @see java.util.stream.LongStream#filter(java.util.function.LongPredicate) LongStream.filter(predicate)
    /// @see java.util.stream.DoubleStream#filter(java.util.function.DoublePredicate) DoubleStream.filter(predicate)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/filter">JavaScript Array.filter(predicate)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html">Kotlin filterIndexed(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where">C# Where(predicate)</a>
    @ExtensionFunction
    public static <T> CollectionHolder<T> filterIndexed(final T @Nullable @Unmodifiable [] collection,
                                                        final BooleanSupplier predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with0Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> T @Unmodifiable [] __with0Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final BooleanSupplier predicate,
                                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var tempArray = (T[]) new Object[size];
        var amountOfItemsAdded = -1;
        var index = -1;
        while (++index < size)
            if (predicate.getAsBoolean())
                tempArray[++amountOfItemsAdded] = collection.get(index);
        return __reduceTo(tempArray, amountOfItemsAdded + 1);
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __with0Argument(final T @Unmodifiable [] collection,
                                                                                   final BooleanSupplier predicate,
                                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var tempArray = (T[]) new Object[size];
        var amountOfItemsAdded = -1;
        var index = -1;
        while (++index < size)
            if (predicate.getAsBoolean())
                tempArray[++amountOfItemsAdded] = collection[index];
        return __reduceTo(tempArray, amountOfItemsAdded + 1);
    }


    private static <T extends @Nullable Object> T @Unmodifiable [] __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final IntPredicate predicate,
                                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var tempArray = (T[]) new Object[size];
        var amountOfItemsAdded = -1;
        var index = -1;
        while (++index < size)
            if (predicate.test(index))
                tempArray[++amountOfItemsAdded] = collection.get(index);
        return __reduceTo(tempArray, amountOfItemsAdded + 1);
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __with1Argument(final T @Unmodifiable [] collection,
                                                                                   final IntPredicate predicate,
                                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var tempArray = (T[]) new Object[size];
        var amountOfItemsAdded = -1;
        var index = -1;
        while (++index < size)
            if (predicate.test(index))
                tempArray[++amountOfItemsAdded] = collection[index];
        return __reduceTo(tempArray, amountOfItemsAdded + 1);
    }


    private static <T extends @Nullable Object> T @Unmodifiable [] __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final IntObjPredicate<? super T> predicate,
                                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var tempArray = (T[]) new Object[size];
        var amountOfItemsAdded = -1;
        var index = -1;
        while (++index < size) {
            final var value = collection.get(index);
            if (predicate.test(index, value))
                tempArray[++amountOfItemsAdded] = value;
        }
        return __reduceTo(tempArray, amountOfItemsAdded + 1);
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __with2Argument(final T @Unmodifiable [] collection,
                                                                                   final IntObjPredicate<? super T> predicate,
                                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var tempArray = (T[]) new Object[size];
        var amountOfItemsAdded = -1;
        var index = -1;
        while (++index < size) {
            final var value = collection[index];
            if (predicate.test(index, value))
                tempArray[++amountOfItemsAdded] = value;
        }
        return __reduceTo(tempArray, amountOfItemsAdded + 1);
    }

    //#endregion -------------------- Loop methods --------------------

}
