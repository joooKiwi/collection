package joookiwi.collection.java.method;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ImmutableArrayList;
import joookiwi.collection.java.extended.MutableArrayList;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

public final class ToMutableArrayList
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutableArrayList() { throw new ImpossibleConstructionException("The utility class “ToMutableArrayList” cannot be constructed.", ToMutableArrayList.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a new mutable [ArrayList]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> @NotNull ArrayList<T> toMutableArrayList(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableArrayList<>();

        var size = collection.size();
        if (size == 0)
            return new MutableArrayList<>();
        return __withNoTransform(collection, size);
    }

    /// Convert the `collection` to a new mutable [ArrayList]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> @NotNull ArrayList<T> toMutableArrayList(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableArrayList<>();
        if (collection.isEmpty())
            return new MutableArrayList<>();
        return __withNoTransform(collection, collection.size());
    }

    /// Convert the `collection` to a new mutable [ArrayList]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> @NotNull ArrayList<T> toMutableArrayList(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return new MutableArrayList<>();

        var size = collection.length;
        if (size == 0)
            return new MutableArrayList<>();
        return __withNoTransform(collection, size);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a new mutable [ArrayList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull ArrayList<U> toMutableArrayList(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                  final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableArrayList<>();

        var size = collection.size();
        if (size == 0)
            return new MutableArrayList<>();
        return __with2Argument(collection, size, transform);
    }

    /// Convert the `collection` to a new mutable [ArrayList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull ArrayList<U> toMutableArrayList(final @Nullable CollectionHolder<? extends T> collection,
                                                                  final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableArrayList<>();
        if (collection.isEmpty())
            return new MutableArrayList<>();
        return __with2Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to a new mutable [ArrayList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull ArrayList<U> toMutableArrayList(final T @Nullable @Unmodifiable [] collection,
                                                                  final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableArrayList<>();

        var size = collection.length;
        if (size == 0)
            return new MutableArrayList<>();
        return __with2Argument(collection, size, transform);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to a new mutable [ArrayList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull ArrayList<U> toMutableArrayList(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                  final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableArrayList<>();

        var size = collection.size();
        if (size == 0)
            return new MutableArrayList<>();
        return __with1Argument(collection, size, transform);
    }

    /// Convert the `collection` to a new mutable [ArrayList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull ArrayList<U> toMutableArrayList(final @Nullable CollectionHolder<? extends T> collection,
                                                                  final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableArrayList<>();
        if (collection.isEmpty())
            return new MutableArrayList<>();
        return __with1Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to a new mutable [ArrayList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull ArrayList<U> toMutableArrayList(final T @Nullable @Unmodifiable [] collection,
                                                                  final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableArrayList<>();

        var size = collection.length;
        if (size == 0)
            return new MutableArrayList<>();
        return __with1Argument(collection, size, transform);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a new mutable [ArrayList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull @Unmodifiable ArrayList<U> toMutableArrayList(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableArrayList<>();

        var size = collection.size();
        if (size == 0)
            return new MutableArrayList<>();
        return __with0Argument(size, transform);
    }

    /// Convert the `collection` to a new mutable [ArrayList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull @Unmodifiable ArrayList<U> toMutableArrayList(final @Nullable CollectionHolder<? extends T> collection,
                                                                                final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableArrayList<>();
        if (collection.isEmpty())
            return new MutableArrayList<>();
        return __with0Argument(collection.size(), transform);
    }

    /// Convert the `collection` to a new mutable [ArrayList]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T, U> @NotNull @Unmodifiable ArrayList<U> toMutableArrayList(final T @Nullable @Unmodifiable [] collection,
                                                                                final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableArrayList<>();

        var size = collection.length;
        if (size == 0)
            return new MutableArrayList<>();
        return __with0Argument(size, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @NotNull ArrayList<T> __withNoTransform(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                               final int size) {
        return new MutableArrayList<>(_values(collection, size));
    }

    private static <T> @NotNull ArrayList<T> __withNoTransform(final T @NotNull @Unmodifiable [] collection,
                                                               final int size) {
        return new MutableArrayList<>(_values(collection, size));
    }


    private static <U> @NotNull ArrayList<U> __with0Argument(final int size,
                                                             final @NotNull Supplier<? extends U> transform) {
        return new ImmutableArrayList<>(_values(size, transform));
    }


    private static <T, U> @NotNull ArrayList<U> __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                final int size,
                                                                final @NotNull Function<? super T, ? extends U> transform) {
        return new MutableArrayList<>(_values(collection, size, transform));
    }

    private static <T, U> @NotNull ArrayList<U> __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                                final int size,
                                                                final @NotNull Function<? super T, ? extends U> transform) {
        return new MutableArrayList<>(_values(collection, size, transform));
    }


    private static <T, U> @NotNull ArrayList<U> __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                final int size,
                                                                final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return new MutableArrayList<>(_values(collection, size, transform));
    }

    private static <T, U> @NotNull ArrayList<U> __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                                final int size,
                                                                final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return new MutableArrayList<>(_values(collection, size, transform));
    }

    //#endregion -------------------- Loop methods --------------------

}
