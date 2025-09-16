package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableLinkedTransferQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

@NotNullByDefault
public final class ToMutableLinkedTransferQueue
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutableLinkedTransferQueue() { throw new ImpossibleConstructionException("The utility class “ToMutableLinkedTransferQueue” cannot be constructed.", ToMutableLinkedTransferQueue.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [MutableLinkedTransferQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableLinkedTransferQueue<T> toMutableLinkedTransferQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableLinkedTransferQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedTransferQueue<>();
        return new MutableLinkedTransferQueue<>(_values(collection, size));
    }

    /// Convert the `collection` to an [MutableLinkedTransferQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableLinkedTransferQueue<T> toMutableLinkedTransferQueue(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableLinkedTransferQueue<>();
        if (collection.isEmpty())
            return new MutableLinkedTransferQueue<>();
        return new MutableLinkedTransferQueue<>(_values(collection, collection.size()));
    }

    /// Convert the `collection` to an [MutableLinkedTransferQueue]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableLinkedTransferQueue<T> toMutableLinkedTransferQueue(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return new MutableLinkedTransferQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedTransferQueue<>();
        return new MutableLinkedTransferQueue<>(_values(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [MutableLinkedTransferQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                             final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedTransferQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedTransferQueue<>();
        return new MutableLinkedTransferQueue<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to an [MutableLinkedTransferQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                             final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedTransferQueue<>();
        if (collection.isEmpty())
            return new MutableLinkedTransferQueue<>();
        return new MutableLinkedTransferQueue<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [MutableLinkedTransferQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                             final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedTransferQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedTransferQueue<>();
        return new MutableLinkedTransferQueue<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [MutableLinkedTransferQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                             final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedTransferQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedTransferQueue<>();
        return new MutableLinkedTransferQueue<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to an [MutableLinkedTransferQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                             final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedTransferQueue<>();
        if (collection.isEmpty())
            return new MutableLinkedTransferQueue<>();
        return new MutableLinkedTransferQueue<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [MutableLinkedTransferQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                             final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedTransferQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedTransferQueue<>();
        return new MutableLinkedTransferQueue<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [MutableLinkedTransferQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                             final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableLinkedTransferQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedTransferQueue<>();
        return new MutableLinkedTransferQueue<>(_values(size, transform));
    }

    /// Convert the `collection` to an [MutableLinkedTransferQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                             final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableLinkedTransferQueue<>();
        if (collection.isEmpty())
            return new MutableLinkedTransferQueue<>();
        return new MutableLinkedTransferQueue<>(_values(collection.size(), transform));
    }

    /// Convert the `collection` to an [MutableLinkedTransferQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                             final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableLinkedTransferQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedTransferQueue<>();
        return new MutableLinkedTransferQueue<>(_values(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
