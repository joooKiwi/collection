package joookiwi.collection.java.method;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ImmutableCopyOnWriteArraySet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyCopyOnWriteArraySet;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToCopyOnWriteArraySet
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToCopyOnWriteArraySet() { throw new ImpossibleConstructionException("The utility class “ToCopyOnWriteArraySet” cannot be constructed.", ToCopyOnWriteArraySet.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [CopyOnWriteArraySet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<T> toCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        var size = collection.size();
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return __withNoTransform(collection, size);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [CopyOnWriteArraySet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<T> toCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();
        if (collection.isEmpty())
            return emptyCopyOnWriteArraySet();
        if (collection.hasDuplicate())
            return __withNoDuplicate(collection, collection.size());
        return __withNoTransform(collection, collection.size());
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [CopyOnWriteArraySet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<T> toCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        var size = collection.length;
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return __withNoTransform(collection, size);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [CopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> toCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                               final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        var size = collection.size();
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return __with2Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [CopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> toCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                               final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();
        if (collection.isEmpty())
            return emptyCopyOnWriteArraySet();
        return __with2Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [CopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> toCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                               final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        var size = collection.length;
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return __with2Argument(collection, size, transform);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [CopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> toCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                               final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        var size = collection.size();
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return __with1Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [CopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> toCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                               final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();
        if (collection.isEmpty())
            return emptyCopyOnWriteArraySet();
        return __with1Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [CopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> toCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                               final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        var size = collection.length;
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return __with1Argument(collection, size, transform);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [CopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> toCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                               final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        var size = collection.size();
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return __with0Argument(size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [CopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> toCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                               final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();
        if (collection.isEmpty())
            return emptyCopyOnWriteArraySet();
        return __with0Argument(collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [CopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> toCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                               final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        var size = collection.length;
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return __with0Argument(size, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<T> __withNoDuplicate(final @NotNull CollectionHolder<? extends T> collection,
                                                                                                                final int size) {
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, size));
    }


    private static <T extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<T> __withNoTransform(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                                                final int size) {
        return new ImmutableCopyOnWriteArraySet<>(_values(collection, size));
    }

    private static <T extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<T> __withNoTransform(final T @NotNull @Unmodifiable [] collection,
                                                                                                                final int size) {
        return new ImmutableCopyOnWriteArraySet<>(_values(collection, size));
    }


    private static <U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> __with0Argument(final int size,
                                                                                                              final @NotNull Supplier<? extends U> transform) {
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(size, transform));
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                          final int size,
                                                                                                                                          final @NotNull Function<? super T, ? extends U> transform) {
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, size, transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                                                                                                          final int size,
                                                                                                                                          final @NotNull Function<? super T, ? extends U> transform) {
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, size, transform));
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection, int size,
                                                                                                                                          final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, size, transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable CopyOnWriteArraySet<U> __with2Argument(final T @NotNull @Unmodifiable [] collection, int size,
                                                                                                                                          final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- Loop methods --------------------

}
