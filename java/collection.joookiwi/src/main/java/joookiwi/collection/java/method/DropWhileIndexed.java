package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.IntPredicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.EmptyCollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class DropWhileIndexed
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private DropWhileIndexed() { throw new ImpossibleConstructionException("The utility class “DropWhileIndexed” cannot be constructed.", DropWhileIndexed.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (int, T) → boolean --------------------

    /// Get a new [CollectionHolder] **not** having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#dropWhile(java.util.function.Predicate) Stream.dropWhile(predicate)
    /// @see java.util.stream.IntStream#dropWhile(java.util.function.IntPredicate) IntStream.dropWhile(predicate)
    /// @see java.util.stream.LongStream#dropWhile(java.util.function.LongPredicate) LongStream.dropWhile(predicate)
    /// @see java.util.stream.DoubleStream#dropWhile(java.util.function.DoublePredicate) DoubleStream.dropWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html">Kotlin dropWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> dropWhileIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                    final IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with2Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder] **not** having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#dropWhile(java.util.function.Predicate) Stream.dropWhile(predicate)
    /// @see java.util.stream.IntStream#dropWhile(java.util.function.IntPredicate) IntStream.dropWhile(predicate)
    /// @see java.util.stream.LongStream#dropWhile(java.util.function.LongPredicate) LongStream.dropWhile(predicate)
    /// @see java.util.stream.DoubleStream#dropWhile(java.util.function.DoublePredicate) DoubleStream.dropWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html">Kotlin dropWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> dropWhileIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                    final IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (collection.isEmpty())
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with2Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder] **not** having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#dropWhile(java.util.function.Predicate) Stream.dropWhile(predicate)
    /// @see java.util.stream.IntStream#dropWhile(java.util.function.IntPredicate) IntStream.dropWhile(predicate)
    /// @see java.util.stream.LongStream#dropWhile(java.util.function.LongPredicate) LongStream.dropWhile(predicate)
    /// @see java.util.stream.DoubleStream#dropWhile(java.util.function.DoublePredicate) DoubleStream.dropWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html">Kotlin dropWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> dropWhileIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                    final IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with2Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate (int, T) → boolean --------------------
    //#region -------------------- predicate (int) → boolean --------------------

    /// Get a new [CollectionHolder] **not** having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#dropWhile(java.util.function.Predicate) Stream.dropWhile(predicate)
    /// @see java.util.stream.IntStream#dropWhile(java.util.function.IntPredicate) IntStream.dropWhile(predicate)
    /// @see java.util.stream.LongStream#dropWhile(java.util.function.LongPredicate) LongStream.dropWhile(predicate)
    /// @see java.util.stream.DoubleStream#dropWhile(java.util.function.DoublePredicate) DoubleStream.dropWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html">Kotlin dropWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> dropWhileIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                    final IntPredicate predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with1Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder] **not** having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#dropWhile(java.util.function.Predicate) Stream.dropWhile(predicate)
    /// @see java.util.stream.IntStream#dropWhile(java.util.function.IntPredicate) IntStream.dropWhile(predicate)
    /// @see java.util.stream.LongStream#dropWhile(java.util.function.LongPredicate) LongStream.dropWhile(predicate)
    /// @see java.util.stream.DoubleStream#dropWhile(java.util.function.DoublePredicate) DoubleStream.dropWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html">Kotlin dropWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> dropWhileIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                    final IntPredicate predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (collection.isEmpty())
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with1Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder] **not** having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#dropWhile(java.util.function.Predicate) Stream.dropWhile(predicate)
    /// @see java.util.stream.IntStream#dropWhile(java.util.function.IntPredicate) IntStream.dropWhile(predicate)
    /// @see java.util.stream.LongStream#dropWhile(java.util.function.LongPredicate) LongStream.dropWhile(predicate)
    /// @see java.util.stream.DoubleStream#dropWhile(java.util.function.DoublePredicate) DoubleStream.dropWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html">Kotlin dropWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> dropWhileIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                    final IntPredicate predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with1Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate (int) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get a new [CollectionHolder] **not** having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#dropWhile(java.util.function.Predicate) Stream.dropWhile(predicate)
    /// @see java.util.stream.IntStream#dropWhile(java.util.function.IntPredicate) IntStream.dropWhile(predicate)
    /// @see java.util.stream.LongStream#dropWhile(java.util.function.LongPredicate) LongStream.dropWhile(predicate)
    /// @see java.util.stream.DoubleStream#dropWhile(java.util.function.DoublePredicate) DoubleStream.dropWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html">Kotlin dropWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> dropWhileIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                    final BooleanSupplier predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with0Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder] **not** having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#dropWhile(java.util.function.Predicate) Stream.dropWhile(predicate)
    /// @see java.util.stream.IntStream#dropWhile(java.util.function.IntPredicate) IntStream.dropWhile(predicate)
    /// @see java.util.stream.LongStream#dropWhile(java.util.function.LongPredicate) LongStream.dropWhile(predicate)
    /// @see java.util.stream.DoubleStream#dropWhile(java.util.function.DoublePredicate) DoubleStream.dropWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html">Kotlin dropWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> dropWhileIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                    final BooleanSupplier predicate) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (collection.isEmpty())
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__with0Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder] **not** having the first elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see java.util.stream.Stream#dropWhile(java.util.function.Predicate) Stream.dropWhile(predicate)
    /// @see java.util.stream.IntStream#dropWhile(java.util.function.IntPredicate) IntStream.dropWhile(predicate)
    /// @see java.util.stream.LongStream#dropWhile(java.util.function.LongPredicate) LongStream.dropWhile(predicate)
    /// @see java.util.stream.DoubleStream#dropWhile(java.util.function.DoublePredicate) DoubleStream.dropWhile(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html">Kotlin dropWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> dropWhileIndexed(final T @Nullable @Unmodifiable [] collection,
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
        var index = -1;
        while (++index < size)
            if (!predicate.getAsBoolean()) {
                @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - index];
                var indexToRetrieve = index - 1;
                var indexToAdd = -1;
                while (++indexToRetrieve <= size)
                    newArray[++indexToAdd] = collection.get(index);
                return newArray;
            }
        return emptyArray();
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __with0Argument(final T @Unmodifiable [] collection,
                                                                                   final BooleanSupplier predicate,
                                                                                   final int size) {
        var index = -1;
        while (++index < size)
            if (!predicate.getAsBoolean()) {
                @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - index];
                var indexToRetrieve = index - 1;
                var indexToAdd = -1;
                while (++indexToRetrieve <= size)
                    newArray[++indexToAdd] = collection[index];
                return newArray;
            }
        return emptyArray();
    }


    private static <T extends @Nullable Object> T @Unmodifiable [] __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final IntPredicate predicate,
                                                                                   final int size) {
        var index = -1;
        while (++index < size)
            if (!predicate.test(index)) {
                @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - index];
                var indexToRetrieve = index - 1;
                var indexToAdd = -1;
                while (++indexToRetrieve <= size)
                    newArray[++indexToAdd] = collection.get(index);
                return newArray;
            }
        return emptyArray();
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __with1Argument(final T @Unmodifiable [] collection,
                                                                                   final IntPredicate predicate,
                                                                                   final int size) {
        var index = -1;
        while (++index < size)
            if (!predicate.test(index)) {
                @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - index];
                var indexToRetrieve = index - 1;
                var indexToAdd = -1;
                while (++indexToRetrieve <= size)
                    newArray[++indexToAdd] = collection[index];
                return newArray;
            }
        return emptyArray();
    }


    private static <T extends @Nullable Object> T @Unmodifiable [] __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final IntObjPredicate<? super T> predicate,
                                                                                   final int size) {
        var index = -1;
        while (++index < size) {
            final var value = collection.get(index);
            if (!predicate.test(index, value)) {
                @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - index];
                newArray[0] = value;
                var indexToRetrieve = index - 1;
                var indexToAdd = 0;
                while (++indexToRetrieve <= size)
                    newArray[++indexToAdd] = collection.get(index);
                return newArray;
            }
        }
        return emptyArray();
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __with2Argument(final T @Unmodifiable [] collection,
                                                                                   final IntObjPredicate<? super T> predicate,
                                                                                   final int size) {
        var index = -1;
        while (++index < size) {
            final var value = collection[index];
            if (!predicate.test(index, value)) {
                @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - index];
                newArray[0] = value;
                var indexToRetrieve = index - 1;
                var indexToAdd = 0;
                while (++indexToRetrieve <= size)
                    newArray[++indexToAdd] = collection[index];
                return newArray;
            }
        }
        return emptyArray();
    }

    //#endregion -------------------- Loop methods --------------------

}
