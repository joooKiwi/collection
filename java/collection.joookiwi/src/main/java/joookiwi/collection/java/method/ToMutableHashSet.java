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

    /// Convert the `collection` to a new mutable [HashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableHashSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, size));
    }

    /// Convert the `collection` to a new mutable [HashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return new MutableHashSet<>();
        if (collection.isEmpty())
            return new MutableHashSet<>();
        if (collection.hasDuplicate())
            return new MutableHashSet<>(_uniqueValues(collection, collection.size()));
        return new MutableHashSet<>(_values(collection, collection.size()));
    }

    /// Convert the `collection` to a new mutable [HashSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> HashSet<T> toMutableHashSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return new MutableHashSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();
        if (collection.isEmpty())
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
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

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, size, transform));
    }

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();
        if (collection.isEmpty())
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, collection.size(), transform));
    }

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection, size, transform));
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();

        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(size, transform));
    }

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();
        if (collection.isEmpty())
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(collection.size(), transform));
    }

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>();

        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>();
        return new MutableHashSet<>(_uniqueValues(size, transform));
    }

    //#endregion -------------------- () → U --------------------

    //#region -------------------- initialCapacity --------------------

    /// Convert the `collection` to a new mutable [HashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                           final int initialCapacity) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity);

        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, size), initialCapacity);
    }

    /// Convert the `collection` to a new mutable [HashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                           final int initialCapacity) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity);
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity);
        if (collection.hasDuplicate())
            return new MutableHashSet<>(_uniqueValues(collection, collection.size()), initialCapacity);
        return new MutableHashSet<>(_values(collection, collection.size()), initialCapacity);
    }

    /// Convert the `collection` to a new mutable [HashSet]
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> HashSet<T> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                           final int initialCapacity) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity);

        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, size), initialCapacity);
    }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- initialCapacity, (T, int) → U --------------------

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final int initialCapacity,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity);

        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity);
    }

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final int initialCapacity,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity);
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, collection.size(), transform), initialCapacity);
    }

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final int initialCapacity,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity);

        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity);
    }

    //#endregion -------------------- initialCapacity, (T, int) → U --------------------
    //#region -------------------- initialCapacity, (T) → U --------------------

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final int initialCapacity,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity);

        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity);
    }

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final int initialCapacity,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity);
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, collection.size(), transform), initialCapacity);
    }

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final int initialCapacity,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity);

        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity);
    }

    //#endregion -------------------- initialCapacity, (T) → U --------------------
    //#region -------------------- initialCapacity, () → U --------------------

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final int initialCapacity,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity);

        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(size, transform), initialCapacity);
    }

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final int initialCapacity,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity);
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(collection.size(), transform), initialCapacity);
    }

    /// Convert the `collection` to a new mutable [HashSet]
    /// applying a transformation
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param transform       The given transform
    /// @param <T>             The `collection` type
    /// @param <U>             The new type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final int initialCapacity,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity);

        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity);
        return new MutableHashSet<>(_uniqueValues(size, transform), initialCapacity);
    }

    //#endregion -------------------- initialCapacity, () → U --------------------

    //#region -------------------- initialCapacity, loadFactor --------------------

    /// Convert the `collection` to a new mutable [HashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][MinimalistCollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                           final int initialCapacity,
                                                                           final float loadFactor) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity, loadFactor);

        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, size), initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new mutable [HashSet]
    ///
    /// @param collection      The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the <code>collection.[size][CollectionHolder#size()]</code>)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                           final int initialCapacity,
                                                                           final float loadFactor) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity, loadFactor);
        if (collection.hasDuplicate())
            return new MutableHashSet<>(_uniqueValues(collection, collection.size()), initialCapacity, loadFactor);
        return new MutableHashSet<>(_values(collection, collection.size()), initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new mutable [HashSet]
    ///
    /// @param collection      The [nullable][Nullable] collection to convert
    /// @param initialCapacity The [HashSet] initial capacity (if it over the `collection.length`)
    /// @param loadFactor      The [HashSet] load factor
    /// @param <T>             The `collection` type
    @ExtensionFunction
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> HashSet<T> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                           final int initialCapacity,
                                                                           final float loadFactor) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity, loadFactor);

        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, size), initialCapacity, loadFactor);
    }

    //#endregion -------------------- initialCapacity, loadFactor --------------------
    //#region -------------------- initialCapacity, loadFactor, (T, int) → U --------------------

    /// Convert the `collection` to a new mutable [HashSet]
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
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final int initialCapacity,
                                                                                                       final float loadFactor,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity, loadFactor);

        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new mutable [HashSet]
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
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final int initialCapacity,
                                                                                                       final float loadFactor,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, collection.size(), transform), initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new mutable [HashSet]
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
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final int initialCapacity,
                                                                                                       final float loadFactor,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity, loadFactor);

        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity, loadFactor);
    }

    //#endregion -------------------- initialCapacity, loadFactor, (T, int) → U --------------------
    //#region -------------------- initialCapacity, loadFactor, (T) → U --------------------

    /// Convert the `collection` to a new mutable [HashSet]
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
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final int initialCapacity,
                                                                                                       final float loadFactor,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity, loadFactor);

        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new mutable [HashSet]
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
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final int initialCapacity,
                                                                                                       final float loadFactor,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, collection.size(), transform), initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new mutable [HashSet]
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
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final int initialCapacity,
                                                                                                       final float loadFactor,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity, loadFactor);

        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection, size, transform), initialCapacity, loadFactor);
    }

    //#endregion -------------------- initialCapacity, loadFactor, (T) → U --------------------
    //#region -------------------- initialCapacity, loadFactor, () → U --------------------

    /// Convert the `collection` to a new mutable [HashSet]
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
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final int initialCapacity,
                                                                                                       final float loadFactor,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity, loadFactor);

        final var size = collection.size();
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(size, transform), initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new mutable [HashSet]
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
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                       final int initialCapacity,
                                                                                                       final float loadFactor,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        if (collection.isEmpty())
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(collection.size(), transform), initialCapacity, loadFactor);
    }

    /// Convert the `collection` to a new mutable [HashSet]
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
    public static <T extends @Nullable Object, U extends @Nullable Object> HashSet<U> toMutableHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                       final int initialCapacity,
                                                                                                       final float loadFactor,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection == null)
            return new MutableHashSet<>(initialCapacity, loadFactor);

        final var size = collection.length;
        if (size == 0)
            return new MutableHashSet<>(initialCapacity, loadFactor);
        return new MutableHashSet<>(_uniqueValues(size, transform), initialCapacity, loadFactor);
    }

    //#endregion -------------------- initialCapacity, loadFactor, () → U --------------------

    //#endregion -------------------- Facade methods --------------------

}
