package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.EmptyLinkedBlockingQueue;
import joookiwi.collection.java.extended.ImmutableLinkedBlockingQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToLinkedBlockingQueue
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToLinkedBlockingQueue() { throw new ImpossibleConstructionException("The utility class “ToLinkedBlockingQueue” cannot be constructed.", ToLinkedBlockingQueue.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [ImmutableLinkedBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> ImmutableLinkedBlockingQueue<T> toLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyLinkedBlockingQueue.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyLinkedBlockingQueue.getInstance();
        return new ImmutableLinkedBlockingQueue<>(_values(collection, size));
    }

    /// Convert the `collection` to an [ImmutableLinkedBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> ImmutableLinkedBlockingQueue<T> toLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyLinkedBlockingQueue.getInstance();
        if (collection.isEmpty())
            return EmptyLinkedBlockingQueue.getInstance();
        return new ImmutableLinkedBlockingQueue<>(_values(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableLinkedBlockingQueue]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> ImmutableLinkedBlockingQueue<T> toLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return EmptyLinkedBlockingQueue.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyLinkedBlockingQueue.getInstance();
        return new ImmutableLinkedBlockingQueue<>(_values(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                        final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyLinkedBlockingQueue.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyLinkedBlockingQueue.getInstance();
        return new ImmutableLinkedBlockingQueue<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                        final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyLinkedBlockingQueue.getInstance();
        if (collection.isEmpty())
            return EmptyLinkedBlockingQueue.getInstance();
        return new ImmutableLinkedBlockingQueue<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                        final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyLinkedBlockingQueue.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyLinkedBlockingQueue.getInstance();
        return new ImmutableLinkedBlockingQueue<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [ImmutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                        final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyLinkedBlockingQueue.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyLinkedBlockingQueue.getInstance();
        return new ImmutableLinkedBlockingQueue<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                        final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyLinkedBlockingQueue.getInstance();
        if (collection.isEmpty())
            return EmptyLinkedBlockingQueue.getInstance();
        return new ImmutableLinkedBlockingQueue<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                        final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyLinkedBlockingQueue.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyLinkedBlockingQueue.getInstance();
        return new ImmutableLinkedBlockingQueue<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [ImmutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                        final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptyLinkedBlockingQueue.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyLinkedBlockingQueue.getInstance();
        return new ImmutableLinkedBlockingQueue<>(_values(size, transform));
    }

    /// Convert the `collection` to an [ImmutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                        final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptyLinkedBlockingQueue.getInstance();
        if (collection.isEmpty())
            return EmptyLinkedBlockingQueue.getInstance();
        return new ImmutableLinkedBlockingQueue<>(_values(collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableLinkedBlockingQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                        final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptyLinkedBlockingQueue.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyLinkedBlockingQueue.getInstance();
        return new ImmutableLinkedBlockingQueue<>(_values(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
