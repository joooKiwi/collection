package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ImmutableVector;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyVector;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToVector
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToVector() { throw new ImpossibleConstructionException("The utility class “ToVector” cannot be constructed.", ToVector.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [ImmutableVector]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableVector<T> toVector(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyVector();

        final var size = collection.size();
        if (size == 0)
            return emptyVector();
        return new ImmutableVector<>(_values(collection, size));
    }

    /// Convert the `collection` to an [ImmutableVector]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableVector<T> toVector(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyVector();
        if (collection.isEmpty())
            return emptyVector();
        return new ImmutableVector<>(_values(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableVector]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableVector<T> toVector(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyVector();

        final var size = collection.length;
        if (size == 0)
            return emptyVector();
        return new ImmutableVector<>(_values(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutableVector]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableVector<U> toVector(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyVector();

        final var size = collection.size();
        if (size == 0)
            return emptyVector();
        return new ImmutableVector<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableVector]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableVector<U> toVector(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyVector();
        if (collection.isEmpty())
            return emptyVector();
        return new ImmutableVector<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableVector]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableVector<U> toVector(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyVector();

        final var size = collection.length;
        if (size == 0)
            return emptyVector();
        return new ImmutableVector<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [ImmutableVector]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableVector<U> toVector(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyVector();

        final var size = collection.size();
        if (size == 0)
            return emptyVector();
        return new ImmutableVector<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableVector]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableVector<U> toVector(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyVector();
        if (collection.isEmpty())
            return emptyVector();
        return new ImmutableVector<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableVector]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableVector<U> toVector(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyVector();

        final var size = collection.length;
        if (size == 0)
            return emptyVector();
        return new ImmutableVector<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [ImmutableVector]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableVector<U> toVector(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyVector();

        final var size = collection.size();
        if (size == 0)
            return emptyVector();
        return new ImmutableVector<>(_values(size, transform));
    }

    /// Convert the `collection` to an [ImmutableVector]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableVector<U> toVector(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyVector();
        if (collection.isEmpty())
            return emptyVector();
        return new ImmutableVector<>(_values(collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableVector]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableVector<U> toVector(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyVector();

        final var size = collection.length;
        if (size == 0)
            return emptyVector();
        return new ImmutableVector<>(_values(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
