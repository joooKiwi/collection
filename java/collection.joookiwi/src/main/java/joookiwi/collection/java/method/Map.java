package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class Map
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private Map() { throw new ImpossibleConstructionException("The utility class “Map” cannot be constructed.", Map.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(java.util.function.Function) Stream.map(transform)
    /// @see java.util.stream.IntStream#map(java.util.function.IntUnaryOperator) IntStream.map(transform)
    /// @see java.util.stream.LongStream#map(java.util.function.LongUnaryOperator) LongStream.map(transform)
    /// @see java.util.stream.DoubleStream#map(java.util.function.DoubleUnaryOperator) DoubleStream.map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">JavaScript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> CollectionHolder<U> map(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                   final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with2Argument(collection, transform, size));
    }

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(java.util.function.Function) Stream.map(transform)
    /// @see java.util.stream.IntStream#map(java.util.function.IntUnaryOperator) IntStream.map(transform)
    /// @see java.util.stream.LongStream#map(java.util.function.LongUnaryOperator) LongStream.map(transform)
    /// @see java.util.stream.DoubleStream#map(java.util.function.DoubleUnaryOperator) DoubleStream.map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">JavaScript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> CollectionHolder<U> map(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                   final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with2Argument(collection, transform, collection.size()));
    }

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(java.util.function.Function) Stream.map(transform)
    /// @see java.util.stream.IntStream#map(java.util.function.IntUnaryOperator) IntStream.map(transform)
    /// @see java.util.stream.LongStream#map(java.util.function.LongUnaryOperator) LongStream.map(transform)
    /// @see java.util.stream.DoubleStream#map(java.util.function.DoubleUnaryOperator) DoubleStream.map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">JavaScript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> CollectionHolder<U> map(final T @Nullable @Unmodifiable [] collection,
                                                                                                   final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with2Argument(collection, transform, size));
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(java.util.function.Function) Stream.map(transform)
    /// @see java.util.stream.IntStream#map(java.util.function.IntUnaryOperator) IntStream.map(transform)
    /// @see java.util.stream.LongStream#map(java.util.function.LongUnaryOperator) LongStream.map(transform)
    /// @see java.util.stream.DoubleStream#map(java.util.function.DoubleUnaryOperator) DoubleStream.map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">JavaScript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> CollectionHolder<U> map(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                   final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with1Argument(collection, transform, size));
    }

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(java.util.function.Function) Stream.map(transform)
    /// @see java.util.stream.IntStream#map(java.util.function.IntUnaryOperator) IntStream.map(transform)
    /// @see java.util.stream.LongStream#map(java.util.function.LongUnaryOperator) LongStream.map(transform)
    /// @see java.util.stream.DoubleStream#map(java.util.function.DoubleUnaryOperator) DoubleStream.map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">JavaScript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> CollectionHolder<U> map(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                   final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with1Argument(collection, transform, collection.size()));
    }

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(java.util.function.Function) Stream.map(transform)
    /// @see java.util.stream.IntStream#map(java.util.function.IntUnaryOperator) IntStream.map(transform)
    /// @see java.util.stream.LongStream#map(java.util.function.LongUnaryOperator) LongStream.map(transform)
    /// @see java.util.stream.DoubleStream#map(java.util.function.DoubleUnaryOperator) DoubleStream.map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">JavaScript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> CollectionHolder<U> map(final T @Nullable @Unmodifiable [] collection,
                                                                                                   final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with1Argument(collection, transform, size));
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(java.util.function.Function) Stream.map(transform)
    /// @see java.util.stream.IntStream#map(java.util.function.IntUnaryOperator) IntStream.map(transform)
    /// @see java.util.stream.LongStream#map(java.util.function.LongUnaryOperator) LongStream.map(transform)
    /// @see java.util.stream.DoubleStream#map(java.util.function.DoubleUnaryOperator) DoubleStream.map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">JavaScript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> CollectionHolder<U> map(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                   final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with0Argument(transform, size));
    }

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(java.util.function.Function) Stream.map(transform)
    /// @see java.util.stream.IntStream#map(java.util.function.IntUnaryOperator) IntStream.map(transform)
    /// @see java.util.stream.LongStream#map(java.util.function.LongUnaryOperator) LongStream.map(transform)
    /// @see java.util.stream.DoubleStream#map(java.util.function.DoubleUnaryOperator) DoubleStream.map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">JavaScript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> CollectionHolder<U> map(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                   final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with0Argument(transform, collection.size()));
    }

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(java.util.function.Function) Stream.map(transform)
    /// @see java.util.stream.IntStream#map(java.util.function.IntUnaryOperator) IntStream.map(transform)
    /// @see java.util.stream.LongStream#map(java.util.function.LongUnaryOperator) LongStream.map(transform)
    /// @see java.util.stream.DoubleStream#map(java.util.function.DoubleUnaryOperator) DoubleStream.map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">JavaScript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> CollectionHolder<U> map(final T @Nullable @Unmodifiable [] collection,
                                                                                                   final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with0Argument(transform, size));
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <U extends @Nullable Object> U @Unmodifiable [] __with0Argument(final Supplier<? extends U> action,
                                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (U[]) new Object[size];
        var index = -1;
        while (++index < size)
            newArray[index] = action.get();
        return newArray;
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> U @Unmodifiable [] __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                               final Function<? super T, ? extends U> transform,
                                                                                                               final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (U[]) new Object[size];
        var index = -1;
        while (++index < size)
            newArray[index] = transform.apply(collection.get(index));
        return newArray;
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> U @Unmodifiable [] __with1Argument(final T @Unmodifiable [] collection,
                                                                                                               final Function<? super T, ? extends U> transform,
                                                                                                               final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (U[]) new Object[size];
        var index = -1;
        while (++index < size)
            newArray[index] = transform.apply(collection[index]);
        return newArray;
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> U @Unmodifiable [] __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                               final ObjIntFunction<? super T, ? extends U> transform,
                                                                                                               final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (U[]) new Object[size];
        var index = -1;
        while (++index < size)
            newArray[index] = transform.apply(collection.get(index), index);
        return newArray;
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> U @Unmodifiable [] __with2Argument(final T @Unmodifiable [] collection,
                                                                                                               final ObjIntFunction<? super T, ? extends U> transform,
                                                                                                               final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (U[]) new Object[size];
        var index = -1;
        while (++index < size)
            newArray[index] = transform.apply(collection[index], index);
        return newArray;
    }

    //#endregion -------------------- Loop methods --------------------

}
