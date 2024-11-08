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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyTreeSet;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

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
    public static <T extends Comparable<T>> @NotNull @Unmodifiable TreeSet<T> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyTreeSet();

        var size = collection.size();
        if (size == 0)
            return emptyTreeSet();
        return __withNoTransform(collection, size);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends Comparable<T>> @NotNull @Unmodifiable TreeSet<T> toTreeSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyTreeSet();
        if (collection.isEmpty())
            return emptyTreeSet();
        if (collection.hasDuplicate())
            return __withNoDuplicate(collection, collection.size());
        return __withNoTransform(collection, collection.size());
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends Comparable<T>> @NotNull @Unmodifiable TreeSet<T> toTreeSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyTreeSet();

        var size = collection.length;
        if (size == 0)
            return emptyTreeSet();
        return __withNoTransform(collection, size);
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
    public static <T, U extends Comparable<U>> @NotNull @Unmodifiable TreeSet<U> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                           final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();

        var size = collection.size();
        if (size == 0)
            return emptyTreeSet();
        return __with2Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U extends Comparable<U>> @NotNull @Unmodifiable TreeSet<U> toTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                           final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();
        if (collection.isEmpty())
            return emptyTreeSet();
        return __with2Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U extends Comparable<U>> @NotNull @Unmodifiable TreeSet<U> toTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                           final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();

        var size = collection.length;
        if (size == 0)
            return emptyTreeSet();
        return __with2Argument(collection, size, transform);
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
    public static <T, U extends Comparable<U>> @NotNull @Unmodifiable TreeSet<U> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                           final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();

        var size = collection.size();
        if (size == 0)
            return emptyTreeSet();
        return __with1Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U extends Comparable<U>> @NotNull @Unmodifiable TreeSet<U> toTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                           final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();
        if (collection.isEmpty())
            return emptyTreeSet();
        return __with1Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U extends Comparable<U>> @NotNull @Unmodifiable TreeSet<U> toTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                           final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();

        var size = collection.length;
        if (size == 0)
            return emptyTreeSet();
        return __with1Argument(collection, size, transform);
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
    public static <T, U extends Comparable<U>> @NotNull @Unmodifiable TreeSet<U> toTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                           final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();

        var size = collection.size();
        if (size == 0)
            return emptyTreeSet();
        return __with0Argument(size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U extends Comparable<U>> @NotNull @Unmodifiable TreeSet<U> toTreeSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                           final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();
        if (collection.isEmpty())
            return emptyTreeSet();
        return __with0Argument(collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [TreeSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U extends Comparable<U>> @NotNull @Unmodifiable TreeSet<U> toTreeSet(final T @Nullable @Unmodifiable [] collection,
                                                                                           final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyTreeSet();

        var size = collection.length;
        if (size == 0)
            return emptyTreeSet();
        return __with0Argument(size, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @NotNull @Unmodifiable TreeSet<T> __withNoDuplicate(final @NotNull CollectionHolder<? extends T> collection,
                                                                           final int size) {
        return new ImmutableTreeSet<>(_uniqueValues(collection, size));
    }


    private static <T> @NotNull @Unmodifiable TreeSet<T> __withNoTransform(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                           final int size) {
        return new ImmutableTreeSet<>(_values(collection, size));
    }

    private static <T> @NotNull @Unmodifiable TreeSet<T> __withNoTransform(final T @NotNull @Unmodifiable [] collection,
                                                                           final int size) {
        return new ImmutableTreeSet<>(_values(collection, size));
    }


    private static <U> @NotNull @Unmodifiable TreeSet<U> __with0Argument(final int size,
                                                                         final @NotNull Supplier<? extends U> transform) {
        return new ImmutableTreeSet<>(_uniqueValues(size, transform));
    }


    private static <T, U> @NotNull @Unmodifiable TreeSet<U> __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                            final int size,
                                                                            final @NotNull Function<? super T, ? extends U> transform) {
        return new ImmutableTreeSet<>(_uniqueValues(collection, size, transform));
    }

    private static <T, U> @NotNull @Unmodifiable TreeSet<U> __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                                            final int size,
                                                                            final @NotNull Function<? super T, ? extends U> transform) {
        return new ImmutableTreeSet<>(_uniqueValues(collection, size, transform));
    }


    private static <T, U> @NotNull @Unmodifiable TreeSet<U> __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection, int size,
                                                                            final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return new ImmutableTreeSet<>(_uniqueValues(collection, size, transform));
    }

    private static <T, U> @NotNull @Unmodifiable TreeSet<U> __with2Argument(final T @NotNull @Unmodifiable [] collection, int size,
                                                                            final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        return new ImmutableTreeSet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- Loop methods --------------------

}
