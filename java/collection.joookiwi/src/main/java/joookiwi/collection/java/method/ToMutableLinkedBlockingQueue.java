package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleCapacityException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableLinkedBlockingQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;

@NotNullByDefault
public final class ToMutableLinkedBlockingQueue
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutableLinkedBlockingQueue() { throw new ImpossibleConstructionException("The utility class “ToMutableLinkedBlockingQueue” cannot be constructed.", ToMutableLinkedBlockingQueue.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableLinkedBlockingQueue<T> toMutableLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableLinkedBlockingQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedBlockingQueue<>();
        return new MutableLinkedBlockingQueue<>(_values(collection, size));
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableLinkedBlockingQueue<T> toMutableLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableLinkedBlockingQueue<>();
        if (collection.isEmpty())
            return new MutableLinkedBlockingQueue<>();
        return new MutableLinkedBlockingQueue<>(_values(collection, collection.size()));
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableLinkedBlockingQueue<T> toMutableLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return new MutableLinkedBlockingQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedBlockingQueue<>();
        return new MutableLinkedBlockingQueue<>(_values(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                             final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedBlockingQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedBlockingQueue<>();
        return new MutableLinkedBlockingQueue<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                             final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedBlockingQueue<>();
        if (collection.isEmpty())
            return new MutableLinkedBlockingQueue<>();
        return new MutableLinkedBlockingQueue<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                             final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedBlockingQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedBlockingQueue<>();
        return new MutableLinkedBlockingQueue<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                             final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedBlockingQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedBlockingQueue<>();
        return new MutableLinkedBlockingQueue<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                             final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedBlockingQueue<>();
        if (collection.isEmpty())
            return new MutableLinkedBlockingQueue<>();
        return new MutableLinkedBlockingQueue<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                             final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedBlockingQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedBlockingQueue<>();
        return new MutableLinkedBlockingQueue<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                             final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableLinkedBlockingQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedBlockingQueue<>();
        return new MutableLinkedBlockingQueue<>(_values(size, transform));
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                             final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableLinkedBlockingQueue<>();
        if (collection.isEmpty())
            return new MutableLinkedBlockingQueue<>();
        return new MutableLinkedBlockingQueue<>(_values(collection.size(), transform));
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                             final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableLinkedBlockingQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedBlockingQueue<>();
        return new MutableLinkedBlockingQueue<>(_values(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#region -------------------- capacity --------------------

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// with the `capacity` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param capacity   The [queue][java.util.concurrent.LinkedBlockingQueue] capacity
    /// @param <T>        The `collection` type
    /// @throws ImpossibleCapacityException The `capacity` was under `1`
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutableLinkedBlockingQueue<T> toMutableLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                 final int capacity) {
        if (capacity < 1)
            throw new ImpossibleCapacityException("The collection cannot be converted to an “LinkedBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return new MutableLinkedBlockingQueue<>(capacity);

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedBlockingQueue<>(capacity);
        return new MutableLinkedBlockingQueue<>(_values(collection, size), capacity);
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// with the `capacity` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param capacity   The [queue][java.util.concurrent.LinkedBlockingQueue] capacity
    /// @param <T>        The `collection` type
    /// @throws ImpossibleCapacityException The `capacity` was under `1`
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutableLinkedBlockingQueue<T> toMutableLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                 final int capacity) {
        if (capacity < 1)
            throw new ImpossibleCapacityException("The collection cannot be converted to an “LinkedBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return new MutableLinkedBlockingQueue<>(capacity);
        if (collection.isEmpty())
            return new MutableLinkedBlockingQueue<>(capacity);
        return new MutableLinkedBlockingQueue<>(_values(collection, collection.size()), capacity);
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// with the `capacity` specified
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param capacity   The [queue][java.util.concurrent.LinkedBlockingQueue] capacity
    /// @param <T>        The `collection` type
    /// @throws ImpossibleCapacityException The `capacity` was under `1`
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutableLinkedBlockingQueue<T> toMutableLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                 final int capacity) {
        if (capacity < 1)
            throw new ImpossibleCapacityException("The collection cannot be converted to an “LinkedBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return new MutableLinkedBlockingQueue<>(capacity);

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedBlockingQueue<>(capacity);
        return new MutableLinkedBlockingQueue<>(_values(collection, size), capacity);
    }

    //#endregion -------------------- capacity --------------------
    //#region -------------------- capacity, (T, int) → U --------------------

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param capacity   The [queue][java.util.concurrent.LinkedBlockingQueue] capacity
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws ImpossibleCapacityException The `capacity` was under `1`
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                             final int capacity,
                                                                                                             final ObjIntFunction<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleCapacityException("The collection cannot be converted to an “LinkedBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return new MutableLinkedBlockingQueue<>(capacity);

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedBlockingQueue<>(capacity);
        return new MutableLinkedBlockingQueue<>(_values(collection, size, transform), capacity);
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param capacity   The [queue][java.util.concurrent.LinkedBlockingQueue] capacity
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws ImpossibleCapacityException The `capacity` was under `1`
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                             final int capacity,
                                                                                                             final ObjIntFunction<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleCapacityException("The collection cannot be converted to an “LinkedBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return new MutableLinkedBlockingQueue<>(capacity);
        if (collection.isEmpty())
            return new MutableLinkedBlockingQueue<>(capacity);
        return new MutableLinkedBlockingQueue<>(_values(collection, collection.size(), transform), capacity);
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param capacity   The [queue][java.util.concurrent.LinkedBlockingQueue] capacity
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws ImpossibleCapacityException The `capacity` was under `1`
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                             final int capacity,
                                                                                                             final ObjIntFunction<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleCapacityException("The collection cannot be converted to an “LinkedBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return new MutableLinkedBlockingQueue<>(capacity);

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedBlockingQueue<>(capacity);
        return new MutableLinkedBlockingQueue<>(_values(collection, size, transform), capacity);
    }

    //#endregion -------------------- capacity, (T, int) → U --------------------
    //#region -------------------- capacity, (T) → U --------------------

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param capacity   The [queue][java.util.concurrent.LinkedBlockingQueue] capacity
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws ImpossibleCapacityException The `capacity` was under `1`
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                             final int capacity,
                                                                                                             final Function<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleCapacityException("The collection cannot be converted to an “LinkedBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return new MutableLinkedBlockingQueue<>(capacity);

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedBlockingQueue<>(capacity);
        return new MutableLinkedBlockingQueue<>(_values(collection, size, transform), capacity);
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param capacity   The [queue][java.util.concurrent.LinkedBlockingQueue] capacity
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws ImpossibleCapacityException The `capacity` was under `1`
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                             final int capacity,
                                                                                                             final Function<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleCapacityException("The collection cannot be converted to an “LinkedBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return new MutableLinkedBlockingQueue<>(capacity);
        if (collection.isEmpty())
            return new MutableLinkedBlockingQueue<>(capacity);
        return new MutableLinkedBlockingQueue<>(_values(collection, collection.size(), transform), capacity);
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param capacity   The [queue][java.util.concurrent.LinkedBlockingQueue] capacity
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws ImpossibleCapacityException The `capacity` was under `1`
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                             final int capacity,
                                                                                                             final Function<? super T, ? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleCapacityException("The collection cannot be converted to an “LinkedBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return new MutableLinkedBlockingQueue<>(capacity);

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedBlockingQueue<>(capacity);
        return new MutableLinkedBlockingQueue<>(_values(collection, size, transform), capacity);
    }

    //#endregion -------------------- capacity, (T) → U --------------------
    //#region -------------------- capacity, () → U --------------------

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param capacity   The [queue][java.util.concurrent.LinkedBlockingQueue] capacity
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws ImpossibleCapacityException The `capacity` was under `1`
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                             final int capacity,
                                                                                                             final Supplier<? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleCapacityException("The collection cannot be converted to an “LinkedBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return new MutableLinkedBlockingQueue<>(capacity);

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedBlockingQueue<>(capacity);
        return new MutableLinkedBlockingQueue<>(_values(size, transform), capacity);
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param capacity   The [queue][java.util.concurrent.LinkedBlockingQueue] capacity
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws ImpossibleCapacityException The `capacity` was under `1`
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                             final int capacity,
                                                                                                             final Supplier<? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleCapacityException("The collection cannot be converted to an “LinkedBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return new MutableLinkedBlockingQueue<>(capacity);
        if (collection.isEmpty())
            return new MutableLinkedBlockingQueue<>(capacity);
        return new MutableLinkedBlockingQueue<>(_values(collection.size(), transform), capacity);
    }

    /// Convert the `collection` to a [MutableLinkedBlockingQueue]
    /// applying a transformation
    /// with the `capacity` specified
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param capacity   The [queue][java.util.concurrent.LinkedBlockingQueue] capacity
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws ImpossibleCapacityException The `capacity` was under `1`
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                             final int capacity,
                                                                                                             final Supplier<? extends U> transform) {
        if (capacity < 1)
            throw new ImpossibleCapacityException("The collection cannot be converted to an “LinkedBlockingQueue” with a capacity under 1 (" + capacity + ")", capacity);
        if (collection == null)
            return new MutableLinkedBlockingQueue<>(capacity);

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedBlockingQueue<>(capacity);
        return new MutableLinkedBlockingQueue<>(_values(size, transform), capacity);
    }

    //#endregion -------------------- capacity, () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
