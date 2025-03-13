package joookiwi.collection.java.method;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

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
    public static <T extends @Nullable Comparable<T>> @NotNull @Unmodifiable ConcurrentSkipListSet<T> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        var size = collection.size();
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __withNoTransform(collection, size);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Comparable<T>> @NotNull @Unmodifiable ConcurrentSkipListSet<T> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyConcurrentSkipListSet();
        if (collection.isEmpty())
            return emptyConcurrentSkipListSet();
        if (collection.hasDuplicate())
            return __withNoDuplicate(collection, collection.size());
        return __withNoTransform(collection, collection.size());
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Comparable<T>> @NotNull @Unmodifiable ConcurrentSkipListSet<T> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        var size = collection.length;
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __withNoTransform(collection, size);
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
    public static <T extends @Nullable Object, U extends @Nullable Comparable<U>> @NotNull @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                                          final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        var size = collection.size();
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __with2Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Comparable<U>> @NotNull @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                                          final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();
        if (collection.isEmpty())
            return emptyConcurrentSkipListSet();
        return __with2Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Comparable<U>> @NotNull @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                                          final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        var size = collection.length;
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __with2Argument(collection, size, transform);
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
    public static <T extends @Nullable Object, U extends @Nullable Comparable<U>> @NotNull @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                                          final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        var size = collection.size();
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __with1Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Comparable<U>> @NotNull @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                                          final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();
        if (collection.isEmpty())
            return emptyConcurrentSkipListSet();
        return __with1Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Comparable<U>> @NotNull @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                                          final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        var size = collection.length;
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __with1Argument(collection, size, transform);
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
    public static <T, U extends Comparable<U>> @NotNull @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                       final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        var size = collection.size();
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __with0Argument(size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U extends Comparable<U>> @NotNull @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                       final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();
        if (collection.isEmpty())
            return emptyConcurrentSkipListSet();
        return __with0Argument(collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [ConcurrentSkipListSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U extends Comparable<U>> @NotNull @Unmodifiable ConcurrentSkipListSet<U> toConcurrentSkipListSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                                       final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyConcurrentSkipListSet();

        var size = collection.length;
        if (size == 0)
            return emptyConcurrentSkipListSet();
        return __with0Argument(size, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> @NotNull @Unmodifiable ConcurrentSkipListSet<T> __withNoDuplicate(final @NotNull CollectionHolder<? extends T> collection,
                                                                                                                  final int size) {
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size));
    }


    private static <T extends @Nullable Object> @NotNull @Unmodifiable ConcurrentSkipListSet<T> __withNoTransform(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                                                  final int size) {
        return new ImmutableConcurrentSkipListSet<>(_values(collection, size));
    }

    private static <T extends @Nullable Object> @NotNull @Unmodifiable ConcurrentSkipListSet<T> __withNoTransform(final T @NotNull @Unmodifiable [] collection,
                                                                                                                  final int size) {
        return new ImmutableConcurrentSkipListSet<>(_values(collection, size));
    }


    private static <U extends @Nullable Object> @NotNull @Unmodifiable ConcurrentSkipListSet<U> __with0Argument(final int size,
                                                                                                                final @NotNull Supplier<? extends U> transform) {
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(size, transform));
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable ConcurrentSkipListSet<U> __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                            final int size,
                                                                                                                                            final @NotNull Function<? super T, ? extends U> transform) {
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable ConcurrentSkipListSet<U> __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                                                                                                            final int size,
                                                                                                                                            final @NotNull Function<? super T, ? extends U> transform) {
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform));
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable ConcurrentSkipListSet<U> __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection, int size,
                                                                                                                                            final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> @NotNull @Unmodifiable ConcurrentSkipListSet<U> __with2Argument(final T @NotNull @Unmodifiable [] collection, int size,
                                                                                                                                            final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return new ImmutableConcurrentSkipListSet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- Loop methods --------------------

}
