package joookiwi.collection.java.method;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ImmutableArrayBlockingQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyArrayBlockingQueue;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToArrayBlockingQueue
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToArrayBlockingQueue() { throw new ImpossibleConstructionException("The utility class “ToArrayBlockingQueue” cannot be constructed.", ToArrayBlockingQueue.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [ArrayBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @Unmodifiable ArrayBlockingQueue<T> toArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyArrayBlockingQueue();

        var size = collection.size();
        if (size == 0)
            return emptyArrayBlockingQueue();
        return __withNoTransform(collection, size);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [ArrayBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @Unmodifiable ArrayBlockingQueue<T> toArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyArrayBlockingQueue();
        if (collection.isEmpty())
            return emptyArrayBlockingQueue();
        return __withNoTransform(collection, collection.size());
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [ArrayBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @Unmodifiable ArrayBlockingQueue<T> toArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyArrayBlockingQueue();

        var size = collection.length;
        if (size == 0)
            return emptyArrayBlockingQueue();
        return __withNoTransform(collection, size);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [ArrayBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ArrayBlockingQueue<U> toArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                           final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyArrayBlockingQueue();

        var size = collection.size();
        if (size == 0)
            return emptyArrayBlockingQueue();
        return __with2Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [ArrayBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ArrayBlockingQueue<U> toArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                           final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyArrayBlockingQueue();
        if (collection.isEmpty())
            return emptyArrayBlockingQueue();
        return __with2Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [ArrayBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ArrayBlockingQueue<U> toArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                           final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyArrayBlockingQueue();

        var size = collection.length;
        if (size == 0)
            return emptyArrayBlockingQueue();
        return __with2Argument(collection, size, transform);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [ArrayBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ArrayBlockingQueue<U> toArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                           final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyArrayBlockingQueue();

        var size = collection.size();
        if (size == 0)
            return emptyArrayBlockingQueue();
        return __with1Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [ArrayBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ArrayBlockingQueue<U> toArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                           final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyArrayBlockingQueue();
        if (collection.isEmpty())
            return emptyArrayBlockingQueue();
        return __with1Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [ArrayBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ArrayBlockingQueue<U> toArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                           final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyArrayBlockingQueue();

        var size = collection.length;
        if (size == 0)
            return emptyArrayBlockingQueue();
        return __with1Argument(collection, size, transform);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [ArrayBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ArrayBlockingQueue<U> toArrayBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                           final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyArrayBlockingQueue();

        var size = collection.size();
        if (size == 0)
            return emptyArrayBlockingQueue();
        return __with0Argument(size, transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [ArrayBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ArrayBlockingQueue<U> toArrayBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                           final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyArrayBlockingQueue();
        if (collection.isEmpty())
            return emptyArrayBlockingQueue();
        return __with0Argument(collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [ArrayBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ArrayBlockingQueue<U> toArrayBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                           final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyArrayBlockingQueue();

        var size = collection.length;
        if (size == 0)
            return emptyArrayBlockingQueue();
        return __with0Argument(size, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @Unmodifiable ArrayBlockingQueue<T> __withNoTransform(final MinimalistCollectionHolder<? extends T> collection,
                                                                             final int size) {
        return new ImmutableArrayBlockingQueue<>(_values(collection, size));
    }

    private static <T> @Unmodifiable ArrayBlockingQueue<T> __withNoTransform(final T @Unmodifiable [] collection,
                                                                             final int size) {
        return new ImmutableArrayBlockingQueue<>(_values(collection, size));
    }


    private static <U> @Unmodifiable ArrayBlockingQueue<U> __with0Argument(final int size,
                                                                           final Supplier<? extends U> transform) {
        return new ImmutableArrayBlockingQueue<>(_values(size, transform));
    }


    private static <T extends @Nullable Object, U> @Unmodifiable ArrayBlockingQueue<U> __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final int size,
                                                                                                       final Function<? super T, ? extends U> transform) {
        return new ImmutableArrayBlockingQueue<>(_values(collection, size, transform));
    }

    private static <T extends @Nullable Object, U> @Unmodifiable ArrayBlockingQueue<U> __with1Argument(final T @Unmodifiable [] collection,
                                                                                                       final int size,
                                                                                                       final Function<? super T, ? extends U> transform) {
        return new ImmutableArrayBlockingQueue<>(_values(collection, size, transform));
    }


    private static <T extends @Nullable Object, U> @Unmodifiable ArrayBlockingQueue<U> __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final int size,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        return new ImmutableArrayBlockingQueue<>(_values(collection, size, transform));
    }

    private static <T extends @Nullable Object, U> @Unmodifiable ArrayBlockingQueue<U> __with2Argument(final T @Unmodifiable [] collection,
                                                                                                       final int size,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        return new ImmutableArrayBlockingQueue<>(_values(collection, size, transform));
    }

    //#endregion -------------------- Loop methods --------------------

}
