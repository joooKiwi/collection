package joookiwi.collection.java.method;

import java.util.ArrayDeque;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableArrayDeque;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;

@NotNullByDefault
public final class ToMutableArrayDeque
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutableArrayDeque() { throw new ImpossibleConstructionException("The utility class “ToMutableArrayDeque” cannot be constructed.", ToMutableArrayDeque.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a mutable [ArrayDeque]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> ArrayDeque<T> toMutableArrayDeque(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return __empty();

        final var size = collection.size();
        if (size == 0)
            return __empty();
        return __withNoTransform(collection, size, size);
    }

    /// Convert the `collection` to a mutable [ArrayDeque]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> ArrayDeque<T> toMutableArrayDeque(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return __empty();
        if (collection.isEmpty())
            return __empty();

        final var size = collection.size();
        return __withNoTransform(collection, size, size);
    }

    /// Convert the `collection` to a mutable [ArrayDeque]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> ArrayDeque<T> toMutableArrayDeque(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return __empty();

        final var size = collection.length;
        if (size == 0)
            return __empty();
        return __withNoTransform(collection, size, size);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a mutable [ArrayDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();

        final var size = collection.size();
        if (size == 0)
            return __empty();
        return __with2Argument(collection, size, transform, size);
    }

    /// Convert the `collection` to a mutable [ArrayDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final @Nullable CollectionHolder<? extends T> collection,
                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();
        if (collection.isEmpty())
            return __empty();

        final var size = collection.size();
        return __with2Argument(collection, size, transform, size);
    }

    /// Convert the `collection` to a mutable [ArrayDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final T @Nullable @Unmodifiable [] collection,
                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();

        final var size = collection.length;
        if (size == 0)
            return __empty();
        return __with2Argument(collection, size, transform, size);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to a mutable [ArrayDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();

        final var size = collection.size();
        if (size == 0)
            return __empty();
        return __with1Argument(collection, size, transform, size);
    }

    /// Convert the `collection` to a mutable [ArrayDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final @Nullable CollectionHolder<? extends T> collection,
                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();
        if (collection.isEmpty())
            return __empty();

        final var size = collection.size();
        return __with1Argument(collection, size, transform, size);
    }

    /// Convert the `collection` to a mutable [ArrayDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final T @Nullable @Unmodifiable [] collection,
                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty();

        final var size = collection.length;
        if (size == 0)
            return __empty();
        return __with1Argument(collection, size, transform, size);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a mutable [ArrayDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty();

        final var size = collection.size();
        if (size == 0)
            return __empty();
        return __with0Argument(size, transform, size);
    }

    /// Convert the `collection` to a mutable [ArrayDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final @Nullable CollectionHolder<? extends T> collection,
                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty();
        if (collection.isEmpty())
            return __empty();

        final var size = collection.size();
        return __with0Argument(size, transform, size);
    }

    /// Convert the `collection` to a mutable [ArrayDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final T @Nullable @Unmodifiable [] collection,
                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty();

        final var size = collection.length;
        if (size == 0)
            return __empty();
        return __with0Argument(size, transform, size);
    }

    //#endregion -------------------- () → U --------------------

    //#region -------------------- initialCapacity --------------------

    /// Convert the `collection` to a new mutable [ArrayDeque]
    /// with an initial capacity
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param initialCapacity The [ArrayDeque] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ArrayDeque<T> toMutableArrayDeque(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                        final int initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);

        final var size = collection.size();
        if (size == 0)
            return __empty(initialCapacity);
        return __withNoTransform(collection, size, initialCapacity);
    }

    /// Convert the `collection` to a new mutable [ArrayDeque]
    /// with an initial capacity
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder]
    /// @param initialCapacity The [ArrayDeque] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ArrayDeque<T> toMutableArrayDeque(final @Nullable CollectionHolder<? extends T> collection,
                                                        final int initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);
        if (collection.isEmpty())
            return __empty(initialCapacity);
        return __withNoTransform(collection, collection.size(), initialCapacity);
    }

    /// Convert the `collection` to a new mutable [ArrayDeque]
    /// with an initial capacity
    ///
    /// @param collection      The [nullable][Nullable] collection
    /// @param initialCapacity The [ArrayDeque] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ArrayDeque<T> toMutableArrayDeque(final T @Nullable @Unmodifiable [] collection,
                                                        final int initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);

        final var size = collection.length;
        if (size == 0)
            return __empty(initialCapacity);
        return __withNoTransform(collection, size, initialCapacity);
    }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, (T, int) → U --------------------

    /// Convert the `collection` to a new mutable [ArrayDeque]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param initialCapacity The [ArrayDeque] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                    final int initialCapacity,
                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);

        final var size = collection.size();
        if (size == 0)
            return __empty(initialCapacity);
        return __with2Argument(collection, size, transform, initialCapacity);
    }

    /// Convert the `collection` to a new mutable [ArrayDeque]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder]
    /// @param initialCapacity The [ArrayDeque] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final @Nullable CollectionHolder<? extends T> collection,
                                                                                    final int initialCapacity,
                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (collection.isEmpty())
            return __empty(initialCapacity);
        return __with2Argument(collection, collection.size(), transform, initialCapacity);
    }

    /// Convert the `collection` to a new mutable [ArrayDeque]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection
    /// @param initialCapacity The [ArrayDeque] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final T @Nullable @Unmodifiable [] collection,
                                                                                    final int initialCapacity,
                                                                                    final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);

        final var size = collection.length;
        if (size == 0)
            return __empty(initialCapacity);
        return __with2Argument(collection, size, transform, initialCapacity);
    }

    //#endregion -------------------- initialCapacity, (T, int) → U --------------------
    //#region -------------------- initialCapacity, (T) → U --------------------

    /// Convert the `collection` to a new mutable [ArrayDeque]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param initialCapacity The [ArrayDeque] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                    final int initialCapacity,
                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);

        final var size = collection.size();
        if (size == 0)
            return __empty(initialCapacity);
        return __with1Argument(collection, size, transform, initialCapacity);
    }

    /// Convert the `collection` to a new mutable [ArrayDeque]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder]
    /// @param initialCapacity The [ArrayDeque] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final @Nullable CollectionHolder<? extends T> collection,
                                                                                    final int initialCapacity,
                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (collection.isEmpty())
            return __empty(initialCapacity);
        return __with1Argument(collection, collection.size(), transform, initialCapacity);
    }

    /// Convert the `collection` to a new mutable [ArrayDeque]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection
    /// @param initialCapacity The [ArrayDeque] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final T @Nullable @Unmodifiable [] collection,
                                                                                    final int initialCapacity,
                                                                                    final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);

        final var size = collection.length;
        if (size == 0)
            return __empty(initialCapacity);
        return __with1Argument(collection, size, transform, initialCapacity);
    }

    //#endregion -------------------- initialCapacity, (T) → U --------------------
    //#region -------------------- initialCapacity, () → U --------------------

    /// Convert the `collection` to a new mutable [ArrayDeque]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param initialCapacity The [ArrayDeque] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                    final int initialCapacity,
                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);

        final var size = collection.size();
        if (size == 0)
            return __empty(initialCapacity);
        return __with0Argument(size, transform, initialCapacity);
    }

    /// Convert the `collection` to a new mutable [ArrayDeque]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder]
    /// @param initialCapacity The [ArrayDeque] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final @Nullable CollectionHolder<? extends T> collection,
                                                                                    final int initialCapacity,
                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (collection.isEmpty())
            return __empty(initialCapacity);
        return __with0Argument(collection.size(), transform, initialCapacity);
    }

    /// Convert the `collection` to a new mutable [ArrayDeque]
    /// with an initial capacity
    /// and applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection
    /// @param initialCapacity The [ArrayDeque] initial capacity (or the <code>collection.[size][MinimalistCollectionHolder#size]</code> if under the size)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U> ArrayDeque<U> toMutableArrayDeque(final T @Nullable @Unmodifiable [] collection,
                                                                                    final int initialCapacity,
                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);

        final var size = collection.length;
        if (size == 0)
            return __empty(initialCapacity);
        return __with0Argument(size, transform, initialCapacity);
    }

    //#endregion -------------------- initialCapacity, () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> ArrayDeque<T> __empty() {
        return new MutableArrayDeque<>();
    }

    private static <T> ArrayDeque<T> __empty(final int initialCapacity) {
        if (initialCapacity < 0)
            return new MutableArrayDeque<>(0);
        return new MutableArrayDeque<>(initialCapacity);
    }


    private static <T> ArrayDeque<T> __withNoTransform(final MinimalistCollectionHolder<? extends T> collection,
                                                       final int size,
                                                       final int initialCapacity) {
        if (initialCapacity < size)
            return new MutableArrayDeque<>(_values(collection, size));
        return new MutableArrayDeque<>(_values(collection, size), initialCapacity);
    }

    private static <T> ArrayDeque<T> __withNoTransform(final T @Unmodifiable [] collection,
                                                       final int size,
                                                       final int initialCapacity) {
        if (initialCapacity < size)
            return new MutableArrayDeque<>(_values(collection, size));
        return new MutableArrayDeque<>(_values(collection, size), initialCapacity);
    }


    private static <U> ArrayDeque<U> __with0Argument(final int size,
                                                     final Supplier<? extends U> transform,
                                                     final int initialCapacity) {
        if (initialCapacity < size)
            return new MutableArrayDeque<>(_values(size, transform));
        return new MutableArrayDeque<>(_values(size, transform), initialCapacity);
    }


    private static <T extends @Nullable Object, U> ArrayDeque<U> __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                 final int size,
                                                                                 final Function<? super T, ? extends U> transform,
                                                                                 final int initialCapacity) {
        if (initialCapacity < size)
            return new MutableArrayDeque<>(_values(collection, size, transform));
        return new MutableArrayDeque<>(_values(collection, size, transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U> ArrayDeque<U> __with1Argument(final T @Unmodifiable [] collection,
                                                                                 final int size,
                                                                                 final Function<? super T, ? extends U> transform,
                                                                                 final int initialCapacity) {
        if (initialCapacity < size)
            return new MutableArrayDeque<>(_values(collection, size, transform));
        return new MutableArrayDeque<>(_values(collection, size, transform), initialCapacity);
    }


    private static <T extends @Nullable Object, U> ArrayDeque<U> __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                 final int size,
                                                                                 final ObjIntFunction<? super T, ? extends U> transform,
                                                                                 final int initialCapacity) {
        if (initialCapacity < size)
            return new MutableArrayDeque<>(_values(collection, size, transform));
        return new MutableArrayDeque<>(_values(collection, size, transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U> ArrayDeque<U> __with2Argument(final T @Unmodifiable [] collection,
                                                                                 final int size,
                                                                                 final ObjIntFunction<? super T, ? extends U> transform,
                                                                                 final int initialCapacity) {
        if (initialCapacity < size)
            return new MutableArrayDeque<>(_values(collection, size, transform));
        return new MutableArrayDeque<>(_values(collection, size, transform), initialCapacity);
    }

    //#endregion -------------------- Loop methods --------------------

}
