package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ImmutableCopyOnWriteArraySet;
import org.jetbrains.annotations.Contract;
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

    /// Convert the `collection` to an [ImmutableCopyOnWriteArraySet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> ImmutableCopyOnWriteArraySet<T> toCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        final var size = collection.size();
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, size));
    }

    /// Convert the `collection` to an [ImmutableCopyOnWriteArraySet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> ImmutableCopyOnWriteArraySet<T> toCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();
        if (collection.isEmpty())
            return emptyCopyOnWriteArraySet();
        if (collection.hasDuplicate())
            return new ImmutableCopyOnWriteArraySet<>(_values(collection, collection.size()));
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableCopyOnWriteArraySet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> ImmutableCopyOnWriteArraySet<T> toCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        final var size = collection.length;
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                        final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        final var size = collection.size();
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                        final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();
        if (collection.isEmpty())
            return emptyCopyOnWriteArraySet();
        int size = collection.size();
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] collection,
                                                                                                        final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        final var size = collection.length;
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [ImmutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                        final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        final var size = collection.size();
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                        final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();
        if (collection.isEmpty())
            return emptyCopyOnWriteArraySet();
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] collection,
                                                                                                        final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        final var size = collection.length;
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [ImmutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                        final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        final var size = collection.size();
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(size, transform));
    }

    /// Convert the `collection` to an [ImmutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                        final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();
        if (collection.isEmpty())
            return emptyCopyOnWriteArraySet();
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] collection,
                                                                                                        final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyCopyOnWriteArraySet();

        final var size = collection.length;
        if (size == 0)
            return emptyCopyOnWriteArraySet();
        return new ImmutableCopyOnWriteArraySet<>(_uniqueValues(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
