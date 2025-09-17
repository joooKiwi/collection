package joookiwi.collection.java.method;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ImmutablePriorityBlockingQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyPriorityBlockingQueue;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;

@NotNullByDefault
public final class ToPriorityBlockingQueue
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToPriorityBlockingQueue() { throw new ImpossibleConstructionException("The utility class “ToPriorityBlockingQueue” cannot be constructed.", ToPriorityBlockingQueue.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends Comparable<? super T>> ImmutablePriorityBlockingQueue<T> toPriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyPriorityBlockingQueue();

        final var size = collection.size();
        if (size == 0)
            return emptyPriorityBlockingQueue();
        return new ImmutablePriorityBlockingQueue<>(_orderedValues(collection, size));
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends Comparable<? super T>> ImmutablePriorityBlockingQueue<T> toPriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyPriorityBlockingQueue();
        if (collection.isEmpty())
            return emptyPriorityBlockingQueue();
        return new ImmutablePriorityBlockingQueue<>(_orderedValues(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends Comparable<? super T>> ImmutablePriorityBlockingQueue<T> toPriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyPriorityBlockingQueue();

        final var size = collection.length;
        if (size == 0)
            return emptyPriorityBlockingQueue();
        return new ImmutablePriorityBlockingQueue<>(_orderedValues(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyPriorityBlockingQueue();

        final var size = collection.size();
        if (size == 0)
            return emptyPriorityBlockingQueue();
        return new ImmutablePriorityBlockingQueue<>(_orderedValues(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyPriorityBlockingQueue();
        if (collection.isEmpty())
            return emptyPriorityBlockingQueue();
        return new ImmutablePriorityBlockingQueue<>(_orderedValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyPriorityBlockingQueue();

        final var size = collection.length;
        if (size == 0)
            return emptyPriorityBlockingQueue();
        return new ImmutablePriorityBlockingQueue<>(_orderedValues(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyPriorityBlockingQueue();

        final var size = collection.size();
        if (size == 0)
            return emptyPriorityBlockingQueue();
        return new ImmutablePriorityBlockingQueue<>(_orderedValues(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyPriorityBlockingQueue();
        if (collection.isEmpty())
            return emptyPriorityBlockingQueue();
        return new ImmutablePriorityBlockingQueue<>(_orderedValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyPriorityBlockingQueue();

        final var size = collection.length;
        if (size == 0)
            return emptyPriorityBlockingQueue();
        return new ImmutablePriorityBlockingQueue<>(_orderedValues(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                          final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyPriorityBlockingQueue();

        final var size = collection.size();
        if (size == 0)
            return emptyPriorityBlockingQueue();
        return new ImmutablePriorityBlockingQueue<>(_orderedValues(size, transform));
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                          final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyPriorityBlockingQueue();
        if (collection.isEmpty())
            return emptyPriorityBlockingQueue();
        return new ImmutablePriorityBlockingQueue<>(_orderedValues(collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                          final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyPriorityBlockingQueue();

        final var size = collection.length;
        if (size == 0)
            return emptyPriorityBlockingQueue();
        return new ImmutablePriorityBlockingQueue<>(_orderedValues(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#region -------------------- comparator --------------------

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ImmutablePriorityBlockingQueue<T> toPriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                final Comparator<? super T> comparator) {
        if (collection == null)
            return new ImmutablePriorityBlockingQueue<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutablePriorityBlockingQueue<>(comparator);
        return new ImmutablePriorityBlockingQueue<>(_uniqueValues(collection, size), comparator);
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ImmutablePriorityBlockingQueue<T> toPriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                final Comparator<? super T> comparator) {
        if (collection == null)
            return new ImmutablePriorityBlockingQueue<>(comparator);
        if (collection.isEmpty())
            return new ImmutablePriorityBlockingQueue<>(comparator);
        if (collection.hasDuplicate())
            return new ImmutablePriorityBlockingQueue<>(_values(collection, collection.size()), comparator);
        return new ImmutablePriorityBlockingQueue<>(_uniqueValues(collection, collection.size()), comparator);
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ImmutablePriorityBlockingQueue<T> toPriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                final Comparator<? super T> comparator) {
        if (collection == null)
            return new ImmutablePriorityBlockingQueue<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutablePriorityBlockingQueue<>(comparator);
        return new ImmutablePriorityBlockingQueue<>(_uniqueValues(collection, size), comparator);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- comparator, (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutablePriorityBlockingQueue<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutablePriorityBlockingQueue<>(comparator);
        return new ImmutablePriorityBlockingQueue<>(_uniqueValues(collection, size, transform), comparator);
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutablePriorityBlockingQueue<>(comparator);
        if (collection.isEmpty())
            return new ImmutablePriorityBlockingQueue<>(comparator);
        return new ImmutablePriorityBlockingQueue<>(_uniqueValues(collection, collection.size(), transform), comparator);
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutablePriorityBlockingQueue<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutablePriorityBlockingQueue<>(comparator);
        return new ImmutablePriorityBlockingQueue<>(_uniqueValues(collection, size, transform), comparator);
    }

    //#endregion -------------------- comparator, (T, int) → U --------------------
    //#region -------------------- comparator, (T) → U --------------------

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutablePriorityBlockingQueue<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutablePriorityBlockingQueue<>(comparator);
        return new ImmutablePriorityBlockingQueue<>(_uniqueValues(collection, size, transform), comparator);
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutablePriorityBlockingQueue<>(comparator);
        if (collection.isEmpty())
            return new ImmutablePriorityBlockingQueue<>(comparator);
        return new ImmutablePriorityBlockingQueue<>(_uniqueValues(collection, collection.size(), transform), comparator);
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutablePriorityBlockingQueue<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutablePriorityBlockingQueue<>(comparator);
        return new ImmutablePriorityBlockingQueue<>(_uniqueValues(collection, size, transform), comparator);
    }

    //#endregion -------------------- comparator, (T) → U --------------------
    //#region -------------------- comparator, () → U --------------------

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final Supplier<? extends U> transform) {
        if (collection == null)
            return new ImmutablePriorityBlockingQueue<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutablePriorityBlockingQueue<>(comparator);
        return new ImmutablePriorityBlockingQueue<>(_uniqueValues(size, transform), comparator);
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final Supplier<? extends U> transform) {
        if (collection == null)
            return new ImmutablePriorityBlockingQueue<>(comparator);
        if (collection.isEmpty())
            return new ImmutablePriorityBlockingQueue<>(comparator);
        return new ImmutablePriorityBlockingQueue<>(_uniqueValues(collection.size(), transform), comparator);
    }

    /// Convert the `collection` to an [ImmutablePriorityBlockingQueue]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final Supplier<? extends U> transform) {
        if (collection == null)
            return new ImmutablePriorityBlockingQueue<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutablePriorityBlockingQueue<>(comparator);
        return new ImmutablePriorityBlockingQueue<>(_uniqueValues(size, transform), comparator);
    }

    //#endregion -------------------- comparator, () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
