package joookiwi.collection.java.method;

import java.util.HashSet;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ImmutableHashSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyHashSet;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToHashSet
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToHashSet() { throw new ImpossibleConstructionException("The utility class “ToHashSet” cannot be constructed.", ToHashSet.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [ImmutableHashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableHashSet<T> toHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableHashSet<T> toHashSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableHashSet<T> toHashSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                         final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                         final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                         final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, transform);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                         final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                         final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                         final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, transform);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                         final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                         final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                         final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#region -------------------- loadFactor --------------------

    /// Convert the `collection` to an [ImmutableHashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableHashSet<T> toHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final float loadFactor) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, loadFactor);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableHashSet<T> toHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final float loadFactor) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, loadFactor);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableHashSet<T> toHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                             final float loadFactor) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, loadFactor);
    }


    /// Convert the `collection` to an [ImmutableHashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableHashSet<T> toHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final @Nullable Float loadFactor) {
        if (collection == null)
            return emptyHashSet();
        if (loadFactor == null)
            return __core(collection);
        return __core(collection, loadFactor);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableHashSet<T> toHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final @Nullable Float loadFactor) {
        if (collection == null)
            return emptyHashSet();
        if (loadFactor == null)
            return __core(collection);
        return __core(collection, loadFactor);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableHashSet<T> toHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                             final @Nullable Float loadFactor) {
        if (collection == null)
            return emptyHashSet();
        if (loadFactor == null)
            return __core(collection);
        return __core(collection, loadFactor);
    }

    //#endregion -------------------- loadFactor --------------------
    //#region -------------------- loadFactor, (T, int) → U --------------------

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                         final float loadFactor,
                                                                                                         final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                         final float loadFactor,
                                                                                                         final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                         final float loadFactor,
                                                                                                         final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, loadFactor, transform);
    }


    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                         final @Nullable Float loadFactor,
                                                                                                         final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        if (loadFactor == null)
            return __core(collection, transform);
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                         final @Nullable Float loadFactor,
                                                                                                         final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        if (loadFactor == null)
            return __core(collection, transform);
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                         final @Nullable Float loadFactor,
                                                                                                         final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        if (loadFactor == null)
            return __core(collection, transform);
        return __core(collection, loadFactor, transform);
    }

    //#endregion -------------------- loadFactor, (T, int) → U --------------------
    //#region -------------------- loadFactor, (T) → U --------------------

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                         final float loadFactor,
                                                                                                         final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                         final float loadFactor,
                                                                                                         final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                         final float loadFactor,
                                                                                                         final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                         final @Nullable Float loadFactor,
                                                                                                         final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        if (loadFactor == null)
            return __core(collection, transform);
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                         final @Nullable Float loadFactor,
                                                                                                         final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        if (loadFactor == null)
            return __core(collection, transform);
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                         final @Nullable Float loadFactor,
                                                                                                         final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        if (loadFactor == null)
            return __core(collection, transform);
        return __core(collection, loadFactor, transform);
    }

    //#endregion -------------------- loadFactor, (T) → U --------------------
    //#region -------------------- loadFactor, () → U --------------------

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                         final float loadFactor,
                                                                                                         final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                         final float loadFactor,
                                                                                                         final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                         final float loadFactor,
                                                                                                         final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                         final @Nullable Float loadFactor,
                                                                                                         final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        if (loadFactor == null)
            return __core(collection, transform);
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                         final @Nullable Float loadFactor,
                                                                                                         final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        if (loadFactor == null)
            return __core(collection, transform);
        return __core(collection, loadFactor, transform);
    }

    /// Convert the `collection` to an [ImmutableHashSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param loadFactor The [HashSet] load factor
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final T @Nullable @Unmodifiable [] collection,
                                                                                                         final @Nullable Float loadFactor,
                                                                                                         final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyHashSet();
        if (loadFactor == null)
            return __core(collection, transform);
        return __core(collection, loadFactor, transform);
    }

    //#endregion -------------------- loadFactor, () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- ∅ --------------------

    private static <T extends @Nullable Object> ImmutableHashSet<T> __core(final MinimalistCollectionHolder<? extends T> collection) {
        final var size = collection.size();
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, size));
    }

    private static <T extends @Nullable Object> ImmutableHashSet<T> __core(final CollectionHolder<? extends T> collection) {
        if (collection.isEmpty())
            return emptyHashSet();
        if (collection.hasDuplicate())
            return new ImmutableHashSet<>(_values(collection, collection.size()));
        return new ImmutableHashSet<>(_uniqueValues(collection, collection.size()));
    }

    private static <T extends @Nullable Object> ImmutableHashSet<T> __core(final T @Unmodifiable [] collection) {
        final var size = collection.length;
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- transform --------------------

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, size, transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, collection.size(), transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, size, transform));
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Function<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, size, transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, collection.size(), transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                       final Function<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, size, transform));
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final Supplier<? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(size, transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection.isEmpty())
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection.size(), transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                       final Supplier<? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(size, transform));
    }

    //#endregion -------------------- transform --------------------
    //#region -------------------- loadFactor --------------------

    private static <T extends @Nullable Object> ImmutableHashSet<T> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                           final float loadFactor) {
        final var size = collection.size();
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, size), loadFactor);
    }

    private static <T extends @Nullable Object> ImmutableHashSet<T> __core(final CollectionHolder<? extends T> collection,
                                                                           final float loadFactor) {
        if (collection.isEmpty())
            return emptyHashSet();
        if (collection.hasDuplicate())
            return new ImmutableHashSet<>(_values(collection, collection.size()), loadFactor);
        return new ImmutableHashSet<>(_uniqueValues(collection, collection.size()), loadFactor);
    }

    private static <T extends @Nullable Object> ImmutableHashSet<T> __core(final T @Unmodifiable [] collection,
                                                                           final float loadFactor) {
        final var size = collection.length;
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, size), loadFactor);
    }

    //#endregion -------------------- loadFactor --------------------
    //#region -------------------- transform, loadFactor --------------------

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final float loadFactor,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, size, transform), loadFactor);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                       final float loadFactor,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, collection.size(), transform), loadFactor);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                       final float loadFactor,
                                                                                                       final ObjIntFunction<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, size, transform), loadFactor);
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final float loadFactor,
                                                                                                       final Function<? super T, ? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, size, transform), loadFactor);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                       final float loadFactor,
                                                                                                       final Function<? super T, ? extends U> transform) {
        if (collection.isEmpty())
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, collection.size(), transform), loadFactor);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                       final float loadFactor,
                                                                                                       final Function<? super T, ? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection, size, transform), loadFactor);
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final float loadFactor,
                                                                                                       final Supplier<? extends U> transform) {
        final var size = collection.size();
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(size, transform), loadFactor);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final CollectionHolder<? extends T> collection,
                                                                                                       final float loadFactor,
                                                                                                       final Supplier<? extends U> transform) {
        if (collection.isEmpty())
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(collection.size(), transform), loadFactor);
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> ImmutableHashSet<U> __core(final T @Unmodifiable [] collection,
                                                                                                       final float loadFactor,
                                                                                                       final Supplier<? extends U> transform) {
        final var size = collection.length;
        if (size == 0)
            return emptyHashSet();
        return new ImmutableHashSet<>(_uniqueValues(size, transform), loadFactor);
    }

    //#endregion -------------------- transform, loadFactor --------------------

    //#endregion -------------------- Core methods --------------------

}
