package joookiwi.collection.java.method;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.EmptyTreeSet;
import joookiwi.collection.java.extended.ImmutableTreeSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;

@NotNullByDefault
public final class ToTreeSet
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToTreeSet() { throw new ImpossibleConstructionException("The utility class “ToTreeSet” cannot be constructed.", ToTreeSet.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [ImmutableTreeSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Comparable<? super T>> ImmutableTreeSet<T> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyTreeSet.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyTreeSet.getInstance();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, size));
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Comparable<? super T>> ImmutableTreeSet<T> toTreeSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyTreeSet.getInstance();
        if (collection.isEmpty())
            return EmptyTreeSet.getInstance();
        if (collection.hasDuplicate())
            return new ImmutableTreeSet<>(_orderedValues(collection, collection.size()));
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Comparable<? super T>> ImmutableTreeSet<T> toTreeSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return EmptyTreeSet.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyTreeSet.getInstance();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                        final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyTreeSet.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyTreeSet.getInstance();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                        final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyTreeSet.getInstance();
        if (collection.isEmpty())
            return EmptyTreeSet.getInstance();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                        final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyTreeSet.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyTreeSet.getInstance();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                        final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyTreeSet.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyTreeSet.getInstance();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                        final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyTreeSet.getInstance();
        if (collection.isEmpty())
            return EmptyTreeSet.getInstance();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                        final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyTreeSet.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyTreeSet.getInstance();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                        final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptyTreeSet.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyTreeSet.getInstance();
        return new ImmutableTreeSet<>(_orderedUniqueValues(size, transform));
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                        final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptyTreeSet.getInstance();
        if (collection.isEmpty())
            return EmptyTreeSet.getInstance();
        return new ImmutableTreeSet<>(_orderedUniqueValues(collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                        final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptyTreeSet.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyTreeSet.getInstance();
        return new ImmutableTreeSet<>(_orderedUniqueValues(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#region -------------------- comparator --------------------

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> ImmutableTreeSet<T> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final Comparator<? super T> comparator) {
        if (collection == null)
            return new ImmutableTreeSet<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutableTreeSet<>(comparator);
        return new ImmutableTreeSet<>(_uniqueValues(collection, size), comparator);
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> ImmutableTreeSet<T> toTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final Comparator<? super T> comparator) {
        if (collection == null)
            return new ImmutableTreeSet<>(comparator);
        if (collection.isEmpty())
            return new ImmutableTreeSet<>(comparator);
        if (collection.hasDuplicate())
            return new ImmutableTreeSet<>(_values(collection, collection.size()), comparator);
        return new ImmutableTreeSet<>(_uniqueValues(collection, collection.size()), comparator);
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> ImmutableTreeSet<T> toTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                             final Comparator<? super T> comparator) {
        if (collection == null)
            return new ImmutableTreeSet<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutableTreeSet<>(comparator);
        return new ImmutableTreeSet<>(_uniqueValues(collection, size), comparator);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- comparator, (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableTreeSet<U> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                         final Comparator<? super U> comparator,
                                                                                                         final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableTreeSet<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutableTreeSet<>(comparator);
        return new ImmutableTreeSet<>(_uniqueValues(collection, size, transform), comparator);
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableTreeSet<U> toTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                         final Comparator<? super U> comparator,
                                                                                                         final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableTreeSet<>(comparator);
        if (collection.isEmpty())
            return new ImmutableTreeSet<>(comparator);
        return new ImmutableTreeSet<>(_uniqueValues(collection, collection.size(), transform), comparator);
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableTreeSet<U> toTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                         final Comparator<? super U> comparator,
                                                                                                         final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableTreeSet<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutableTreeSet<>(comparator);
        return new ImmutableTreeSet<>(_uniqueValues(collection, size, transform), comparator);
    }

    //#endregion -------------------- comparator, (T, int) → U --------------------
    //#region -------------------- comparator, (T) → U --------------------

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableTreeSet<U> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                         final Comparator<? super U> comparator,
                                                                                                         final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableTreeSet<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutableTreeSet<>(comparator);
        return new ImmutableTreeSet<>(_uniqueValues(collection, size, transform), comparator);
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableTreeSet<U> toTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                         final Comparator<? super U> comparator,
                                                                                                         final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableTreeSet<>(comparator);
        if (collection.isEmpty())
            return new ImmutableTreeSet<>(comparator);
        return new ImmutableTreeSet<>(_uniqueValues(collection, collection.size(), transform), comparator);
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableTreeSet<U> toTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                         final Comparator<? super U> comparator,
                                                                                                         final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableTreeSet<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutableTreeSet<>(comparator);
        return new ImmutableTreeSet<>(_uniqueValues(collection, size, transform), comparator);
    }

    //#endregion -------------------- comparator, (T) → U --------------------
    //#region -------------------- comparator, () → U --------------------

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableTreeSet<U> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                         final Comparator<? super U> comparator,
                                                                                                         final Supplier<? extends U> transform) {
        if (collection == null)
            return new ImmutableTreeSet<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutableTreeSet<>(comparator);
        return new ImmutableTreeSet<>(_uniqueValues(size, transform), comparator);
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableTreeSet<U> toTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                         final Comparator<? super U> comparator,
                                                                                                         final Supplier<? extends U> transform) {
        if (collection == null)
            return new ImmutableTreeSet<>(comparator);
        if (collection.isEmpty())
            return new ImmutableTreeSet<>(comparator);
        return new ImmutableTreeSet<>(_uniqueValues(collection.size(), transform), comparator);
    }

    /// Convert the `collection` to an [ImmutableTreeSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableTreeSet<U> toTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                         final Comparator<? super U> comparator,
                                                                                                         final Supplier<? extends U> transform) {
        if (collection == null)
            return new ImmutableTreeSet<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutableTreeSet<>(comparator);
        return new ImmutableTreeSet<>(_uniqueValues(size, transform), comparator);
    }

    //#endregion -------------------- comparator, () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
