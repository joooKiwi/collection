package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.SequencedCollection;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsSequencedCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptySequencedCollection;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

public final class ToSequencedCollection
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToSequencedCollection() { throw new ImpossibleConstructionException("The utility class “ToSequencedCollection” cannot be constructed.", ToSequencedCollection.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [SequencedCollection]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @NotNull @Unmodifiable SequencedCollection<T> toSequencedCollection(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptySequencedCollection();

        final var size = collection.size();
        if (size == 0)
            return emptySequencedCollection();
        return __withNoTransform(collection, size);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [SequencedCollection]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @NotNull @Unmodifiable SequencedCollection<T> toSequencedCollection(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptySequencedCollection();
        if (collection.isEmpty())
            return emptySequencedCollection();
        return __withNoTransform(collection, collection.size());
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [Collection]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @NotNull @Unmodifiable SequencedCollection<T> toSequencedCollection(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptySequencedCollection();

        final var size = collection.length;
        if (size == 0)
            return emptySequencedCollection();
        return __withNoTransform(collection, size);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [SequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable SequencedCollection<U> toSequencedCollection(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                             final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptySequencedCollection();

        final var size = collection.size();
        if (size == 0)
            return emptySequencedCollection();
        return __with2Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [SequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable SequencedCollection<U> toSequencedCollection(final @Nullable CollectionHolder<? extends T> collection,
                                                                                             final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptySequencedCollection();
        if (collection.isEmpty())
            return emptySequencedCollection();
        return __with2Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [SequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable SequencedCollection<U> toSequencedCollection(final T @Nullable @Unmodifiable [] collection,
                                                                                             final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptySequencedCollection();

        final var size = collection.length;
        if (size == 0)
            return emptySequencedCollection();
        return __with2Argument(collection, size, transform);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [SequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable SequencedCollection<U> toSequencedCollection(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                             final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptySequencedCollection();

        final var size = collection.size();
        if (size == 0)
            return emptySequencedCollection();
        return __with1Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [SequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable SequencedCollection<U> toSequencedCollection(final @Nullable CollectionHolder<? extends T> collection,
                                                                                             final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptySequencedCollection();
        if (collection.isEmpty())
            return emptySequencedCollection();
        return __with1Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [SequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable SequencedCollection<U> toSequencedCollection(final T @Nullable @Unmodifiable [] collection,
                                                                                             final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptySequencedCollection();

        final var size = collection.length;
        if (size == 0)
            return emptySequencedCollection();
        return __with1Argument(collection, size, transform);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [SequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable SequencedCollection<U> toSequencedCollection(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                             final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptySequencedCollection();

        final var size = collection.size();
        if (size == 0)
            return emptySequencedCollection();
        return __with0Argument(size, transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [SequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable SequencedCollection<U> toSequencedCollection(final @Nullable CollectionHolder<? extends T> collection,
                                                                                             final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptySequencedCollection();
        if (collection.isEmpty())
            return emptySequencedCollection();
        return __with0Argument(collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [SequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @NotNull @Unmodifiable SequencedCollection<U> toSequencedCollection(final T @Nullable @Unmodifiable [] collection,
                                                                                             final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptySequencedCollection();

        final var size = collection.length;
        if (size == 0)
            return emptySequencedCollection();
        return __with0Argument(size, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @NotNull @Unmodifiable SequencedCollection<T> __withNoTransform(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                       final int size) {
        return new ArrayAsSequencedCollection<>(_values(collection, size));
    }

    private static <T> @NotNull @Unmodifiable SequencedCollection<T> __withNoTransform(final T @NotNull @Unmodifiable [] collection,
                                                                                       final int size) {
        return new ArrayAsSequencedCollection<>(_values(collection, size));
    }


    private static <U> @NotNull @Unmodifiable SequencedCollection<U> __with0Argument(final int size,
                                                                                     final @NotNull Supplier<? extends U> transform) {
        return new ArrayAsSequencedCollection<>(_values(size, transform));
    }


    private static <T, U> @NotNull @Unmodifiable SequencedCollection<U> __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                        final int size,
                                                                                        final @NotNull Function<? super T, ? extends U> transform) {
        return new ArrayAsSequencedCollection<>(_values(collection, size, transform));
    }

    private static <T, U> @NotNull @Unmodifiable SequencedCollection<U> __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                                                        final int size,
                                                                                        final @NotNull Function<? super T, ? extends U> transform) {
        return new ArrayAsSequencedCollection<>(_values(collection, size, transform));
    }


    private static <T, U> @NotNull @Unmodifiable SequencedCollection<U> __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                        final int size,
                                                                                        final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return new ArrayAsSequencedCollection<>(_values(collection, size, transform));
    }

    private static <T, U> @NotNull @Unmodifiable SequencedCollection<U> __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                                                        final int size,
                                                                                        final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return new ArrayAsSequencedCollection<>(_values(collection, size, transform));
    }

    //#endregion -------------------- Loop methods --------------------

}
