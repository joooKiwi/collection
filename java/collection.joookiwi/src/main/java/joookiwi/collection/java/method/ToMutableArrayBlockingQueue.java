package joookiwi.collection.java.method;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.ImpossibleQueueCapacity;
import joookiwi.collection.java.extended.MutableArrayBlockingQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_FAIRNESS;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_4;

@NotNullByDefault
public final class ToMutableArrayBlockingQueue
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutableArrayBlockingQueue() { throw new ImpossibleConstructionException("The utility class “ToMutableArrayBlockingQueue” cannot be constructed.", ToMutableArrayBlockingQueue.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// with a capacity as the <code>collection.[size][MinimalistCollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> ArrayBlockingQueue<T> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return __empty();

        final var size = collection.size();
        if (size == 0)
            return __empty();
        return __withNoTransform(collection, size, size, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// with a capacity as the <code>collection.[size][CollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> ArrayBlockingQueue<T> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return __empty();
        if (collection.isEmpty())
            return __empty();

        final var size = collection.size();
        return __withNoTransform(collection, size, size, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// with a capacity as the `collection.length`
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> ArrayBlockingQueue<T> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return __empty();

        final var size = collection.length;
        if (size == 0)
            return __empty();
        return __withNoTransform(collection, size, size, DEFAULT_FAIRNESS);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the <code>collection.[size][MinimalistCollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();

        final var size = collection.size();
        if (size == 0)
            return __empty();
        return __with2Argument(collection, size, transform, size, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the <code>collection.[size][CollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();
        if (collection.isEmpty())
            return __empty();

        final var size = collection.size();
        return __with2Argument(collection, size, transform, size, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the `collection.length`
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();

        final var size = collection.length;
        if (size == 0)
            return __empty();
        return __with2Argument(collection, size, transform, size, DEFAULT_FAIRNESS);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the <code>collection.[size][MinimalistCollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();

        final var size = collection.size();
        if (size == 0)
            return __empty();
        return __with1Argument(collection, size, transform, size, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the <code>collection.[size][CollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();
        if (collection.isEmpty())
            return __empty();

        final var size = collection.size();
        return __with1Argument(collection, size, transform, size, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the `collection.length`
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();

        final var size = collection.length;
        if (size == 0)
            return __empty();
        return __with1Argument(collection, size, transform, size, DEFAULT_FAIRNESS);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the <code>collection.[size][MinimalistCollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty();

        final var size = collection.size();
        if (size == 0)
            return __empty();
        return __with0Argument(size, transform, size, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the <code>collection.[size][CollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty();
        if (collection.isEmpty())
            return __empty();

        final var size = collection.size();
        return __with0Argument(size, transform, size, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the `collection.length`
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty();

        final var size = collection.length;
        if (size == 0)
            return __empty();
        return __with0Argument(size, transform, size, DEFAULT_FAIRNESS);
    }

    //#endregion -------------------- () → U --------------------

    //#region -------------------- capacity --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// with the `capacity` specified and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][MinimalistCollectionHolder] [size][MinimalistCollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ArrayBlockingQueue<T> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                        final int capacity) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity);

        final var size = collection.size();
        if (size == 0)
            return __empty(capacity);
        return __withNoTransform(collection, size, capacity, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// with the `capacity` specified and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][CollectionHolder] [size][CollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ArrayBlockingQueue<T> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                        final int capacity) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity);
        if (collection.isEmpty())
            return __empty(capacity);
        return __withNoTransform(collection, collection.size(), capacity, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// with the `capacity` specified and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the collection size
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ArrayBlockingQueue<T> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                        final int capacity) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity);

        final var size = collection.length;
        if (size == 0)
            return __empty(capacity);
        return __withNoTransform(collection, size, capacity, DEFAULT_FAIRNESS);
    }

    //#endregion -------------------- capacity --------------------
    //#region -------------------- capacity, (T, int) → U --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][MinimalistCollectionHolder] [size][MinimalistCollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final int capacity,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity);

        final var size = collection.size();
        if (size == 0)
            return __empty(capacity);
        return __with2Argument(collection, size, transform, capacity, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][CollectionHolder] [size][CollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final int capacity,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity);
        if (collection.isEmpty())
            return __empty(capacity);
        return __with2Argument(collection, collection.size(), transform, capacity, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] collection
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the collection size
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final int capacity,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity);

        final var size = collection.length;
        if (size == 0)
            return __empty(capacity);
        return __with2Argument(collection, size, transform, capacity, DEFAULT_FAIRNESS);
    }

    //#endregion -------------------- capacity, (T, int) → U --------------------
    //#region -------------------- capacity, (T) → U --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][MinimalistCollectionHolder] [size][MinimalistCollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final int capacity,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity);

        final var size = collection.size();
        if (size == 0)
            return __empty(capacity);
        return __with1Argument(collection, size, transform, capacity, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][CollectionHolder] [size][CollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final int capacity,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity);
        if (collection.isEmpty())
            return __empty(capacity);
        return __with1Argument(collection, collection.size(), transform, capacity, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] collection
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the collection size
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final int capacity,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity);

        final var size = collection.length;
        if (size == 0)
            return __empty(capacity);
        return __with1Argument(collection, size, transform, capacity, DEFAULT_FAIRNESS);
    }

    //#endregion -------------------- capacity, (T) → U --------------------
    //#region -------------------- capacity, () → U --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][MinimalistCollectionHolder] [size][MinimalistCollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final int capacity,
                                                                                                    final Supplier<? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity);

        final var size = collection.size();
        if (size == 0)
            return __empty(capacity);
        return __with0Argument(size, transform, capacity, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][CollectionHolder] [size][CollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final int capacity,
                                                                                                    final Supplier<? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity);
        if (collection.isEmpty())
            return __empty(capacity);
        return __with0Argument(collection.size(), transform, capacity, DEFAULT_FAIRNESS);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] collection
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the collection size
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final int capacity,
                                                                                                    final Supplier<? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity);

        final var size = collection.length;
        if (size == 0)
            return __empty(capacity);
        return __with0Argument(size, transform, capacity, DEFAULT_FAIRNESS);
    }

    //#endregion -------------------- capacity, () → U --------------------

    //#region -------------------- capacity, isFair --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// with the `capacity` and the `fairness` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param <T>        The `collection` type
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][MinimalistCollectionHolder] [size][MinimalistCollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T> ArrayBlockingQueue<T> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                        final int capacity,
                                                                        final boolean isFair) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity, isFair);

        final var size = collection.size();
        if (size == 0)
            return __empty(capacity, isFair);
        return __withNoTransform(collection, size, capacity, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// with the `capacity` and the `fairness` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param <T>        The `collection` type
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][CollectionHolder] [size][CollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T> ArrayBlockingQueue<T> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                        final int capacity,
                                                                        final boolean isFair) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity, isFair);
        if (collection.isEmpty())
            return __empty(capacity, isFair);
        return __withNoTransform(collection, collection.size(), capacity, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// with the `capacity` and the `fairness` specified
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param <T>        The `collection` type
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the collection size
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T> ArrayBlockingQueue<T> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                        final int capacity,
                                                                        final boolean isFair) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity, isFair);

        final var size = collection.length;
        if (size == 0)
            return __empty(capacity, isFair);
        return __withNoTransform(collection, size, capacity, isFair);
    }

    //#endregion -------------------- capacity, isFair --------------------
    //#region -------------------- capacity, isFair, (T, int) → U --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][MinimalistCollectionHolder] [size][MinimalistCollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final int capacity,
                                                                                                    final boolean isFair,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity, isFair);

        final var size = collection.size();
        if (size == 0)
            return __empty(capacity, isFair);
        return __with2Argument(collection, size, transform, capacity, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][CollectionHolder] [size][CollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final int capacity,
                                                                                                    final boolean isFair,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity, isFair);
        if (collection.isEmpty())
            return __empty(capacity, isFair);
        return __with2Argument(collection, collection.size(), transform, capacity, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] collection
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the collection size
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final int capacity,
                                                                                                    final boolean isFair,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity, isFair);

        final var size = collection.length;
        if (size == 0)
            return __empty(capacity, isFair);
        return __with2Argument(collection, size, transform, capacity, isFair);
    }

    //#endregion -------------------- capacity, isFair, (T, int) → U --------------------
    //#region -------------------- capacity, isFair, (T) → U --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][MinimalistCollectionHolder] [size][MinimalistCollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final int capacity,
                                                                                                    final boolean isFair,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity, isFair);

        final var size = collection.size();
        if (size == 0)
            return __empty(capacity, isFair);
        return __with1Argument(collection, size, transform, capacity, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][CollectionHolder] [size][CollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final int capacity,
                                                                                                    final boolean isFair,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity, isFair);
        if (collection.isEmpty())
            return __empty(capacity, isFair);
        return __with1Argument(collection, collection.size(), transform, capacity, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] collection
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the collection size
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final int capacity,
                                                                                                    final boolean isFair,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity, isFair);

        final var size = collection.length;
        if (size == 0)
            return __empty(capacity, isFair);
        return __with1Argument(collection, size, transform, capacity, isFair);
    }

    //#endregion -------------------- capacity, isFair, (T) → U --------------------
    //#region -------------------- capacity, isFair, () → U --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][MinimalistCollectionHolder] [size][MinimalistCollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final int capacity,
                                                                                                    final boolean isFair,
                                                                                                    final Supplier<? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity, isFair);

        final var size = collection.size();
        if (size == 0)
            return __empty(capacity, isFair);
        return __with0Argument(size, transform, capacity, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the [collection][CollectionHolder] [size][CollectionHolder#size]
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final int capacity,
                                                                                                    final boolean isFair,
                                                                                                    final Supplier<? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity, isFair);
        if (collection.isEmpty())
            return __empty(capacity, isFair);
        return __with0Argument(collection.size(), transform, capacity, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with the `capacity` and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] collection
    /// @param capacity   The [queue][ArrayBlockingQueue] capacity
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    /// @throws ImpossibleQueueCapacity The `capacity` was under `1`
    /// @throws ImpossibleQueueCapacity The `capacity` was under the collection size
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final int capacity,
                                                                                                    final boolean isFair,
                                                                                                    final Supplier<? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return __empty(capacity, isFair);

        final var size = collection.length;
        if (size == 0)
            return __empty(capacity, isFair);
        return __with0Argument(size, transform, capacity, isFair);
    }

    //#endregion -------------------- capacity, isFair, () → U --------------------

    //#region -------------------- isFair --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// with a capacity as the <code>collection.[size][MinimalistCollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the `fairness` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ArrayBlockingQueue<T> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                        final boolean isFair) {
        if (collection == null)
            return __empty(isFair);

        final var size = collection.size();
        if (size == 0)
            return __empty(isFair);
        return __withNoTransform(collection, size, size, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// with a capacity as the <code>collection.[size][CollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the `fairness` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ArrayBlockingQueue<T> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                        final boolean isFair) {
        if (collection == null)
            return __empty(isFair);
        if (collection.isEmpty())
            return __empty(isFair);

        final var size = collection.size();
        return __withNoTransform(collection, size, size, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// with a capacity as the `collection.length`
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the `fairness` specified
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ArrayBlockingQueue<T> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                        final boolean isFair) {
        if (collection == null)
            return __empty(isFair);

        final var size = collection.length;
        if (size == 0)
            return __empty(isFair);
        return __withNoTransform(collection, size, size, isFair);
    }

    //#endregion -------------------- isFair --------------------
    //#region -------------------- isFair, (T, int) → U --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the <code>collection.[size][MinimalistCollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final boolean isFair,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(isFair);

        final var size = collection.size();
        if (size == 0)
            return __empty(isFair);
        return __with2Argument(collection, size, transform, size, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the <code>collection.[size][CollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final boolean isFair,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(isFair);
        if (collection.isEmpty())
            return __empty(isFair);

        final var size = collection.size();
        return __with2Argument(collection, size, transform, size, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the `collection.length`
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] collection
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final boolean isFair,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(isFair);

        final var size = collection.length;
        if (size == 0)
            return __empty(isFair);
        return __with2Argument(collection, size, transform, size, isFair);
    }

    //#endregion -------------------- isFair, (T, int) → U --------------------
    //#region -------------------- isFair, (T) → U --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the <code>collection.[size][MinimalistCollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final boolean isFair,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(isFair);

        final var size = collection.size();
        if (size == 0)
            return __empty(isFair);
        return __with1Argument(collection, size, transform, size, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the <code>collection.[size][CollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final boolean isFair,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(isFair);
        if (collection.isEmpty())
            return __empty(isFair);

        final var size = collection.size();
        return __with1Argument(collection, size, transform, size, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the `collection.length`
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] collection
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final boolean isFair,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(isFair);

        final var size = collection.length;
        if (size == 0)
            return __empty(isFair);
        return __with1Argument(collection, size, transform, size, isFair);
    }

    //#endregion -------------------- isFair, (T) → U --------------------
    //#region -------------------- isFair, () → U --------------------

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the <code>collection.[size][MinimalistCollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final boolean isFair,
                                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(isFair);

        final var size = collection.size();
        if (size == 0)
            return __empty(isFair);
        return __with0Argument(size, transform, size, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the <code>collection.[size][CollectionHolder#size]</code>
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final boolean isFair,
                                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(isFair);
        if (collection.isEmpty())
            return __empty(isFair);

        final var size = collection.size();
        return __with0Argument(size, transform, size, isFair);
    }

    /// Convert the `collection` to a mutable [ArrayBlockingQueue]
    /// applying a transformation
    /// with a capacity as the `collection.length`
    /// (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] collection
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayBlockingQueue<U> toMutableArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final boolean isFair,
                                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(isFair);

        final var size = collection.length;
        if (size == 0)
            return __empty(isFair);
        return __with0Argument(size, transform, size, isFair);
    }

    //#endregion -------------------- isFair, () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Creation methods --------------------

    private static <T> ArrayBlockingQueue<T> __empty() {
        return new MutableArrayBlockingQueue<>();
    }

    private static <T> ArrayBlockingQueue<T> __empty(final int capacity) {
        if (capacity < 1)
            return new MutableArrayBlockingQueue<>(1);
        return new MutableArrayBlockingQueue<>(capacity);
    }

    private static <T> ArrayBlockingQueue<T> __empty(final int capacity,
                                                     final boolean isFair) {
        if (capacity < 1)
            return new MutableArrayBlockingQueue<>(1, isFair);
        return new MutableArrayBlockingQueue<>(capacity, isFair);
    }

    private static <T> ArrayBlockingQueue<T> __empty(final boolean isFair) {
        return new MutableArrayBlockingQueue<>(isFair);
    }


    private static <T> ArrayBlockingQueue<T> __withNoTransform(final MinimalistCollectionHolder<? extends T> collection,
                                                               final int size,
                                                               final int capacity,
                                                               final boolean isFair) {
        if (capacity < size)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” since the capacity (" + capacity + ") was under the size (" + size + ")", capacity);
        return new MutableArrayBlockingQueue<>(_values(collection, size), capacity, isFair);
    }

    private static <T> ArrayBlockingQueue<T> __withNoTransform(final T @Unmodifiable [] collection,
                                                               final int size,
                                                               final int capacity,
                                                               final boolean isFair) {
        if (capacity < size)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” since the capacity (" + capacity + ") was under the size (" + size + ")", capacity);
        return new MutableArrayBlockingQueue<>(_values(collection, size), capacity, isFair);
    }


    private static <U> ArrayBlockingQueue<U> __with0Argument(final int size,
                                                             final Supplier<? extends U> transform,
                                                             final int capacity,
                                                             final boolean isFair) {
        if (capacity < size)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” since the capacity (" + capacity + ") was under the size (" + size + ")", capacity);
        return new MutableArrayBlockingQueue<>(_values(size, transform), capacity, isFair);
    }


    private static <T extends @Nullable Object, U> ArrayBlockingQueue<U> __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                         final int size,
                                                                                         final Function<? super T, ? extends U> transform,
                                                                                         final int capacity,
                                                                                         final boolean isFair) {
        if (capacity < size)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” since the capacity (" + capacity + ") was under the size (" + size + ")", capacity);
        return new MutableArrayBlockingQueue<>(_values(collection, size, transform), capacity, isFair);
    }

    private static <T extends @Nullable Object, U> ArrayBlockingQueue<U> __with1Argument(final T @Unmodifiable [] collection,
                                                                                         final int size,
                                                                                         final Function<? super T, ? extends U> transform,
                                                                                         final int capacity,
                                                                                         final boolean isFair) {
        if (capacity < size)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” since the capacity (" + capacity + ") was under the size (" + size + ")", capacity);
        return new MutableArrayBlockingQueue<>(_values(collection, size, transform), capacity, isFair);
    }


    private static <T extends @Nullable Object, U> ArrayBlockingQueue<U> __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                         final int size,
                                                                                         final ObjIntFunction<? super T, ? extends U> transform,
                                                                                         final int capacity,
                                                                                         final boolean isFair) {
        if (capacity < size)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” since the capacity (" + capacity + ") was under the size (" + size + ")", capacity);
        return new MutableArrayBlockingQueue<>(_values(collection, size, transform), capacity, isFair);
    }

    private static <T extends @Nullable Object, U> ArrayBlockingQueue<U> __with2Argument(final T @Unmodifiable [] collection,
                                                                                         final int size,
                                                                                         final ObjIntFunction<? super T, ? extends U> transform,
                                                                                         final int capacity,
                                                                                         final boolean isFair) {
        if (capacity < size)
            throw new ImpossibleQueueCapacity("The collection cannot be converted to an “ArrayBlockingQueue” since the capacity (" + capacity + ") was under the size (" + size + ")", capacity);
        return new MutableArrayBlockingQueue<>(_values(collection, size, transform), capacity, isFair);
    }

    //#endregion -------------------- Creation methods --------------------

}
