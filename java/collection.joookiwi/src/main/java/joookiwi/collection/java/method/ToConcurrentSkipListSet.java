package joookiwi.collection.java.method;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.EmptyConcurrentSkipListSet;
import joookiwi.collection.java.extended.ImmutableConcurrentSkipListSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;

@NotNullByDefault
public final class ToConcurrentSkipListSet
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToConcurrentSkipListSet() { throw new ImpossibleConstructionException("The utility class “ToConcurrentSkipListSet” cannot be constructed.", ToConcurrentSkipListSet.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends Comparable<? super T>> ImmutableConcurrentSkipListSet<T> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyConcurrentSkipListSet.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyConcurrentSkipListSet.getInstance();
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size));
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends Comparable<? super T>> ImmutableConcurrentSkipListSet<T> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyConcurrentSkipListSet.getInstance();
        if (collection.isEmpty())
            return EmptyConcurrentSkipListSet.getInstance();
        if (collection.hasDuplicate())
            return new ImmutableConcurrentSkipListSet<>(_values(collection, collection.size()));
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends Comparable<? super T>> ImmutableConcurrentSkipListSet<T> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return EmptyConcurrentSkipListSet.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyConcurrentSkipListSet.getInstance();
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyConcurrentSkipListSet.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyConcurrentSkipListSet.getInstance();
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyConcurrentSkipListSet.getInstance();
        if (collection.isEmpty())
            return EmptyConcurrentSkipListSet.getInstance();
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                          final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyConcurrentSkipListSet.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyConcurrentSkipListSet.getInstance();
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyConcurrentSkipListSet.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyConcurrentSkipListSet.getInstance();
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyConcurrentSkipListSet.getInstance();
        if (collection.isEmpty())
            return EmptyConcurrentSkipListSet.getInstance();
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                          final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return EmptyConcurrentSkipListSet.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyConcurrentSkipListSet.getInstance();
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                          final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptyConcurrentSkipListSet.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyConcurrentSkipListSet.getInstance();
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(size, transform));
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                          final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptyConcurrentSkipListSet.getInstance();
        if (collection.isEmpty())
            return EmptyConcurrentSkipListSet.getInstance();
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection.size(), transform));
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                          final Supplier<? extends U> transform) {
        if (collection == null)
            return EmptyConcurrentSkipListSet.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyConcurrentSkipListSet.getInstance();
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#region -------------------- comparator --------------------

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ImmutableConcurrentSkipListSet<T> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                final Comparator<? super T> comparator) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size), comparator);
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ImmutableConcurrentSkipListSet<T> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                final Comparator<? super T> comparator) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        if (collection.isEmpty())
            return new ImmutableConcurrentSkipListSet<>(comparator);
        if (collection.hasDuplicate())
            return new ImmutableConcurrentSkipListSet<>(_values(collection, collection.size()), comparator);
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, collection.size()), comparator);
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [set][java.util.concurrent.ConcurrentSkipListSet] [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T> ImmutableConcurrentSkipListSet<T> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                final Comparator<? super T> comparator) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size), comparator);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- comparator, (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
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
    public static <T extends @Nullable Object, U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform), comparator);
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
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
    public static <T extends @Nullable Object, U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        if (collection.isEmpty())
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, collection.size(), transform), comparator);
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
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
    public static <T extends @Nullable Object, U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform), comparator);
    }

    //#endregion -------------------- comparator, (T, int) → U --------------------
    //#region -------------------- comparator, (T) → U --------------------

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
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
    public static <T extends @Nullable Object, U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform), comparator);
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
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
    public static <T extends @Nullable Object, U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        if (collection.isEmpty())
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, collection.size(), transform), comparator);
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
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
    public static <T extends @Nullable Object, U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform), comparator);
    }

    //#endregion -------------------- comparator, (T) → U --------------------
    //#region -------------------- comparator, () → U --------------------

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
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
    public static <T extends @Nullable Object, U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final Supplier<? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(size, transform), comparator);
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
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
    public static <T extends @Nullable Object, U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final Supplier<? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        if (collection.isEmpty())
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection.size(), transform), comparator);
    }

    /// Convert the `collection` to an [ImmutableConcurrentSkipListSet]
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
    public static <T extends @Nullable Object, U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                            final Comparator<? super U> comparator,
                                                                                                            final Supplier<? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(size, transform), comparator);
    }

    //#endregion -------------------- comparator, () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
