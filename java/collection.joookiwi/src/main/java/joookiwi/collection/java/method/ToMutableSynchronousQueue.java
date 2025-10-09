package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableSynchronousQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;

@NotNullByDefault
public final class ToMutableSynchronousQueue
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutableSynchronousQueue() { throw new ImpossibleConstructionException("The utility class “ToMutableSynchronousQueue” cannot be constructed.", ToMutableSynchronousQueue.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// with [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableSynchronousQueue<T> toMutableSynchronousQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableSynchronousQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableSynchronousQueue<>();
        return new MutableSynchronousQueue<>(_values(collection, size));
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// with [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableSynchronousQueue<T> toMutableSynchronousQueue(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableSynchronousQueue<>();
        if (collection.isEmpty())
            return new MutableSynchronousQueue<>();
        return new MutableSynchronousQueue<>(_values(collection, collection.size()));
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// with [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableSynchronousQueue<T> toMutableSynchronousQueue(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return new MutableSynchronousQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableSynchronousQueue<>();
        return new MutableSynchronousQueue<>(_values(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableSynchronousQueue<>();
        return new MutableSynchronousQueue<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>();
        if (collection.isEmpty())
            return new MutableSynchronousQueue<>();
        return new MutableSynchronousQueue<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableSynchronousQueue<>();
        return new MutableSynchronousQueue<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableSynchronousQueue<>();
        return new MutableSynchronousQueue<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>();
        if (collection.isEmpty())
            return new MutableSynchronousQueue<>();
        return new MutableSynchronousQueue<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableSynchronousQueue<>();
        return new MutableSynchronousQueue<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableSynchronousQueue<>();
        return new MutableSynchronousQueue<>(_values(size, transform));
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>();
        if (collection.isEmpty())
            return new MutableSynchronousQueue<>();
        return new MutableSynchronousQueue<>(_values(collection.size(), transform));
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableSynchronousQueue<>();
        return new MutableSynchronousQueue<>(_values(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#region -------------------- isFair --------------------

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// with the `fairness` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutableSynchronousQueue<T> toMutableSynchronousQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                           final boolean isFair) {
        if (collection == null)
            return new MutableSynchronousQueue<>(isFair);

        final var size = collection.size();
        if (size == 0)
            return new MutableSynchronousQueue<>(isFair);
        return new MutableSynchronousQueue<>(_values(collection, size), isFair);
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// with the `fairness` specified
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutableSynchronousQueue<T> toMutableSynchronousQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                           final boolean isFair) {
        if (collection == null)
            return new MutableSynchronousQueue<>(isFair);
        if (collection.isEmpty())
            return new MutableSynchronousQueue<>(isFair);
        return new MutableSynchronousQueue<>(_values(collection, collection.size()), isFair);
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// with the `fairness` specified
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> MutableSynchronousQueue<T> toMutableSynchronousQueue(final T @Nullable @Unmodifiable [] collection,
                                                                           final boolean isFair) {
        if (collection == null)
            return new MutableSynchronousQueue<>(isFair);

        final var size = collection.length;
        if (size == 0)
            return new MutableSynchronousQueue<>(isFair);
        return new MutableSynchronousQueue<>(_values(collection, size), isFair);
    }

    //#endregion -------------------- isFair --------------------
    //#region -------------------- isFair, (T, int) → U --------------------

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final boolean isFair,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>(isFair);

        final var size = collection.size();
        if (size == 0)
            return new MutableSynchronousQueue<>(isFair);
        return new MutableSynchronousQueue<>(_values(collection, size, transform), isFair);
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final boolean isFair,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>(isFair);
        if (collection.isEmpty())
            return new MutableSynchronousQueue<>(isFair);
        return new MutableSynchronousQueue<>(_values(collection, collection.size(), transform), isFair);
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] collection
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final boolean isFair,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>(isFair);

        final var size = collection.length;
        if (size == 0)
            return new MutableSynchronousQueue<>(isFair);
        return new MutableSynchronousQueue<>(_values(collection, size, transform), isFair);
    }

    //#endregion -------------------- isFair, (T, int) → U --------------------
    //#region -------------------- isFair, (T) → U --------------------

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final boolean isFair,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>(isFair);

        final var size = collection.size();
        if (size == 0)
            return new MutableSynchronousQueue<>(isFair);
        return new MutableSynchronousQueue<>(_values(collection, size, transform), isFair);
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final boolean isFair,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>(isFair);
        if (collection.isEmpty())
            return new MutableSynchronousQueue<>(isFair);
        return new MutableSynchronousQueue<>(_values(collection, collection.size(), transform), isFair);
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] collection
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final boolean isFair,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>(isFair);

        final var size = collection.length;
        if (size == 0)
            return new MutableSynchronousQueue<>(isFair);
        return new MutableSynchronousQueue<>(_values(collection, size, transform), isFair);
    }

    //#endregion -------------------- isFair, (T) → U --------------------
    //#region -------------------- isFair, () → U --------------------

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final boolean isFair,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>(isFair);

        final var size = collection.size();
        if (size == 0)
            return new MutableSynchronousQueue<>(isFair);
        return new MutableSynchronousQueue<>(_values(size, transform), isFair);
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final boolean isFair,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>(isFair);
        if (collection.isEmpty())
            return new MutableSynchronousQueue<>(isFair);
        return new MutableSynchronousQueue<>(_values(collection.size(), transform), isFair);
    }

    /// Convert the `collection` to a new [MutableSynchronousQueue]
    /// applying a transformation
    /// with the `fairness` specified
    ///
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @param collection The [nullable][Nullable] collection
    /// @param isFair     The fairness to block threads on insert/remove (if `true`) or unspecified (if `false`)
    /// @param transform  The given transform
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final boolean isFair,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableSynchronousQueue<>(isFair);

        final var size = collection.length;
        if (size == 0)
            return new MutableSynchronousQueue<>(isFair);
        return new MutableSynchronousQueue<>(_values(size, transform), isFair);
    }

    //#endregion -------------------- isFair, () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
