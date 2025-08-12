package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ImmutableLinkedHashSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyLinkedHashSet;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToLinkedHashSet
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToLinkedHashSet() { throw new ImpossibleConstructionException("The utility class “ToLinkedHashSet” cannot be constructed.", ToLinkedHashSet.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [ImmutableLinkedHashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> toLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyLinkedHashSet();

        final var size = collection.size();
        if (size == 0)
            return emptyLinkedHashSet();
        return new ImmutableLinkedHashSet<>(_uniqueValues(collection, size));
    }

    /// Convert the `collection` to an [ImmutableLinkedHashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> toLinkedHashSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyLinkedHashSet();
        if (collection.isEmpty())
            return emptyLinkedHashSet();
        if (collection.hasDuplicate())
            return new ImmutableLinkedHashSet<>(_values(collection, collection.size()));
        return new ImmutableLinkedHashSet<>(_uniqueValues(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableLinkedHashSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableLinkedHashSet<T> toLinkedHashSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyLinkedHashSet();

        final var size = collection.length;
        if (size == 0)
            return emptyLinkedHashSet();
        return new ImmutableLinkedHashSet<>(_uniqueValues(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyLinkedHashSet();

        final var size = collection.size();
        if (size == 0)
            return emptyLinkedHashSet();
        return new ImmutableLinkedHashSet<>(_uniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyLinkedHashSet();
        if (collection.isEmpty())
            return emptyLinkedHashSet();
        return new ImmutableLinkedHashSet<>(_uniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyLinkedHashSet();

        final var size = collection.length;
        if (size == 0)
            return emptyLinkedHashSet();
        return new ImmutableLinkedHashSet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [ImmutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyLinkedHashSet();

        final var size = collection.size();
        if (size == 0)
            return emptyLinkedHashSet();
        return new ImmutableLinkedHashSet<>(_uniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyLinkedHashSet();
        if (collection.isEmpty())
            return emptyLinkedHashSet();
        return new ImmutableLinkedHashSet<>(_uniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyLinkedHashSet();

        final var size = collection.length;
        if (size == 0)
            return emptyLinkedHashSet();
        return new ImmutableLinkedHashSet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [ImmutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                     final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyLinkedHashSet();

        final var size = collection.size();
        if (size == 0)
            return emptyLinkedHashSet();
        return new ImmutableLinkedHashSet<>(_uniqueValues(size, transform));
    }

    /// Convert the `collection` to an [ImmutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                     final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyLinkedHashSet();
        if (collection.isEmpty())
            return emptyLinkedHashSet();
        return new ImmutableLinkedHashSet<>(_uniqueValues(collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                     final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyLinkedHashSet();

        final var size = collection.length;
        if (size == 0)
            return emptyLinkedHashSet();
        return new ImmutableLinkedHashSet<>(_uniqueValues(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
