package joookiwi.collection.java.method;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableDelayQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

@NotNullByDefault
public final class ToMutableDelayQueue
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutableDelayQueue() { throw new ImpossibleConstructionException("The utility class “ToMutableDelayQueue” cannot be constructed.", ToMutableDelayQueue.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a mutable [DelayQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends Delayed> DelayQueue<T> toMutableDelayQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableDelayQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableDelayQueue<>();
        return __withNoTransform(collection, size);
    }

    /// Convert the `collection` to a mutable [DelayQueue]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends Delayed> DelayQueue<T> toMutableDelayQueue(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableDelayQueue<>();
        if (collection.isEmpty())
            return new MutableDelayQueue<>();
        return __withNoTransform(collection, collection.size());
    }

    /// Convert the `collection` to a mutable [DelayQueue]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends Delayed> DelayQueue<T> toMutableDelayQueue(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return new MutableDelayQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableDelayQueue<>();
        return __withNoTransform(collection, size);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a mutable [DelayQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Delayed> DelayQueue<U> toMutableDelayQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableDelayQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableDelayQueue<>();
        return __with2Argument(collection, size, transform);
    }

    /// Convert the `collection` to a mutable [DelayQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Delayed> DelayQueue<U> toMutableDelayQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableDelayQueue<>();
        if (collection.isEmpty())
            return new MutableDelayQueue<>();
        return __with2Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to a mutable [DelayQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Delayed> DelayQueue<U> toMutableDelayQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableDelayQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableDelayQueue<>();
        return __with2Argument(collection, size, transform);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to a mutable [DelayQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Delayed> DelayQueue<U> toMutableDelayQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableDelayQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableDelayQueue<>();
        return __with1Argument(collection, size, transform);
    }

    /// Convert the `collection` to a mutable [DelayQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Delayed> DelayQueue<U> toMutableDelayQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableDelayQueue<>();
        if (collection.isEmpty())
            return new MutableDelayQueue<>();
        return __with1Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to a mutable [DelayQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Delayed> DelayQueue<U> toMutableDelayQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableDelayQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableDelayQueue<>();
        return __with1Argument(collection, size, transform);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a mutable [DelayQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Delayed> DelayQueue<U> toMutableDelayQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableDelayQueue<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableDelayQueue<>();
        return __with0Argument(size, transform);
    }

    /// Convert the `collection` to a mutable [DelayQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Delayed> DelayQueue<U> toMutableDelayQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableDelayQueue<>();
        if (collection.isEmpty())
            return new MutableDelayQueue<>();
        return __with0Argument(collection.size(), transform);
    }

    /// Convert the `collection` to a mutable [DelayQueue]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends Delayed> DelayQueue<U> toMutableDelayQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableDelayQueue<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableDelayQueue<>();
        return __with0Argument(size, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends Delayed> @Unmodifiable DelayQueue<T> __withNoTransform(final MinimalistCollectionHolder<? extends T> collection,
                                                                                     final int size) {
        return new MutableDelayQueue<>(_values(collection, size));
    }

    private static <T extends Delayed> @Unmodifiable DelayQueue<T> __withNoTransform(final T @Unmodifiable [] collection,
                                                                                     final int size) {
        return new MutableDelayQueue<>(_values(collection, size));
    }


    private static <U extends Delayed> @Unmodifiable DelayQueue<U> __with0Argument(final int size,
                                                                                   final Supplier<? extends U> transform) {
        return new MutableDelayQueue<>(_values(size, transform));
    }


    private static <T extends @Nullable Object, U extends Delayed> @Unmodifiable DelayQueue<U> __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                               final int size,
                                                                                                               final Function<? super T, ? extends U> transform) {
        return new MutableDelayQueue<>(_values(collection, size, transform));
    }

    private static <T extends @Nullable Object, U extends Delayed> @Unmodifiable DelayQueue<U> __with1Argument(final T @Unmodifiable [] collection,
                                                                                                               final int size,
                                                                                                               final Function<? super T, ? extends U> transform) {
        return new MutableDelayQueue<>(_values(collection, size, transform));
    }


    private static <T extends @Nullable Object, U extends Delayed> @Unmodifiable DelayQueue<U> __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                               final int size,
                                                                                                               final ObjIntFunction<? super T, ? extends U> transform) {
        return new MutableDelayQueue<>(_values(collection, size, transform));
    }

    private static <T extends @Nullable Object, U extends Delayed> @Unmodifiable DelayQueue<U> __with2Argument(final T @Unmodifiable [] collection,
                                                                                                               final int size,
                                                                                                               final ObjIntFunction<? super T, ? extends U> transform) {
        return new MutableDelayQueue<>(_values(collection, size, transform));
    }

    //#endregion -------------------- Loop methods --------------------

}
