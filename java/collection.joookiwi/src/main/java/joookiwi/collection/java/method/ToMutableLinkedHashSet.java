package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableLinkedHashSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

@NotNullByDefault
public final class ToMutableLinkedHashSet
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutableLinkedHashSet() { throw new ImpossibleConstructionException("The utility class “ToMutableLinkedHashSet” cannot be constructed.", ToMutableLinkedHashSet.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a new [MutableLinkedHashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> toMutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableLinkedHashSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedHashSet<>();
        return new MutableLinkedHashSet<>(_uniqueValues(collection, size));
    }

    /// Convert the `collection` to a new [MutableLinkedHashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> toMutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableLinkedHashSet<>();
        if (collection.isEmpty())
            return new MutableLinkedHashSet<>();
        if (collection.hasDuplicate())
            return new MutableLinkedHashSet<>(_values(collection, collection.size()));
        return new MutableLinkedHashSet<>(_uniqueValues(collection, collection.size()));
    }

    /// Convert the `collection` to a new [MutableLinkedHashSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedHashSet<T> toMutableLinkedHashSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return new MutableLinkedHashSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedHashSet<>();
        return new MutableLinkedHashSet<>(_uniqueValues(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a new [MutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedHashSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedHashSet<>();
        return new MutableLinkedHashSet<>(_uniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to a new [MutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedHashSet<>();
        if (collection.isEmpty())
            return new MutableLinkedHashSet<>();
        return new MutableLinkedHashSet<>(_uniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a new [MutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedHashSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedHashSet<>();
        return new MutableLinkedHashSet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to a new [MutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedHashSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedHashSet<>();
        return new MutableLinkedHashSet<>(_uniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to a new [MutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedHashSet<>();
        if (collection.isEmpty())
            return new MutableLinkedHashSet<>();
        return new MutableLinkedHashSet<>(_uniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a new [MutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableLinkedHashSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedHashSet<>();
        return new MutableLinkedHashSet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a new [MutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                          final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableLinkedHashSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableLinkedHashSet<>();
        return new MutableLinkedHashSet<>(_uniqueValues(size, transform));
    }

    /// Convert the `collection` to a new [MutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                          final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableLinkedHashSet<>();
        if (collection.isEmpty())
            return new MutableLinkedHashSet<>();
        return new MutableLinkedHashSet<>(_uniqueValues(collection.size(), transform));
    }

    /// Convert the `collection` to a new [MutableLinkedHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                          final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableLinkedHashSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableLinkedHashSet<>();
        return new MutableLinkedHashSet<>(_uniqueValues(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
