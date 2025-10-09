package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsImmutableQueue;
import joookiwi.collection.java.extended.EmptyQueue;
import joookiwi.collection.java.extended.ImmutableQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToQueue
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToQueue() { throw new ImpossibleConstructionException("The utility class “ToQueue” cannot be constructed.", ToQueue.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [ImmutableQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableQueue<T> toQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyQueue.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyQueue.getInstance();
        return new ArrayAsImmutableQueue<>(_values(collection, size));
    }

    /// Convert the `collection` to an [ImmutableQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableQueue<T> toQueue(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyQueue.getInstance();
        if (collection.isEmpty())
            return EmptyQueue.getInstance();
        return new ArrayAsImmutableQueue<>(_values(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableQueue]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableQueue<T> toQueue(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return EmptyQueue.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyQueue.getInstance();
        return new ArrayAsImmutableQueue<>(_values(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutableQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableQueue<U> toQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyQueue.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyQueue.getInstance();
        return new ArrayAsImmutableQueue<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableQueue<U> toQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyQueue.getInstance();
        if (collection.isEmpty())
            return EmptyQueue.getInstance();
        return new ArrayAsImmutableQueue<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableQueue<U> toQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyQueue.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyQueue.getInstance();
        return new ArrayAsImmutableQueue<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [ImmutableQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableQueue<U> toQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                     final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyQueue.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyQueue.getInstance();
        return new ArrayAsImmutableQueue<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableQueue<U> toQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                     final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyQueue.getInstance();
        if (collection.isEmpty())
            return EmptyQueue.getInstance();
        return new ArrayAsImmutableQueue<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableQueue<U> toQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                     final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyQueue.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyQueue.getInstance();
        return new ArrayAsImmutableQueue<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [ImmutableQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableQueue<U> toQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                     final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptyQueue.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyQueue.getInstance();
        return new ArrayAsImmutableQueue<>(_values(size, transform));
    }

    /// Convert the `collection` to an [ImmutableQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableQueue<U> toQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                     final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptyQueue.getInstance();
        if (collection.isEmpty())
            return EmptyQueue.getInstance();
        return new ArrayAsImmutableQueue<>(_values(collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableQueue<U> toQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                     final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptyQueue.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyQueue.getInstance();
        return new ArrayAsImmutableQueue<>(_values(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
