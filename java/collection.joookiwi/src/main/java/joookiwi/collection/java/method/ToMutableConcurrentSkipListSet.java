package joookiwi.collection.java.method;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableConcurrentSkipListSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

@NotNullByDefault
public final class ToMutableConcurrentSkipListSet
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutableConcurrentSkipListSet() { throw new ImpossibleConstructionException("The utility class “ToMutableConcurrentSkipListSet” cannot be constructed.", ToMutableConcurrentSkipListSet.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a new mutable [ConcurrentSkipListSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> ConcurrentSkipListSet<T> toMutableConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableConcurrentSkipListSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableConcurrentSkipListSet<>();
        return __withNoTransform(collection, size);
    }

    /// Convert the `collection` to a new mutable [ConcurrentSkipListSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> ConcurrentSkipListSet<T> toMutableConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableConcurrentSkipListSet<>();
        if (collection.isEmpty())
            return new MutableConcurrentSkipListSet<>();
        if (collection.hasDuplicate())
            return __withNoDuplicate(collection, collection.size());
        return __withNoTransform(collection, collection.size());
    }

    /// Convert the `collection` to a new mutable [ConcurrentSkipListSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> ConcurrentSkipListSet<T> toMutableConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return new MutableConcurrentSkipListSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableConcurrentSkipListSet<>();
        return __withNoTransform(collection, size);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a new mutable [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableConcurrentSkipListSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableConcurrentSkipListSet<>();
        return __with2Argument(collection, size, transform);
    }

    /// Convert the `collection` to a new mutable [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableConcurrentSkipListSet<>();
        if (collection.isEmpty())
            return new MutableConcurrentSkipListSet<>();
        if (collection.hasDuplicate())
            return __with2Argument(collection, collection.size(), transform);
        return __with2Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to a new mutable [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableConcurrentSkipListSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableConcurrentSkipListSet<>();
        return __with2Argument(collection, size, transform);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to a new mutable [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableConcurrentSkipListSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableConcurrentSkipListSet<>();
        return __with1Argument(collection, size, transform);
    }

    /// Convert the `collection` to a new mutable [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableConcurrentSkipListSet<>();
        if (collection.isEmpty())
            return new MutableConcurrentSkipListSet<>();
        if (collection.hasDuplicate())
            return __with1Argument(collection, collection.size(), transform);
        return __with1Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to a new mutable [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableConcurrentSkipListSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableConcurrentSkipListSet<>();
        return __with1Argument(collection, size, transform);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a new mutable [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                          final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableConcurrentSkipListSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableConcurrentSkipListSet<>();
        return __with0Argument(size, transform);
    }

    /// Convert the `collection` to a new mutable [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                          final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableConcurrentSkipListSet<>();
        if (collection.isEmpty())
            return new MutableConcurrentSkipListSet<>();
        if (collection.hasDuplicate())
            return __with0Argument(collection.size(), transform);
        return __with0Argument(collection.size(), transform);
    }

    /// Convert the `collection` to a new mutable [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> ConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                          final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableConcurrentSkipListSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableConcurrentSkipListSet<>();
        return __with0Argument(size, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> ConcurrentSkipListSet<T> __withNoDuplicate(final CollectionHolder<? extends T> collection,
                                                                  final int size) {
        return new MutableConcurrentSkipListSet<>(_uniqueValues(collection, size));
    }


    private static <T> ConcurrentSkipListSet<T> __withNoTransform(final MinimalistCollectionHolder<? extends T> collection,
                                                                  final int size) {
        return new MutableConcurrentSkipListSet<>(_values(collection, size));
    }

    private static <T> ConcurrentSkipListSet<T> __withNoTransform(final T @Unmodifiable [] collection,
                                                                  final int size) {
        return new MutableConcurrentSkipListSet<>(_values(collection, size));
    }


    private static <U> ConcurrentSkipListSet<U> __with0Argument(final int size,
                                                                final Supplier<? extends U> transform) {
        return new MutableConcurrentSkipListSet<>(_values(size, transform));
    }


    private static <T extends @Nullable Object, U> ConcurrentSkipListSet<U> __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                            final int size,
                                                                                            final Function<? super T, ? extends U> transform) {
        return new MutableConcurrentSkipListSet<>(_values(collection, size, transform));
    }

    private static <T extends @Nullable Object, U> ConcurrentSkipListSet<U> __with1Argument(final T @Unmodifiable [] collection,
                                                                                            final int size,
                                                                                            final Function<? super T, ? extends U> transform) {
        return new MutableConcurrentSkipListSet<>(_values(collection, size, transform));
    }


    private static <T extends @Nullable Object, U> ConcurrentSkipListSet<U> __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                            final int size,
                                                                                            final ObjIntFunction<? super T, ? extends U> transform) {
        return new MutableConcurrentSkipListSet<>(_values(collection, size, transform));
    }

    private static <T extends @Nullable Object, U> ConcurrentSkipListSet<U> __with2Argument(final T @Unmodifiable [] collection,
                                                                                            final int size,
                                                                                            final ObjIntFunction<? super T, ? extends U> transform) {
        return new MutableConcurrentSkipListSet<>(_values(collection, size, transform));
    }

    //#endregion -------------------- Loop methods --------------------

}
