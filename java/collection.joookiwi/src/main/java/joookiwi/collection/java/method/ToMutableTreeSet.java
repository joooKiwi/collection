package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableTreeSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

@NotNullByDefault
public final class ToMutableTreeSet
    extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    public ToMutableTreeSet() { throw new ImpossibleConstructionException("The utility class “ToMutableTreeSet” cannot be constructed.", ToMutableTreeSet.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a new [MutableTreeSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableTreeSet<T> toMutableTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableTreeSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableTreeSet<>();
        return new MutableTreeSet<>(_orderedUniqueValues(collection, size));
    }

    /// Convert the `collection` to a new [MutableTreeSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableTreeSet<T> toMutableTreeSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableTreeSet<>();
        if (collection.isEmpty())
            return new MutableTreeSet<>();
        if (collection.hasDuplicate())
            return new MutableTreeSet<>(_orderedValues(collection, collection.size()));
        return new MutableTreeSet<>(_orderedUniqueValues(collection, collection.size()));
    }

    /// Convert the `collection` to a new [MutableTreeSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableTreeSet<T> toMutableTreeSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return new MutableTreeSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableTreeSet<>();
        return new MutableTreeSet<>(_orderedUniqueValues(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a new [MutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableTreeSet<U> toMutableTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableTreeSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableTreeSet<>();
        return new MutableTreeSet<>(_orderedUniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to a new [MutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableTreeSet<U> toMutableTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableTreeSet<>();
        if (collection.isEmpty())
            return new MutableTreeSet<>();
        return new MutableTreeSet<>(_orderedUniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a new [MutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableTreeSet<U> toMutableTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableTreeSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableTreeSet<>();
        return new MutableTreeSet<>(_orderedUniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to a new [MutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableTreeSet<U> toMutableTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableTreeSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableTreeSet<>();
        return new MutableTreeSet<>(_orderedUniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to a new [MutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableTreeSet<U> toMutableTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableTreeSet<>();
        if (collection.isEmpty())
            return new MutableTreeSet<>();
        return new MutableTreeSet<>(_orderedUniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a new [MutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableTreeSet<U> toMutableTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableTreeSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableTreeSet<>();
        return new MutableTreeSet<>(_orderedUniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a new [MutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableTreeSet<U> toMutableTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableTreeSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableTreeSet<>();
        return new MutableTreeSet<>(_orderedUniqueValues(size, transform));
    }

    /// Convert the `collection` to a new [MutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableTreeSet<U> toMutableTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableTreeSet<>();
        if (collection.isEmpty())
            return new MutableTreeSet<>();
        return new MutableTreeSet<>(_orderedUniqueValues(collection.size(), transform));
    }

    /// Convert the `collection` to a new [MutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableTreeSet<U> toMutableTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableTreeSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableTreeSet<>();
        return new MutableTreeSet<>(_orderedUniqueValues(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
