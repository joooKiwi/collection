package joookiwi.collection.java.method;

import java.util.Comparator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ImmutableConcurrentSkipListSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static java.util.Comparator.naturalOrder;
import static joookiwi.collection.java.CollectionConstants.emptyConcurrentSkipListSet;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToConcurrentSkipListSet
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToConcurrentSkipListSet() { throw new ImpossibleConstructionException("The utility class “ToConcurrentSkipListSet” cannot be constructed.", ToConcurrentSkipListSet.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends Comparable<? super T>> @Unmodifiable ConcurrentSkipListSet<T> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        final var size = collection.size();
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __withNoTransform(collection, size, naturalOrder());
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends Comparable<? super T>> @Unmodifiable ConcurrentSkipListSet<T> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyConcurrentSkipListSet();
        if (collection.isEmpty())
            return emptyConcurrentSkipListSet();
        if (collection.hasDuplicate())
            return __withNoDuplicate(collection, collection.size(), naturalOrder());
        return __withNoTransform(collection, collection.size(), naturalOrder());
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends Comparable<? super T>> @Unmodifiable ConcurrentSkipListSet<T> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        final var size = collection.length;
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __withNoTransform(collection, size, naturalOrder());
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                               final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        final var size = collection.size();
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __with2Argument(collection, size, transform, naturalOrder());
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                               final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();
        if (collection.isEmpty())
            return emptyConcurrentSkipListSet();
        return __with2Argument(collection, collection.size(), transform, naturalOrder());
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                               final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        final var size = collection.length;
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __with2Argument(collection, size, transform, naturalOrder());
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                               final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        final var size = collection.size();
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __with1Argument(collection, size, transform, naturalOrder());
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                               final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();
        if (collection.isEmpty())
            return emptyConcurrentSkipListSet();
        return __with1Argument(collection, collection.size(), transform, naturalOrder());
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                               final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        final var size = collection.length;
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __with1Argument(collection, size, transform, naturalOrder());
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                               final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        final var size = collection.size();
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __with0Argument(size, transform, naturalOrder());
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                               final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();
        if (collection.isEmpty())
            return emptyConcurrentSkipListSet();
        return __with0Argument(collection.size(), transform, naturalOrder());
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Comparable<? super U>> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                               final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        final var size = collection.length;
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __with0Argument(size, transform, naturalOrder());
    }

    //#endregion -------------------- () → U --------------------

    //#region -------------------- comparator --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @Unmodifiable ConcurrentSkipListSet<T> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final Comparator<? super T> comparator) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return __withNoTransform(collection, size, comparator);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @Unmodifiable ConcurrentSkipListSet<T> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                     final Comparator<? super T> comparator) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        if (collection.isEmpty())
            return new ImmutableConcurrentSkipListSet<>(comparator);
        if (collection.hasDuplicate())
            return __withNoDuplicate(collection, collection.size(), comparator);
        return __withNoTransform(collection, collection.size(), comparator);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// with a [Comparator]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [Comparator] to compare the values to each other
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T> @Unmodifiable ConcurrentSkipListSet<T> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                     final Comparator<? super T> comparator) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return __withNoTransform(collection, size, comparator);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- comparator, (T, int) → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return __with2Argument(collection, size, transform, comparator);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        if (collection.isEmpty())
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return __with2Argument(collection, collection.size(), transform, comparator);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return __with2Argument(collection, size, transform, comparator);
    }

    //#endregion -------------------- comparator, (T, int) → U --------------------
    //#region -------------------- comparator, (T) → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return __with1Argument(collection, size, transform, comparator);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        if (collection.isEmpty())
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return __with1Argument(collection, collection.size(), transform, comparator);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return __with1Argument(collection, size, transform, comparator);
    }

    //#endregion -------------------- comparator, (T) → U --------------------
    //#region -------------------- comparator, () → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param comparator The [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.size();
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return __with0Argument(size, transform, comparator);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param comparator The [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        if (collection.isEmpty())
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return __with0Argument(collection.size(), transform, comparator);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// with a [Comparator]
    /// and applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param comparator The [Comparator] to compare the values to each other
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U> @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                 final Comparator<? super U> comparator,
                                                                                                                 final Supplier<? extends U> transform) {
        if (collection == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);

        final var size = collection.length;
        if (size == 0)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return __with0Argument(size, transform, comparator);
    }

    //#endregion -------------------- comparator, () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @Unmodifiable ConcurrentSkipListSet<T> __withNoDuplicate(final CollectionHolder<? extends T> collection,
                                                                                final int size,
                                                                                final Comparator<? super T> comparator) {
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size), comparator);
    }


    private static <T> @Unmodifiable ConcurrentSkipListSet<T> __withNoTransform(final MinimalistCollectionHolder<? extends T> collection,
                                                                                final int size,
                                                                                final Comparator<? super T> comparator) {
        return new ImmutableConcurrentSkipListSet<>(_values(collection, size), comparator);
    }

    private static <T> @Unmodifiable ConcurrentSkipListSet<T> __withNoTransform(final T @Unmodifiable [] collection,
                                                                                final int size,
                                                                                final Comparator<? super T> comparator) {
        return new ImmutableConcurrentSkipListSet<>(_values(collection, size), comparator);
    }


    private static <U> @Unmodifiable ConcurrentSkipListSet<U> __with0Argument(final int size,
                                                                              final Supplier<? extends U> transform,
                                                                              final Comparator<? super U> comparator) {
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(size, transform), comparator);
    }


    private static <T extends @Nullable Object, U> @Unmodifiable ConcurrentSkipListSet<U> __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                          final int size,
                                                                                                          final Function<? super T, ? extends U> transform,
                                                                                                          final Comparator<? super U> comparator) {
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform), comparator);
    }

    private static <T extends @Nullable Object, U> @Unmodifiable ConcurrentSkipListSet<U> __with1Argument(final T @Unmodifiable [] collection,
                                                                                                          final int size,
                                                                                                          final Function<? super T, ? extends U> transform,
                                                                                                          final Comparator<? super U> comparator) {
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform), comparator);
    }


    private static <T extends @Nullable Object, U> @Unmodifiable ConcurrentSkipListSet<U> __with2Argument(final MinimalistCollectionHolder<? extends T> collection, int size,
                                                                                                          final ObjIntFunction<? super T, ? extends U> transform,
                                                                                                          final Comparator<? super U> comparator) {
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform), comparator);
    }

    private static <T extends @Nullable Object, U> @Unmodifiable ConcurrentSkipListSet<U> __with2Argument(final T @Unmodifiable [] collection, int size,
                                                                                                          final ObjIntFunction<? super T, ? extends U> transform,
                                                                                                          final Comparator<? super U> comparator) {
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform), comparator);
    }

    //#endregion -------------------- Loop methods --------------------

}
