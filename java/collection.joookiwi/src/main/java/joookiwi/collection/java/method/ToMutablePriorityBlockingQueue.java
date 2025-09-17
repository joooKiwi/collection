package joookiwi.collection.java.method;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableHashSet;
import joookiwi.collection.java.extended.MutablePriorityBlockingQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_4;

@NotNullByDefault
public final class ToMutablePriorityBlockingQueue
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutablePriorityBlockingQueue() { throw new ImpossibleConstructionException("The utility class “ToMutablePriorityBlockingQueue” cannot be constructed.", ToMutablePriorityBlockingQueue.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends Comparable<? super T>> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return __empty();
        return __core(collection);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends Comparable<? super T>> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return __empty();
        return __core(collection);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends Comparable<? super T>> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return __empty();
        return __core(collection);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                               final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();
        return __core(collection, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                               final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();
        return __core(collection, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                               final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();
        return __core(collection, transform);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                               final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();
        return __core(collection, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                               final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();
        return __core(collection, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                               final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();
        return __core(collection, transform);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                               final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty();
        return __core(collection, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                               final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty();
        return __core(collection, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                               final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty();
        return __core(collection, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#region -------------------- comparator --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final Comparator<? super T> comparator) {
        if (collection == null)
            return __empty(comparator);
        return __core(collection, comparator);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final Comparator<? super T> comparator) {
        if (collection == null)
            return __empty(comparator);
        return __core(collection, comparator);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                     final Comparator<? super T> comparator) {
        if (collection == null)
            return __empty(comparator);
        return __core(collection, comparator);
    }

    //#endregion -------------------- comparator --------------------
    //#region -------------------- comparator, (T, int) → U --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
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
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(comparator);
        return __core(collection, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
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
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(comparator);
        return __core(collection, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
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
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(comparator);
        return __core(collection, comparator, transform);
    }

    //#endregion -------------------- comparator, (T, int) → U --------------------
    //#region -------------------- comparator, (T) → U --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
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
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(comparator);
        return __core(collection, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
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
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(comparator);
        return __core(collection, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
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
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(comparator);
        return __core(collection, comparator, transform);
    }

    //#endregion -------------------- comparator, (T) → U --------------------
    //#region -------------------- comparator, () → U --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
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
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(comparator);
        return __core(collection, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
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
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(comparator);
        return __core(collection, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
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
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(comparator);
        return __core(collection, comparator, transform);
    }

    //#endregion -------------------- comparator, () → U --------------------

    //#region -------------------- initialCapacity --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final int initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Integer initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection);
        return __core(collection, initialCapacity);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][CollectionHolder#size]</code> if under the size)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final int initialCapacity) {
        if (collection == null)
            return new MutablePriorityBlockingQueue<>(initialCapacity);
        return __core(collection, initialCapacity);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][CollectionHolder#size]</code> if under the size)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Integer initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection);
        return __core(collection, initialCapacity);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                     final int initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                     final @Nullable Integer initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection);
        return __core(collection, initialCapacity);
    }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, (T, int) → U --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }

    //#endregion -------------------- initialCapacity, (T, int) → U --------------------
    //#region -------------------- initialCapacity, (T) → U --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }
    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }

    //#endregion -------------------- initialCapacity, (T) → U --------------------
    //#region -------------------- initialCapacity, () → U --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }

    //#endregion -------------------- initialCapacity, () → U --------------------

    //#region -------------------- initialCapacity, comparator --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity and a [Comparator]
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final int initialCapacity,
                                                                                     final Comparator<? super T> comparator) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        return __core(collection, initialCapacity, comparator);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity and a [Comparator]
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final @Nullable Integer initialCapacity,
                                                                                     final Comparator<? super T> comparator) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        if (initialCapacity == null)
            return __core(collection, comparator);
        return __core(collection, initialCapacity, comparator);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity and a [Comparator]
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][CollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final int initialCapacity,
                                                                                     final Comparator<? super T> comparator) {
        if (collection == null)
            return new MutablePriorityBlockingQueue<>(initialCapacity, comparator);
        return __core(collection, initialCapacity, comparator);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity and a [Comparator]
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][CollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final @Nullable Integer initialCapacity,
                                                                                     final Comparator<? super T> comparator) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        if (initialCapacity == null)
            return __core(collection, comparator);
        return __core(collection, initialCapacity, comparator);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity and a [Comparator]
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                     final int initialCapacity,
                                                                                     final Comparator<? super T> comparator) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        return __core(collection, initialCapacity, comparator);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity and a [Comparator]
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T> MutablePriorityBlockingQueue<T> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                     final @Nullable Integer initialCapacity,
                                                                                     final Comparator<? super T> comparator) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        if (initialCapacity == null)
            return __core(collection, comparator);
        return __core(collection, initialCapacity, comparator);
    }

    //#endregion -------------------- initialCapacity, comparator --------------------
    //#region -------------------- initialCapacity, comparator, (T, int) → U --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        return __core(collection, initialCapacity, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        if (initialCapacity == null)
            return __core(collection, comparator, transform);
        return __core(collection, initialCapacity, comparator, transform);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][CollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        return __core(collection, initialCapacity, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][CollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        if (initialCapacity == null)
            return __core(collection, comparator, transform);
        return __core(collection, initialCapacity, comparator, transform);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        return __core(collection, initialCapacity, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        if (initialCapacity == null)
            return __core(collection, comparator, transform);
        return __core(collection, initialCapacity, comparator, transform);
    }

    //#endregion -------------------- initialCapacity, comparator, (T, int) → U --------------------
    //#region -------------------- initialCapacity, comparator, (T) → U --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        return __core(collection, initialCapacity, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        if (initialCapacity == null)
            return __core(collection, comparator, transform);
        return __core(collection, initialCapacity, comparator, transform);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][CollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        return __core(collection, initialCapacity, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][CollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        if (initialCapacity == null)
            return __core(collection, comparator, transform);
        return __core(collection, initialCapacity, comparator, transform);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        return __core(collection, initialCapacity, comparator, transform);
    }
    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        if (initialCapacity == null)
            return __core(collection, comparator, transform);
        return __core(collection, initialCapacity, comparator, transform);
    }

    //#endregion -------------------- initialCapacity, comparator, (T) → U --------------------
    //#region -------------------- initialCapacity, comparator, () → U --------------------

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        return __core(collection, initialCapacity, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        if (initialCapacity == null)
            return __core(collection, comparator, transform);
        return __core(collection, initialCapacity, comparator, transform);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][CollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        return __core(collection, initialCapacity, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the <code>collection.[size][CollectionHolder#size]</code> if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        if (initialCapacity == null)
            return __core(collection, comparator, transform);
        return __core(collection, initialCapacity, comparator, transform);
    }


    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final int initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        return __core(collection, initialCapacity, comparator, transform);
    }

    /// Convert the `collection` to an [MutablePriorityBlockingQueue]
    /// with an initial capacity, a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [queue][java.util.concurrent.PriorityBlockingQueue] initial capacity (or the `collection.length` if under the size)
    /// @param comparator      The [queue][java.util.concurrent.PriorityBlockingQueue] [Comparator] to compare the values to each other
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final @Nullable Integer initialCapacity,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity, comparator);
        if (initialCapacity == null)
            return __core(collection, comparator, transform);
        return __core(collection, initialCapacity, comparator, transform);
    }

    //#endregion -------------------- initialCapacity, comparator, () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- empty --------------------

    private static <T> MutablePriorityBlockingQueue<T> __empty() { return new MutablePriorityBlockingQueue<>(); }


    private static <T> MutablePriorityBlockingQueue<T> __empty(final Comparator<? super T> comparator) { return new MutablePriorityBlockingQueue<>(comparator); }


    private static <T> MutablePriorityBlockingQueue<T> __empty(final int initialCapacity) { return new MutablePriorityBlockingQueue<>(initialCapacity); }

    private static <T> MutablePriorityBlockingQueue<T> __empty(final @Nullable Integer initialCapacity) { return new MutablePriorityBlockingQueue<>(initialCapacity); }


    private static <T> MutablePriorityBlockingQueue<T> __empty(final int initialCapacity,
                                                               final Comparator<? super T> comparator) { return new MutablePriorityBlockingQueue<>(initialCapacity, comparator); }

    private static <T> MutablePriorityBlockingQueue<T> __empty(final @Nullable Integer initialCapacity,
                                                               final Comparator<? super T> comparator) { return new MutablePriorityBlockingQueue<>(initialCapacity, comparator); }

    //#endregion -------------------- empty --------------------

    //#region -------------------- ∅ --------------------

    private static <T> MutablePriorityBlockingQueue<T> __core(final MinimalistCollectionHolder<? extends T> collection) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>();
        return new MutablePriorityBlockingQueue<>(_values(collection, size));
    }

    private static <T> MutablePriorityBlockingQueue<T> __core(final CollectionHolder<? extends T> collection) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>();
        return new MutablePriorityBlockingQueue<>(_values(collection, collection.size()));
    }

    private static <T> MutablePriorityBlockingQueue<T> __core(final T @Unmodifiable [] collection) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>();
        return new MutablePriorityBlockingQueue<>(_values(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- transform --------------------

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>();
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform));
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final CollectionHolder<? extends T> collection,
                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>();
        return new MutablePriorityBlockingQueue<>(_values(collection, collection.size(), transform));
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final T @Unmodifiable [] collection,
                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>();
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform));
    }


    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                          final Function<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>();
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform));
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final CollectionHolder<? extends T> collection,
                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>();
        return new MutablePriorityBlockingQueue<>(_values(collection, collection.size(), transform));
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final T @Unmodifiable [] collection,
                                                                                          final Function<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>();
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform));
    }


    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                          final Supplier<? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>();
        return new MutablePriorityBlockingQueue<>(_values(size, transform));
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final CollectionHolder<? extends T> collection,
                                                                                          final Supplier<? extends U> transform) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>();
        return new MutablePriorityBlockingQueue<>(_values(collection.size(), transform));
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final T @Unmodifiable [] collection,
                                                                                          final Supplier<? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>();
        return new MutablePriorityBlockingQueue<>(_values(size, transform));
    }

    //#endregion -------------------- transform --------------------
    //#region -------------------- comparator --------------------

    private static <T> MutablePriorityBlockingQueue<T> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                              final Comparator<? super T> comparator) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, size), comparator);
    }

    private static <T> MutablePriorityBlockingQueue<T> __core(final CollectionHolder<? extends T> collection,
                                                              final Comparator<? super T> comparator) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>(comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, collection.size()), comparator);
    }

    private static <T> MutablePriorityBlockingQueue<T> __core(final T @Unmodifiable [] collection,
                                                              final Comparator<? super T> comparator) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, size), comparator);
    }

    //#endregion -------------------- comparator --------------------
    //#region -------------------- comparator, transform --------------------

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform), comparator);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final CollectionHolder<? extends T> collection,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>(comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, collection.size(), transform), comparator);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final T @Unmodifiable [] collection,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform), comparator);
    }


    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final Function<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform), comparator);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final CollectionHolder<? extends T> collection,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>(comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, collection.size(), transform), comparator);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final T @Unmodifiable [] collection,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final Function<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform), comparator);
    }


    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final Supplier<? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(comparator);
        return new MutablePriorityBlockingQueue<>(_values(size, transform), comparator);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final CollectionHolder<? extends T> collection,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final Supplier<? extends U> transform) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>(comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection.size(), transform), comparator);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final T @Unmodifiable [] collection,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final Supplier<? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(comparator);
        return new MutablePriorityBlockingQueue<>(_values(size, transform), comparator);
    }

    //#endregion -------------------- comparator, transform --------------------
    //#region -------------------- initialCapacity --------------------

    private static <T> MutablePriorityBlockingQueue<T> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                              final int initialCapacity) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity);
        return new MutablePriorityBlockingQueue<>(_values(collection, size), initialCapacity);
    }

    private static <T> MutablePriorityBlockingQueue<T> __core(final CollectionHolder<? extends T> collection,
                                                              final int initialCapacity) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>(initialCapacity);
        return new MutablePriorityBlockingQueue<>(_values(collection, collection.size()), initialCapacity);
    }

    private static <T> MutablePriorityBlockingQueue<T> __core(final T @Unmodifiable [] collection,
                                                              final int initialCapacity) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity);
        return new MutablePriorityBlockingQueue<>(_values(collection, size), initialCapacity);
    }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, transform --------------------

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                          final int initialCapacity,
                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity);
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final CollectionHolder<? extends T> collection,
                                                                                          final int initialCapacity,
                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>(initialCapacity);
        return new MutablePriorityBlockingQueue<>(_values(collection, collection.size(), transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final T @Unmodifiable [] collection,
                                                                                          final int initialCapacity,
                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity);
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform), initialCapacity);
    }


    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                          final int initialCapacity,
                                                                                          final Function<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity);
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final CollectionHolder<? extends T> collection,
                                                                                          final int initialCapacity,
                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>(initialCapacity);
        return new MutablePriorityBlockingQueue<>(_values(collection, collection.size(), transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final T @Unmodifiable [] collection,
                                                                                          final int initialCapacity,
                                                                                          final Function<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity);
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform), initialCapacity);
    }


    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                          final int initialCapacity,
                                                                                          final Supplier<? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity);
        return new MutablePriorityBlockingQueue<>(_values(size, transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final CollectionHolder<? extends T> collection,
                                                                                          final int initialCapacity,
                                                                                          final Supplier<? extends U> transform) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>(initialCapacity);
        return new MutablePriorityBlockingQueue<>(_values(collection.size(), transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final T @Unmodifiable [] collection,
                                                                                          final int initialCapacity,
                                                                                          final Supplier<? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity);
        return new MutablePriorityBlockingQueue<>(_values(size, transform), initialCapacity);
    }

    //#endregion -------------------- initialCapacity, transform --------------------
    //#region -------------------- initialCapacity, comparator --------------------

    private static <T> MutablePriorityBlockingQueue<T> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                              final int initialCapacity,
                                                              final Comparator<? super T> comparator) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity, comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, size), initialCapacity, comparator);
    }

    private static <T> MutablePriorityBlockingQueue<T> __core(final CollectionHolder<? extends T> collection,
                                                              final int initialCapacity,
                                                              final Comparator<? super T> comparator) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>(initialCapacity, comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, collection.size()), initialCapacity, comparator);
    }

    private static <T> MutablePriorityBlockingQueue<T> __core(final T @Unmodifiable [] collection,
                                                              final int initialCapacity,
                                                              final Comparator<? super T> comparator) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity, comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, size), initialCapacity, comparator);
    }

    //#endregion -------------------- initialCapacity, comparator --------------------
    //#region -------------------- initialCapacity, comparator, transform --------------------

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                          final int initialCapacity,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity, comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform), initialCapacity, comparator);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final CollectionHolder<? extends T> collection,
                                                                                          final int initialCapacity,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>(initialCapacity, comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, collection.size(), transform), initialCapacity, comparator);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final T @Unmodifiable [] collection,
                                                                                          final int initialCapacity,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity, comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform), initialCapacity, comparator);
    }


    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                          final int initialCapacity,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final Function<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity, comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform), initialCapacity, comparator);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final CollectionHolder<? extends T> collection,
                                                                                          final int initialCapacity,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>(initialCapacity, comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, collection.size(), transform), initialCapacity, comparator);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final T @Unmodifiable [] collection,
                                                                                          final int initialCapacity,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final Function<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity, comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection, size, transform), initialCapacity, comparator);
    }


    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                          final int initialCapacity,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final Supplier<? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity, comparator);
        return new MutablePriorityBlockingQueue<>(_values(size, transform), initialCapacity, comparator);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final CollectionHolder<? extends T> collection,
                                                                                          final int initialCapacity,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final Supplier<? extends U> transform) {
        if (collection.isEmpty())
            return new MutablePriorityBlockingQueue<>(initialCapacity, comparator);
        return new MutablePriorityBlockingQueue<>(_values(collection.size(), transform), initialCapacity, comparator);
    }

    private static <T extends @Nullable Object, U> MutablePriorityBlockingQueue<U> __core(final T @Unmodifiable [] collection,
                                                                                          final int initialCapacity,
                                                                                          final Comparator<? super U> comparator,
                                                                                          final Supplier<? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutablePriorityBlockingQueue<>(initialCapacity, comparator);
        return new MutablePriorityBlockingQueue<>(_values(size, transform), initialCapacity, comparator);
    }

    //#endregion -------------------- initialCapacity, comparator, transform --------------------

    //#endregion -------------------- Core methods --------------------

}
