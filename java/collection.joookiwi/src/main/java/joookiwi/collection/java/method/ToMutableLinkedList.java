package joookiwi.collection.java.method;

import java.util.LinkedList;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableLinkedList;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

public final class ToMutableLinkedList
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutableLinkedList() { throw new ImpossibleConstructionException("The utility class “ToMutableLinkedList” cannot be constructed.", ToMutableLinkedList.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a new mutable [LinkedList]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> @NotNull LinkedList<T> toMutableLinkedList(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableLinkedList<>();

        var size = collection.size();
        if (size == 0)
            return new MutableLinkedList<>();
        return __withNoTransform(collection, size);
    }

    /// Convert the `collection` to a new mutable [LinkedList]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> @NotNull LinkedList<T> toMutableLinkedList(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableLinkedList<>();
        if (collection.isEmpty())
            return new MutableLinkedList<>();
        return __withNoTransform(collection, collection.size());
    }

    /// Convert the `collection` to a new mutable [LinkedList]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> @NotNull LinkedList<T> toMutableLinkedList(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return new MutableLinkedList<>();

        var size = collection.length;
        if (size == 0)
            return new MutableLinkedList<>();
        return __withNoTransform(collection, size);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a new mutable [LinkedList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull LinkedList<U> toMutableLinkedList(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                    final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedList<>();

        var size = collection.size();
        if (size == 0)
            return new MutableLinkedList<>();
        return __with2Argument(collection, size, transform);
    }

    /// Convert the `collection` to a new mutable [LinkedList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull LinkedList<U> toMutableLinkedList(final @Nullable CollectionHolder<? extends T> collection,
                                                                    final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedList<>();
        if (collection.isEmpty())
            return new MutableLinkedList<>();
        return __with2Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to a new mutable [LinkedList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull LinkedList<U> toMutableLinkedList(final T @Nullable @Unmodifiable [] collection,
                                                                    final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedList<>();

        var size = collection.length;
        if (size == 0)
            return new MutableLinkedList<>();
        return __with2Argument(collection, size, transform);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to a new mutable [LinkedList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull LinkedList<U> toMutableLinkedList(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                    final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedList<>();

        var size = collection.size();
        if (size == 0)
            return new MutableLinkedList<>();
        return __with1Argument(collection, size, transform);
    }

    /// Convert the `collection` to a new mutable [LinkedList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull LinkedList<U> toMutableLinkedList(final @Nullable CollectionHolder<? extends T> collection,
                                                                    final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedList<>();
        if (collection.isEmpty())
            return new MutableLinkedList<>();
        return __with1Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to a new mutable [LinkedList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull LinkedList<U> toMutableLinkedList(final T @Nullable @Unmodifiable [] collection,
                                                                    final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedList<>();

        var size = collection.length;
        if (size == 0)
            return new MutableLinkedList<>();
        return __with1Argument(collection, size, transform);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a new mutable [LinkedList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull @Unmodifiable LinkedList<U> toMutableLinkedList(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                  final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableLinkedList<>();

        var size = collection.size();
        if (size == 0)
            return new MutableLinkedList<>();
        return __with0Argument(size, transform);
    }

    /// Convert the `collection` to a new mutable [LinkedList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull @Unmodifiable LinkedList<U> toMutableLinkedList(final @Nullable CollectionHolder<? extends T> collection,
                                                                                  final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableLinkedList<>();
        if (collection.isEmpty())
            return new MutableLinkedList<>();
        return __with0Argument(collection.size(), transform);
    }

    /// Convert the `collection` to a new mutable [LinkedList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull @Unmodifiable LinkedList<U> toMutableLinkedList(final T @Nullable @Unmodifiable [] collection,
                                                                                  final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableLinkedList<>();

        var size = collection.length;
        if (size == 0)
            return new MutableLinkedList<>();
        return __with0Argument(size, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @NotNull LinkedList<T> __withNoTransform(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                final int size) {
        return new MutableLinkedList<>(_values(collection, size));
    }

    private static <T> @NotNull LinkedList<T> __withNoTransform(final T @NotNull @Unmodifiable [] collection,
                                                                final int size) {
        return new MutableLinkedList<>(_values(collection, size));
    }


    private static <U> @NotNull LinkedList<U> __with0Argument(final int size,
                                                              final @NotNull Supplier<? extends U> transform) {
        return new MutableLinkedList<>(_values(size, transform));
    }


    private static <T, U> @NotNull LinkedList<U> __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                 final int size,
                                                                 final @NotNull Function<? super T, ? extends U> transform) {
        return new MutableLinkedList<>(_values(collection, size, transform));
    }

    private static <T, U> @NotNull LinkedList<U> __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                                 final int size,
                                                                 final @NotNull Function<? super T, ? extends U> transform) {
        return new MutableLinkedList<>(_values(collection, size, transform));
    }


    private static <T, U> @NotNull LinkedList<U> __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                 final int size,
                                                                 final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return new MutableLinkedList<>(_values(collection, size, transform));
    }

    private static <T, U> @NotNull LinkedList<U> __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                                 final int size,
                                                                 final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return new MutableLinkedList<>(_values(collection, size, transform));
    }

    //#endregion -------------------- Loop methods --------------------

}
