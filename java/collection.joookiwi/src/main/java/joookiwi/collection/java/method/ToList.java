package joookiwi.collection.java.method;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyList;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToList
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToList() { throw new ImpossibleConstructionException("The utility class “ToList” cannot be constructed.", ToList.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [List]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @NotNull @Unmodifiable List<T> toList(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyList();

        var size = collection.size();
        if (size == 0)
            return emptyList();
        return __withNoTransform(collection, size);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [List]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @NotNull @Unmodifiable List<T> toList(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyList();
        if (collection.isEmpty())
            return emptyList();
        return __withNoTransform(collection, collection.size());
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [List]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @NotNull @Unmodifiable List<T> toList(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyList();

        var size = collection.length;
        if (size == 0)
            return emptyList();
        return __withNoTransform(collection, size);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [List]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable List<U> toList(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                               final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyList();

        var size = collection.size();
        if (size == 0)
            return emptyList();
        return __with2Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [List]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable List<U> toList(final @Nullable CollectionHolder<? extends T> collection,
                                                               final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyList();
        if (collection.isEmpty())
            return emptyList();
        return __with2Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [List]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable List<U> toList(final T @Nullable @Unmodifiable [] collection,
                                                               final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyList();

        var size = collection.length;
        if (size == 0)
            return emptyList();
        return __with2Argument(collection, size, transform);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [List]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable List<U> toList(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                               final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyList();

        var size = collection.size();
        if (size == 0)
            return emptyList();
        return __with1Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [List]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable List<U> toList(final @Nullable CollectionHolder<? extends T> collection,
                                                               final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyList();
        if (collection.isEmpty())
            return emptyList();
        return __with1Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [List]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable List<U> toList(final T @Nullable @Unmodifiable [] collection,
                                                               final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyList();

        var size = collection.length;
        if (size == 0)
            return emptyList();
        return __with1Argument(collection, size, transform);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [List]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable List<U> toList(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                               final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyList();

        var size = collection.size();
        if (size == 0)
            return emptyList();
        return __with0Argument(size, transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [List]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable List<U> toList(final @Nullable CollectionHolder<? extends T> collection,
                                                               final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyList();
        if (collection.isEmpty())
            return emptyList();
        return __with0Argument(collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [List]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable List<U> toList(final T @Nullable @Unmodifiable [] collection,
                                                               final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyList();

        var size = collection.length;
        if (size == 0)
            return emptyList();
        return __with0Argument(size, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @NotNull @Unmodifiable List<T> __withNoTransform(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                        final int size) {
        return List.of(_values(collection, size)); // TODO create a list that can hold null values
    }

    private static <T> @NotNull @Unmodifiable List<T> __withNoTransform(final T @NotNull @Unmodifiable [] collection,
                                                                        final int size) {
        return List.of(_values(collection, size)); // TODO create a list that can hold null values
    }


    private static <U> @NotNull @Unmodifiable List<U> __with0Argument(final int size,
                                                                      final @NotNull Supplier<? extends U> transform) {
        return List.of(_values(size, transform)); // TODO create a list that can hold null values
    }


    private static <T, U> @NotNull @Unmodifiable List<U> __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final int size,
                                                                         final @NotNull Function<? super T, ? extends U> transform) {
        return List.of(_values(collection, size, transform)); // TODO create a list that can hold null values
    }

    private static <T, U> @NotNull @Unmodifiable List<U> __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                                         final int size,
                                                                         final @NotNull Function<? super T, ? extends U> transform) {
        return List.of(_values(collection, size, transform)); // TODO create a list that can hold null values
    }


    private static <T, U> @NotNull @Unmodifiable List<U> __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                         final int size,
                                                                         final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return List.of(_values(collection, size, transform)); // TODO create a list that can hold null values
    }

    private static <T, U> @NotNull @Unmodifiable List<U> __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                                         final int size,
                                                                         final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return List.of(_values(collection, size, transform)); // TODO create a list that can hold null values
    }

    //#endregion -------------------- Loop methods --------------------

}
