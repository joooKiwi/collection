package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.EmptyCollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class TakeWhile
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private TakeWhile() { throw new ImpossibleConstructionException("The utility class “TakeWhile” cannot be constructed.", TakeWhile.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Get a new [CollectionHolder] having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#takeWhile(java.util.function.Predicate) Stream.takeWhile(predicate)
    /// @see java.util.stream.IntStream#takeWhile(java.util.function.IntPredicate) IntStream.takeWhile(predicate)
    /// @see java.util.stream.LongStream#takeWhile(java.util.function.LongPredicate) LongStream.takeWhile(predicate)
    /// @see java.util.stream.DoubleStream#takeWhile(java.util.function.DoublePredicate) DoubleStream.takeWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html">Kotlin takeWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeWhile(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with2Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder] having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#takeWhile(java.util.function.Predicate) Stream.takeWhile(predicate)
    /// @see java.util.stream.IntStream#takeWhile(java.util.function.IntPredicate) IntStream.takeWhile(predicate)
    /// @see java.util.stream.LongStream#takeWhile(java.util.function.LongPredicate) LongStream.takeWhile(predicate)
    /// @see java.util.stream.DoubleStream#takeWhile(java.util.function.DoublePredicate) DoubleStream.takeWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html">Kotlin takeWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeWhile(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (collection.isEmpty())
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with2Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder] having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#takeWhile(java.util.function.Predicate) Stream.takeWhile(predicate)
    /// @see java.util.stream.IntStream#takeWhile(java.util.function.IntPredicate) IntStream.takeWhile(predicate)
    /// @see java.util.stream.LongStream#takeWhile(java.util.function.LongPredicate) LongStream.takeWhile(predicate)
    /// @see java.util.stream.DoubleStream#takeWhile(java.util.function.DoublePredicate) DoubleStream.takeWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html">Kotlin takeWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeWhile(final T @Nullable @Unmodifiable [] collection,
                                                                             final ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with2Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Get a new [CollectionHolder] having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#takeWhile(java.util.function.Predicate) Stream.takeWhile(predicate)
    /// @see java.util.stream.IntStream#takeWhile(java.util.function.IntPredicate) IntStream.takeWhile(predicate)
    /// @see java.util.stream.LongStream#takeWhile(java.util.function.LongPredicate) LongStream.takeWhile(predicate)
    /// @see java.util.stream.DoubleStream#takeWhile(java.util.function.DoublePredicate) DoubleStream.takeWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html">Kotlin takeWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeWhile(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final Predicate<? super T> predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with1Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder] having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#takeWhile(java.util.function.Predicate) Stream.takeWhile(predicate)
    /// @see java.util.stream.IntStream#takeWhile(java.util.function.IntPredicate) IntStream.takeWhile(predicate)
    /// @see java.util.stream.LongStream#takeWhile(java.util.function.LongPredicate) LongStream.takeWhile(predicate)
    /// @see java.util.stream.DoubleStream#takeWhile(java.util.function.DoublePredicate) DoubleStream.takeWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html">Kotlin takeWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeWhile(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final Predicate<? super T> predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (collection.isEmpty())
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with1Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder] having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#takeWhile(java.util.function.Predicate) Stream.takeWhile(predicate)
    /// @see java.util.stream.IntStream#takeWhile(java.util.function.IntPredicate) IntStream.takeWhile(predicate)
    /// @see java.util.stream.LongStream#takeWhile(java.util.function.LongPredicate) LongStream.takeWhile(predicate)
    /// @see java.util.stream.DoubleStream#takeWhile(java.util.function.DoublePredicate) DoubleStream.takeWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html">Kotlin takeWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeWhile(final T @Nullable @Unmodifiable [] collection,
                                                                             final Predicate<? super T> predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with1Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get a new [CollectionHolder] having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#takeWhile(java.util.function.Predicate) Stream.takeWhile(predicate)
    /// @see java.util.stream.IntStream#takeWhile(java.util.function.IntPredicate) IntStream.takeWhile(predicate)
    /// @see java.util.stream.LongStream#takeWhile(java.util.function.LongPredicate) LongStream.takeWhile(predicate)
    /// @see java.util.stream.DoubleStream#takeWhile(java.util.function.DoublePredicate) DoubleStream.takeWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html">Kotlin takeWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeWhile(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final BooleanSupplier predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with0Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder] having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#takeWhile(java.util.function.Predicate) Stream.takeWhile(predicate)
    /// @see java.util.stream.IntStream#takeWhile(java.util.function.IntPredicate) IntStream.takeWhile(predicate)
    /// @see java.util.stream.LongStream#takeWhile(java.util.function.LongPredicate) LongStream.takeWhile(predicate)
    /// @see java.util.stream.DoubleStream#takeWhile(java.util.function.DoublePredicate) DoubleStream.takeWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html">Kotlin takeWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeWhile(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final BooleanSupplier predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (collection.isEmpty())
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with0Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder] having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#takeWhile(java.util.function.Predicate) Stream.takeWhile(predicate)
    /// @see java.util.stream.IntStream#takeWhile(java.util.function.IntPredicate) IntStream.takeWhile(predicate)
    /// @see java.util.stream.LongStream#takeWhile(java.util.function.LongPredicate) LongStream.takeWhile(predicate)
    /// @see java.util.stream.DoubleStream#takeWhile(java.util.function.DoublePredicate) DoubleStream.takeWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html">Kotlin takeWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeWhile(final T @Nullable @Unmodifiable [] collection,
                                                                             final BooleanSupplier predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with0Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> T @Unmodifiable [] __with0Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final BooleanSupplier predicate,
                                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = -1;
        while (++index < size)
            if (predicate.getAsBoolean())
                newArray[index] = collection.get(index);
            else
                return __reduceTo(newArray, index);
        return newArray;
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __with0Argument(final T @Unmodifiable [] collection,
                                                                                   final BooleanSupplier predicate,
                                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = -1;
        while (++index < size)
            if (predicate.getAsBoolean())
                newArray[index] = collection[index];
            else
                return __reduceTo(newArray, index);
        return newArray;
    }


    private static <T extends @Nullable Object> T @Unmodifiable [] __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final Predicate<? super T> predicate,
                                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = -1;
        while (++index < size) {
            final var value = collection.get(index);
            if (predicate.test(value))
                newArray[index] = value;
            else
                return __reduceTo(newArray, index);
        }
        return newArray;
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __with1Argument(final T @Unmodifiable [] collection,
                                                                                   final Predicate<? super T> predicate,
                                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = -1;
        while (++index < size) {
            final var value = collection[index];
            if (predicate.test(value))
                newArray[index] = value;
            else
                return __reduceTo(newArray, index);
        }
        return newArray;
    }


    private static <T extends @Nullable Object> T @Unmodifiable [] __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final ObjIntPredicate<? super T> predicate,
                                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = -1;
        while (++index < size) {
            final var value = collection.get(index);
            if (predicate.test(value, index))
                newArray[index] = value;
            else
                return __reduceTo(newArray, index);
        }
        return newArray;
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __with2Argument(final T @Unmodifiable [] collection,
                                                                                   final ObjIntPredicate<? super T> predicate,
                                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = -1;
        while (++index < size) {
            final var value = collection[index];
            if (predicate.test(value, index))
                newArray[index] = value;
            else
                return __reduceTo(newArray, index);
        }
        return newArray;
    }

    //#endregion -------------------- Loop methods --------------------

}
