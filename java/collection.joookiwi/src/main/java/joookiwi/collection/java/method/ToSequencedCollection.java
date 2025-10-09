package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsImmutableSequencedCollection;
import joookiwi.collection.java.extended.EmptySequencedCollection;
import joookiwi.collection.java.extended.ImmutableSequencedCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToSequencedCollection
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToSequencedCollection() { throw new ImpossibleConstructionException("The utility class “ToSequencedCollection” cannot be constructed.", ToSequencedCollection.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [ImmutableSequencedCollection]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableSequencedCollection<T> toSequencedCollection(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptySequencedCollection.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptySequencedCollection.getInstance();
        return new ArrayAsImmutableSequencedCollection<>(_values(collection, size));
    }

    /// Convert the `collection` to an [ImmutableSequencedCollection]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableSequencedCollection<T> toSequencedCollection(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptySequencedCollection.getInstance();
        if (collection.isEmpty())
            return EmptySequencedCollection.getInstance();
        return new ArrayAsImmutableSequencedCollection<>(_values(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableSequencedCollection]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableSequencedCollection<T> toSequencedCollection(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return EmptySequencedCollection.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptySequencedCollection.getInstance();
        return new ArrayAsImmutableSequencedCollection<>(_values(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutableSequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptySequencedCollection.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptySequencedCollection.getInstance();
        return new ArrayAsImmutableSequencedCollection<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableSequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptySequencedCollection.getInstance();
        if (collection.isEmpty())
            return EmptySequencedCollection.getInstance();
        return new ArrayAsImmutableSequencedCollection<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableSequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptySequencedCollection.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptySequencedCollection.getInstance();
        return new ArrayAsImmutableSequencedCollection<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [ImmutableSequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptySequencedCollection.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptySequencedCollection.getInstance();
        return new ArrayAsImmutableSequencedCollection<>(_values(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableSequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptySequencedCollection.getInstance();
        if (collection.isEmpty())
            return EmptySequencedCollection.getInstance();
        return new ArrayAsImmutableSequencedCollection<>(_values(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableSequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptySequencedCollection.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptySequencedCollection.getInstance();
        return new ArrayAsImmutableSequencedCollection<>(_values(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [ImmutableSequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptySequencedCollection.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptySequencedCollection.getInstance();
        return new ArrayAsImmutableSequencedCollection<>(_values(size, transform));
    }

    /// Convert the `collection` to an [ImmutableSequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptySequencedCollection.getInstance();
        if (collection.isEmpty())
            return EmptySequencedCollection.getInstance();
        return new ArrayAsImmutableSequencedCollection<>(_values(collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableSequencedCollection]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptySequencedCollection.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptySequencedCollection.getInstance();
        return new ArrayAsImmutableSequencedCollection<>(_values(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
