package joookiwi.collection.java.method;

import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ImmutableTreeSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyTreeSet;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToTreeSet
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToTreeSet() { throw new ImpossibleConstructionException("The utility class “ToTreeSet” cannot be constructed.", ToTreeSet.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @Unmodifiable TreeSet<T> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyTreeSet();

        final var size = collection.size();
        if (size == 0)
            return emptyTreeSet();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, size));
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @Unmodifiable TreeSet<T> toTreeSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyTreeSet();
        if (collection.isEmpty())
            return emptyTreeSet();
        if (collection.hasDuplicate())
            return new ImmutableTreeSet<>(_orderedValues(collection, collection.size()));
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, collection.size()));
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @Unmodifiable TreeSet<T> toTreeSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyTreeSet();

        final var size = collection.length;
        if (size == 0)
            return emptyTreeSet();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable TreeSet<U> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();

        final var size = collection.size();
        if (size == 0)
            return emptyTreeSet();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable TreeSet<U> toTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();
        if (collection.isEmpty())
            return emptyTreeSet();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable TreeSet<U> toTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();

        final var size = collection.length;
        if (size == 0)
            return emptyTreeSet();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable TreeSet<U> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();

        final var size = collection.size();
        if (size == 0)
            return emptyTreeSet();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable TreeSet<U> toTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();
        if (collection.isEmpty())
            return emptyTreeSet();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable TreeSet<U> toTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                     final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();

        final var size = collection.length;
        if (size == 0)
            return emptyTreeSet();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable TreeSet<U> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();

        final var size = collection.size();
        if (size == 0)
            return emptyTreeSet();
        return new ImmutableTreeSet<>(_orderedUniqueValues(size, transform));
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable TreeSet<U> toTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();
        if (collection.isEmpty())
            return emptyTreeSet();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection.size(), transform));
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable TreeSet<U> toTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                     final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();

        final var size = collection.length;
        if (size == 0)
            return emptyTreeSet();
        return new ImmutableTreeSet<>(_orderedUniqueValues(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
