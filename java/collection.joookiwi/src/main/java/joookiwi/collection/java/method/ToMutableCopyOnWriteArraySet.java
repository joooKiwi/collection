package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableCopyOnWriteArraySet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

@NotNullByDefault
public final class ToMutableCopyOnWriteArraySet
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutableCopyOnWriteArraySet() { throw new ImpossibleConstructionException("The utility class “ToMutableCopyOnWriteArraySet” cannot be constructed.", ToMutableCopyOnWriteArraySet.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a new [MutableCopyOnWriteArraySet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableCopyOnWriteArraySet<T> toMutableCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableCopyOnWriteArraySet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableCopyOnWriteArraySet<>();
        return new MutableCopyOnWriteArraySet<>(_uniqueValues(collection, size));
    }

    /// Convert the `collection` to a new [MutableCopyOnWriteArraySet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableCopyOnWriteArraySet<T> toMutableCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableCopyOnWriteArraySet<>();
        if (collection.isEmpty())
            return new MutableCopyOnWriteArraySet<>();
        if (collection.hasDuplicate())
            return new MutableCopyOnWriteArraySet<>(_values(collection, collection.size()));
        return new MutableCopyOnWriteArraySet<>(_uniqueValues(collection, collection.size()));
    }

    /// Convert the `collection` to a new [MutableCopyOnWriteArraySet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableCopyOnWriteArraySet<T> toMutableCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return new MutableCopyOnWriteArraySet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableCopyOnWriteArraySet<>();
        return new MutableCopyOnWriteArraySet<>(_uniqueValues(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a new [MutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                             final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableCopyOnWriteArraySet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableCopyOnWriteArraySet<>();
        return new MutableCopyOnWriteArraySet<>(_uniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to a new [MutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                             final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableCopyOnWriteArraySet<>();
        if (collection.isEmpty())
            return new MutableCopyOnWriteArraySet<>();
        return new MutableCopyOnWriteArraySet<>(_uniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a new [MutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] collection,
                                                                                                             final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableCopyOnWriteArraySet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableCopyOnWriteArraySet<>();
        return new MutableCopyOnWriteArraySet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to a new [MutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                             final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableCopyOnWriteArraySet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableCopyOnWriteArraySet<>();
        return new MutableCopyOnWriteArraySet<>(_uniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to a new [MutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                             final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableCopyOnWriteArraySet<>();
        if (collection.isEmpty())
            return new MutableCopyOnWriteArraySet<>();
        return new MutableCopyOnWriteArraySet<>(_uniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a new [MutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] collection,
                                                                                                             final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableCopyOnWriteArraySet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableCopyOnWriteArraySet<>();
        return new MutableCopyOnWriteArraySet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a new [MutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                             final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableCopyOnWriteArraySet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableCopyOnWriteArraySet<>();
        return new MutableCopyOnWriteArraySet<>(_uniqueValues(size, transform));
    }

    /// Convert the `collection` to a new [MutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                             final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableCopyOnWriteArraySet<>();
        if (collection.isEmpty())
            return new MutableCopyOnWriteArraySet<>();
        return new MutableCopyOnWriteArraySet<>(_uniqueValues(collection.size(), transform));
    }

    /// Convert the `collection` to a new [MutableCopyOnWriteArraySet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] collection,
                                                                                                             final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableCopyOnWriteArraySet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableCopyOnWriteArraySet<>();
        return new MutableCopyOnWriteArraySet<>(_uniqueValues(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
