package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableSortedCollection;
import joookiwi.collection.java.extended.MutableSortedCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

@NotNullByDefault
public final class ToMutableSortedCollection
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutableSortedCollection() { throw new ImpossibleConstructionException("The utility class “ToMutableSortedCollection” cannot be constructed.", ToMutableSortedCollection.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a [MutableSortedCollection]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSortedCollection<T> toMutableSortedCollection(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return new ArrayAsMutableSortedCollection<>();

        final var size = collection.size();
        if (size == 0)
            return new ArrayAsMutableSortedCollection<>();
        return new ArrayAsMutableSortedCollection<>(_values(collection, size));
    }

    /// Convert the `collection` to a [MutableSortedCollection]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSortedCollection<T> toMutableSortedCollection(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return new ArrayAsMutableSortedCollection<>();
        if (collection.isEmpty())
            return new ArrayAsMutableSortedCollection<>();
        return new ArrayAsMutableSortedCollection<>(_values(collection, collection.size()));
    }

    /// Convert the `collection` to a [MutableSortedCollection]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSortedCollection<T> toMutableSortedCollection(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return new ArrayAsMutableSortedCollection<>();

        final var size = collection.length;
        if (size == 0)
            return new ArrayAsMutableSortedCollection<>();
        return new ArrayAsMutableSortedCollection<>(_values(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a [MutableSortedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableSortedCollection<U> toMutableSortedCollection(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ArrayAsMutableSortedCollection<>();

        final var size = collection.size();
        if (size == 0)
            return new ArrayAsMutableSortedCollection<>();
        return new ArrayAsMutableSortedCollection<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to a [MutableSortedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableSortedCollection<U> toMutableSortedCollection(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ArrayAsMutableSortedCollection<>();
        if (collection.isEmpty())
            return new ArrayAsMutableSortedCollection<>();
        return new ArrayAsMutableSortedCollection<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a [MutableSortedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableSortedCollection<U> toMutableSortedCollection(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ArrayAsMutableSortedCollection<>();

        final var size = collection.length;
        if (size == 0)
            return new ArrayAsMutableSortedCollection<>();
        return new ArrayAsMutableSortedCollection<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to a [MutableSortedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableSortedCollection<U> toMutableSortedCollection(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ArrayAsMutableSortedCollection<>();

        final var size = collection.size();
        if (size == 0)
            return new ArrayAsMutableSortedCollection<>();
        return new ArrayAsMutableSortedCollection<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to a [MutableSortedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableSortedCollection<U> toMutableSortedCollection(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ArrayAsMutableSortedCollection<>();
        if (collection.isEmpty())
            return new ArrayAsMutableSortedCollection<>();
        return new ArrayAsMutableSortedCollection<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a [MutableSortedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableSortedCollection<U> toMutableSortedCollection(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ArrayAsMutableSortedCollection<>();

        final var size = collection.length;
        if (size == 0)
            return new ArrayAsMutableSortedCollection<>();
        return new ArrayAsMutableSortedCollection<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a [MutableSortedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableSortedCollection<U> toMutableSortedCollection(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                final Supplier<? extends U> transform) {
        if (collection == null)
            return new ArrayAsMutableSortedCollection<>();

        final var size = collection.size();
        if (size == 0)
            return new ArrayAsMutableSortedCollection<>();
        return new ArrayAsMutableSortedCollection<>(_values(size, transform));
    }

    /// Convert the `collection` to a [MutableSortedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableSortedCollection<U> toMutableSortedCollection(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                final Supplier<? extends U> transform) {
        if (collection == null)
            return new ArrayAsMutableSortedCollection<>();
        if (collection.isEmpty())
            return new ArrayAsMutableSortedCollection<>();
        return new ArrayAsMutableSortedCollection<>(_values(collection.size(), transform));
    }

    /// Convert the `collection` to a [MutableSortedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableSortedCollection<U> toMutableSortedCollection(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                final Supplier<? extends U> transform) {
        if (collection == null)
            return new ArrayAsMutableSortedCollection<>();

        final var size = collection.length;
        if (size == 0)
            return new ArrayAsMutableSortedCollection<>();
        return new ArrayAsMutableSortedCollection<>(_values(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
