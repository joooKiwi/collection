package joookiwi.collection.java.method;

import java.util.HashSet;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableHashSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Float.isNaN;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_4;

@NotNullByDefault
public final class ToMutableHashSet
    extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    public ToMutableHashSet() { throw new ImpossibleConstructionException("The utility class “ToMutableHashSet” cannot be constructed.", ToMutableHashSet.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableHashSet<>();
        return __core(collection);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableHashSet<>();
        return __core(collection);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return new MutableHashSet<>();
        return __core(collection);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();
        return __core(collection, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();
        return __core(collection, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();
        return __core(collection, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();
        return __core(collection, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();
        return __core(collection, transform);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();
        return __core(collection, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();
        return __core(collection, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();
        return __core(collection, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#region -------------------- initialCapacity --------------------

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                  final int initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                  final @Nullable Integer initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection);
        return __core(collection, initialCapacity);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                  final int initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                  final @Nullable Integer initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection);
        return __core(collection, initialCapacity);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                  final int initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                  final @Nullable Integer initialCapacity) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection);
        return __core(collection, initialCapacity);
    }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, (T, int) → U --------------------

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final int initialCapacity,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }

    //#endregion -------------------- initialCapacity, (T, int) → U --------------------
    //#region -------------------- initialCapacity, (T) → U --------------------

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final int initialCapacity,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }

    //#endregion -------------------- initialCapacity, (T) → U --------------------
    //#region -------------------- initialCapacity, () → U --------------------

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final int initialCapacity,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        return __core(collection, initialCapacity, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(initialCapacity);
        if (initialCapacity == null)
            return __core(collection, transform);
        return __core(collection, initialCapacity, transform);
    }

    //#endregion -------------------- initialCapacity, () → U --------------------

    //#region -------------------- initialCapacity, loadFactor --------------------

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                  final int initialCapacity,
                                                                                  final float loadFactor) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity);
        return __core(collection, initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                  final int initialCapacity,
                                                                                  final float loadFactor) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity);
        return __core(collection, initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                  final int initialCapacity,
                                                                                  final float loadFactor) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity);
        return __core(collection, initialCapacity, loadFactor);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                  final int initialCapacity,
                                                                                  final @Nullable Float loadFactor) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (loadFactor == null)
            return __core(collection, initialCapacity);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity);
        return __core(collection, initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                  final int initialCapacity,
                                                                                  final @Nullable Float loadFactor) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (loadFactor == null)
            return __core(collection, initialCapacity);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity);
        return __core(collection, initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                  final int initialCapacity,
                                                                                  final @Nullable Float loadFactor) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (loadFactor == null)
            return __core(collection, initialCapacity);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity);
        return __core(collection, initialCapacity, loadFactor);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                  final @Nullable Integer initialCapacity,
                                                                                  final float loadFactor) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (initialCapacity == null)
            if (isNaN(loadFactor))
                return __core(collection);
            else if (loadFactor <= 0F)
                return __core(collection);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity);
        return __core(collection, initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                  final @Nullable Integer initialCapacity,
                                                                                  final float loadFactor) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (initialCapacity == null)
            if (isNaN(loadFactor))
                return __core(collection);
            else if (loadFactor <= 0F)
                return __core(collection);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity);
        return __core(collection, initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                  final @Nullable Integer initialCapacity,
                                                                                  final float loadFactor) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (initialCapacity == null)
            if (isNaN(loadFactor))
                return __core(collection);
            else if (loadFactor <= 0F)
                return __core(collection);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity);
        return __core(collection, initialCapacity, loadFactor);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                  final @Nullable Integer initialCapacity,
                                                                                  final @Nullable Float loadFactor) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (initialCapacity == null)
            if (loadFactor == null)
                return __core(collection);
            else if (loadFactor.isNaN())
                return __core(collection);
            else if (loadFactor <= 0F)
                return __core(collection);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor);
        if (loadFactor == null)
            return __core(collection, initialCapacity);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity);
        return __core(collection, initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                  final @Nullable Integer initialCapacity,
                                                                                  final @Nullable Float loadFactor) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (initialCapacity == null)
            if (loadFactor == null)
                return __core(collection);
            else if (loadFactor.isNaN())
                return __core(collection);
            else if (loadFactor <= 0F)
                return __core(collection);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor);
        if (loadFactor == null)
            return __core(collection, initialCapacity);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity);
        return __core(collection, initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableHashSet<T> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                  final @Nullable Integer initialCapacity,
                                                                                  final @Nullable Float loadFactor) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (initialCapacity == null)
            if (loadFactor == null)
                return __core(collection);
            else if (loadFactor.isNaN())
                return __core(collection);
            else if (loadFactor <= 0F)
                return __core(collection);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor);
        if (loadFactor == null)
            return __core(collection, initialCapacity);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity);
        return __core(collection, initialCapacity, loadFactor);
    }

    //#endregion -------------------- initialCapacity, loadFactor --------------------
    //#region -------------------- initialCapacity, loadFactor, (T, int) → U --------------------

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final int initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final int initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (initialCapacity == null)
            if (isNaN(loadFactor))
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (initialCapacity == null)
            if (isNaN(loadFactor))
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (initialCapacity == null)
            if (isNaN(loadFactor))
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (initialCapacity == null)
            if (loadFactor == null)
                return __core(collection, transform);
            else if (loadFactor.isNaN())
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (initialCapacity == null)
            if (loadFactor == null)
                return __core(collection, transform);
            else if (loadFactor.isNaN())
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (initialCapacity == null)
            if (loadFactor == null)
                return __core(collection, transform);
            else if (loadFactor.isNaN())
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    //#endregion -------------------- initialCapacity, loadFactor, (T, int) → U --------------------
    //#region -------------------- initialCapacity, loadFactor, (T) → U --------------------

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final int initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final int initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (initialCapacity == null)
            if (isNaN(loadFactor))
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (initialCapacity == null)
            if (isNaN(loadFactor))
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (initialCapacity == null)
            if (isNaN(loadFactor))
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (initialCapacity == null)
            if (loadFactor == null)
                return __core(collection, transform);
            else if (loadFactor.isNaN())
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (initialCapacity == null)
            if (loadFactor == null)
                return __core(collection, transform);
            else if (loadFactor.isNaN())
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (initialCapacity == null)
            if (loadFactor == null)
                return __core(collection, transform);
            else if (loadFactor.isNaN())
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    //#endregion -------------------- initialCapacity, loadFactor, (T) → U --------------------
    //#region -------------------- initialCapacity, loadFactor, () → U --------------------

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final int initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final int initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final int initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (initialCapacity == null)
            if (isNaN(loadFactor))
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (initialCapacity == null)
            if (isNaN(loadFactor))
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final float loadFactor,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            if (isNaN(loadFactor))
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor);
        if (initialCapacity == null)
            if (isNaN(loadFactor))
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (isNaN(loadFactor))
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }


    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (initialCapacity == null)
            if (loadFactor == null)
                return __core(collection, transform);
            else if (loadFactor.isNaN())
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (initialCapacity == null)
            if (loadFactor == null)
                return __core(collection, transform);
            else if (loadFactor.isNaN())
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    /// Convert the `collection` to a new [MutableHashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                              final @Nullable Integer initialCapacity,
                                                                                                              final @Nullable Float loadFactor,
                                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            if (loadFactor == null)
                return __empty(initialCapacity);
            else if (loadFactor.isNaN())
                return __empty(initialCapacity);
            else if (loadFactor <= 0F)
                return __empty(initialCapacity);
            else
                return __empty(initialCapacity, loadFactor.floatValue());
        if (initialCapacity == null)
            if (loadFactor == null)
                return __core(collection, transform);
            else if (loadFactor.isNaN())
                return __core(collection, transform);
            else if (loadFactor <= 0F)
                return __core(collection, transform);
            else
                return __core(collection, DEFAULT_INITIAL_CAPACITY, loadFactor, transform);
        if (loadFactor == null)
            return __core(collection, initialCapacity, transform);
        if (loadFactor.isNaN())
            return __core(collection, initialCapacity, transform);
        if (loadFactor <= 0F)
            return __core(collection, initialCapacity, transform);
        return __core(collection, initialCapacity, loadFactor, transform);
    }

    //#endregion -------------------- initialCapacity, loadFactor, () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //README: The loadFactor is already > 0 and != NaN

    //#region -------------------- empty --------------------

    private static <T extends @Nullable Object> MutableHashSet<T> __empty(final int initialCapacity) { return new MutableHashSet<>(initialCapacity); }

    private static <T extends @Nullable Object> MutableHashSet<T> __empty(final @Nullable Integer initialCapacity) { return new MutableHashSet<>(initialCapacity); }


    private static <T extends @Nullable Object> MutableHashSet<T> __empty(final int initialCapacity,
                                                                          final float loadFactor) { return new MutableHashSet<>(initialCapacity, loadFactor); }

    private static <T extends @Nullable Object> MutableHashSet<T> __empty(final @Nullable Integer initialCapacity,
                                                                          final float loadFactor) { return new MutableHashSet<>(initialCapacity, loadFactor); }

    //#endregion -------------------- empty --------------------

    //#region -------------------- ∅ --------------------

    private static <T extends @Nullable Object> MutableHashSet<T> __core(final MinimalistCollectionHolder<? extends T> collection) {
        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, size));
    }

    private static <T extends @Nullable Object> MutableHashSet<T> __core(final CollectionHolder<? extends T> collection) {
        if (collection.isEmpty())
            return new MutableHashSet<>();
        if (collection.hasDuplicate())
            return new MutableHashSet<>(_values(collection, collection.size()));
        return new MutableHashSet<>(_uniqueValues(collection, collection.size()));
    }

    private static <T extends @Nullable Object> MutableHashSet<T> __core(final T @Unmodifiable [] collection) {
        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- transform --------------------

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, size, transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, collection.size(), transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, size, transform));
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                     final Function<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, size, transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                     final Function<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, collection.size(), transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                     final Function<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, size, transform));
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                     final Supplier<? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(size, transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                     final Supplier<? extends U> transform) {
        if (collection.isEmpty())
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection.size(), transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                     final Supplier<? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(size, transform));
    }

    //#endregion -------------------- transform --------------------
    //#region -------------------- initialCapacity --------------------

    private static <T extends @Nullable Object> MutableHashSet<T> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                         final int initialCapacity) {
        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, size), initialCapacity);
    }

    private static <T extends @Nullable Object> MutableHashSet<T> __core(final CollectionHolder<? extends T> collection,
                                                                         final int initialCapacity) {
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity);
        if (collection.hasDuplicate())
            return new MutableHashSet<>(_values(collection, collection.size()), initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, collection.size()), initialCapacity);
    }

    private static <T extends @Nullable Object> MutableHashSet<T> __core(final T @Unmodifiable [] collection,
                                                                         final int initialCapacity) {
        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, size), initialCapacity);
    }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, loadFactor --------------------

    private static <T extends @Nullable Object> MutableHashSet<T> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                         final int initialCapacity,
                                                                         final float loadFactor) {
        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, size), initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> MutableHashSet<T> __core(final CollectionHolder<? extends T> collection,
                                                                         final int initialCapacity,
                                                                         final float loadFactor) {
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity, loadFactor);
        if (collection.hasDuplicate())
            return new MutableHashSet<>(_values(collection, collection.size()), initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, collection.size()), initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object> MutableHashSet<T> __core(final T @Unmodifiable [] collection,
                                                                         final int initialCapacity,
                                                                         final float loadFactor) {
        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, size), initialCapacity, loadFactor);
    }

    //#endregion -------------------- initialCapacity, loadFactor --------------------
    //#region -------------------- initialCapacity, transform --------------------

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                     final int initialCapacity,
                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                     final int initialCapacity,
                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, collection.size(), transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                     final int initialCapacity,
                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity);
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                     final int initialCapacity,
                                                                                                     final Function<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                     final int initialCapacity,
                                                                                                     final Function<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, collection.size(), transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                     final int initialCapacity,
                                                                                                     final Function<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity);
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                     final int initialCapacity,
                                                                                                     final Supplier<? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(size, transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                     final int initialCapacity,
                                                                                                     final Supplier<? extends U> transform) {
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection.size(), transform), initialCapacity);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                     final int initialCapacity,
                                                                                                     final Supplier<? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(size, transform), initialCapacity);
    }

    //#endregion -------------------- initialCapacity, transform --------------------
    //#region -------------------- initialCapacity, loadFactor, transform --------------------

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                     final int initialCapacity,
                                                                                                     final float loadFactor,
                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                     final int initialCapacity,
                                                                                                     final float loadFactor,
                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, collection.size(), transform), initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                     final int initialCapacity,
                                                                                                     final float loadFactor,
                                                                                                     final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity, loadFactor);
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                     final int initialCapacity,
                                                                                                     final float loadFactor,
                                                                                                     final Function<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                     final int initialCapacity,
                                                                                                     final float loadFactor,
                                                                                                     final Function<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, collection.size(), transform), initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                     final int initialCapacity,
                                                                                                     final float loadFactor,
                                                                                                     final Function<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity, loadFactor);
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                     final int initialCapacity,
                                                                                                     final float loadFactor,
                                                                                                     final Supplier<? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(size, transform), initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                     final int initialCapacity,
                                                                                                     final float loadFactor,
                                                                                                     final Supplier<? extends U> transform) {
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection.size(), transform), initialCapacity, loadFactor);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> MutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                     final int initialCapacity,
                                                                                                     final float loadFactor,
                                                                                                     final Supplier<? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(size, transform), initialCapacity, loadFactor);
    }

    //#endregion -------------------- initialCapacity, loadFactor, transform --------------------

    //#endregion -------------------- Core methods --------------------

}
