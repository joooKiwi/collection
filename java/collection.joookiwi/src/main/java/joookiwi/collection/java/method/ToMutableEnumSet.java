package joookiwi.collection.java.method;

import java.util.EnumSet;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.NullCollectionException;
import joookiwi.collection.java.extended.ArrayAsCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_2;

@NotNullByDefault
public final class ToMutableEnumSet
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMutableEnumSet() { throw new ImpossibleConstructionException("The utility class “ToMutableEnumSet” cannot be constructed.", ToMutableEnumSet.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **was empty**
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_1)
    @ExtensionFunction
    public static <T extends Enum<T>> EnumSet<T> toMutableEnumSet(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            throw new NullCollectionException(NullCollectionException.DEFAULT_CONVERSION_MESSAGE);

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException(EmptyCollectionException.DEFAULT_CONVERSION_MESSAGE);
        return __withNoTransform(collection, size);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` [was empty][CollectionHolder#isEmpty]
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_1)
    @ExtensionFunction
    public static <T extends Enum<T>> EnumSet<T> toMutableEnumSet(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            throw new NullCollectionException(NullCollectionException.DEFAULT_CONVERSION_MESSAGE);
        if (collection.isEmpty())
            throw new EmptyCollectionException(EmptyCollectionException.DEFAULT_CONVERSION_MESSAGE);
        if (collection.hasDuplicate())
            return __withNoDuplicate(collection, collection.size());
        return __withNoTransform(collection, collection.size());
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **was empty**
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_1)
    @ExtensionFunction
    public static <T extends Enum<T>> EnumSet<T> toMutableEnumSet(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            throw new NullCollectionException(NullCollectionException.DEFAULT_CONVERSION_MESSAGE);

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException(EmptyCollectionException.DEFAULT_CONVERSION_MESSAGE);
        return __withNoTransform(collection, size);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **was empty**
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_2)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            throw new NullCollectionException(NullCollectionException.DEFAULT_CONVERSION_MESSAGE);

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException(EmptyCollectionException.DEFAULT_CONVERSION_MESSAGE);
        return __with2Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` [was empty][CollectionHolder#isEmpty]
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_2)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            throw new NullCollectionException(NullCollectionException.DEFAULT_CONVERSION_MESSAGE);
        if (collection.isEmpty())
            throw new EmptyCollectionException(EmptyCollectionException.DEFAULT_CONVERSION_MESSAGE);
        return __with2Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **was empty**
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_2)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final T @Nullable @Unmodifiable [] collection,
                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            throw new NullCollectionException(NullCollectionException.DEFAULT_CONVERSION_MESSAGE);

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException(EmptyCollectionException.DEFAULT_CONVERSION_MESSAGE);
        return __with2Argument(collection, size, transform);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **was empty**
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_2)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            throw new NullCollectionException(NullCollectionException.DEFAULT_CONVERSION_MESSAGE);

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException(EmptyCollectionException.DEFAULT_CONVERSION_MESSAGE);
        return __with1Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` [was empty][CollectionHolder#isEmpty]
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_2)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            throw new NullCollectionException(NullCollectionException.DEFAULT_CONVERSION_MESSAGE);
        if (collection.isEmpty())
            throw new EmptyCollectionException(EmptyCollectionException.DEFAULT_CONVERSION_MESSAGE);
        return __with1Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **was empty**
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_2)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final T @Nullable @Unmodifiable [] collection,
                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            throw new NullCollectionException(NullCollectionException.DEFAULT_CONVERSION_MESSAGE);

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException(EmptyCollectionException.DEFAULT_CONVERSION_MESSAGE);
        return __with1Argument(collection, size, transform);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **was empty**
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_2)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            throw new NullCollectionException(NullCollectionException.DEFAULT_CONVERSION_MESSAGE);

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionException(EmptyCollectionException.DEFAULT_CONVERSION_MESSAGE);
        return __with0Argument(size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` [was empty][CollectionHolder#isEmpty]
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_2)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            throw new NullCollectionException(NullCollectionException.DEFAULT_CONVERSION_MESSAGE);
        if (collection.isEmpty())
            throw new EmptyCollectionException(EmptyCollectionException.DEFAULT_CONVERSION_MESSAGE);
        return __with0Argument(collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **was empty**
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_NEW_2)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final T @Nullable @Unmodifiable [] collection,
                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            throw new NullCollectionException(NullCollectionException.DEFAULT_CONVERSION_MESSAGE);

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException(EmptyCollectionException.DEFAULT_CONVERSION_MESSAGE);
        return __with0Argument(size, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#region -------------------- Class<T> --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param clazz      The enum class type if the `collection` is `null` or empty
    /// @param <T>        The `collection` type
    @Contract(ALWAYS_NEW_2)
    @ExtensionFunction
    public static <T extends Enum<T>> EnumSet<T> toMutableEnumSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                  final Class<T> clazz) {
        if (collection == null)
            return __empty(clazz);

        final var size = collection.size();
        if (size == 0)
            return __empty(clazz);
        return __withNoTransform(collection, size);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param clazz      The enum class type if the `collection` is `null` or [empty][CollectionHolder#isEmpty]
    /// @param <T>        The `collection` type
    @Contract(ALWAYS_NEW_2)
    @ExtensionFunction
    public static <T extends Enum<T>> EnumSet<T> toMutableEnumSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                  final Class<T> clazz) {
        if (collection == null)
            return __empty(clazz);
        if (collection.isEmpty())
            return __empty(clazz);
        if (collection.hasDuplicate())
            return __withNoDuplicate(collection, collection.size());
        return __withNoTransform(collection, collection.size());
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param clazz      The enum class type if the `collection` is `null` or empty
    /// @param <T>        The `collection` type
    @Contract(ALWAYS_NEW_2)
    @ExtensionFunction
    public static <T extends Enum<T>> EnumSet<T> toMutableEnumSet(final T @Nullable @Unmodifiable [] collection,
                                                                  final Class<T> clazz) {
        if (collection == null)
            return __empty(clazz);

        final var size = collection.length;
        if (size == 0)
            return __empty(clazz);
        return __withNoTransform(collection, size);
    }

    //#endregion -------------------- Class<T> --------------------
    //#region -------------------- Class<U>, (T, int) → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param clazz      The enum class type if the `collection` is `null` or empty
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @Contract(ALWAYS_NEW_3)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                              final Class<U> clazz,
                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(clazz);

        final var size = collection.size();
        if (size == 0)
            return __empty(clazz);
        return __with2Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param clazz      The enum class type if the `collection` is `null` or [empty][CollectionHolder#isEmpty]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @Contract(ALWAYS_NEW_3)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                              final Class<U> clazz,
                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(clazz);
        if (collection.isEmpty())
            return __empty(clazz);
        return __with2Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param clazz      The enum class type if the `collection` is `null` or empty
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @Contract(ALWAYS_NEW_3)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final T @Nullable @Unmodifiable [] collection,
                                                                                              final Class<U> clazz,
                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(clazz);

        final var size = collection.length;
        if (size == 0)
            return __empty(clazz);
        return __with2Argument(collection, size, transform);
    }

    //#endregion -------------------- Class<U>, (T, int) → U --------------------
    //#region -------------------- Class<U>, (T) → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param clazz      The enum class type if the `collection` is `null` or empty
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @Contract(ALWAYS_NEW_3)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                              final Class<U> clazz,
                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(clazz);

        final var size = collection.size();
        if (size == 0)
            return __empty(clazz);
        return __with1Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param clazz      The enum class type if the `collection` is `null` or [empty][CollectionHolder#isEmpty]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @Contract(ALWAYS_NEW_3)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                              final Class<U> clazz,
                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(clazz);
        if (collection.isEmpty())
            return __empty(clazz);
        return __with1Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param clazz      The enum class type if the `collection` is `null` or empty
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @Contract(ALWAYS_NEW_3)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final T @Nullable @Unmodifiable [] collection,
                                                                                              final Class<U> clazz,
                                                                                              final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return __empty(clazz);

        final var size = collection.length;
        if (size == 0)
            return __empty(clazz);
        return __with1Argument(collection, size, transform);
    }

    //#endregion -------------------- Class<U>, (T) → U --------------------
    //#region -------------------- Class<U>, () → U --------------------

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder] to convert
    /// @param clazz      The enum class type if the `collection` is `null` or empty
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @Contract(ALWAYS_NEW_3)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                              final Class<U> clazz,
                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(clazz);

        final var size = collection.size();
        if (size == 0)
            return __empty(clazz);
        return __with0Argument(size, transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder] to convert
    /// @param clazz      The enum class type if the `collection` is `null` or [empty][CollectionHolder#isEmpty]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @Contract(ALWAYS_NEW_3)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final @Nullable CollectionHolder<? extends T> collection,
                                                                                              final Class<U> clazz,
                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(clazz);
        if (collection.isEmpty())
            return __empty(clazz);
        return __with0Argument(collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable-like][Unmodifiable] [EnumSet]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection to convert
    /// @param clazz      The enum class type if the `collection` is `null` or empty
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @Contract(ALWAYS_NEW_3)
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> toMutableEnumSet(final T @Nullable @Unmodifiable [] collection,
                                                                                              final Class<U> clazz,
                                                                                              final Supplier<? extends U> transform) {
        if (collection == null)
            return __empty(clazz);

        final var size = collection.length;
        if (size == 0)
            return __empty(clazz);
        return __with0Argument(size, transform);
    }

    //#endregion -------------------- Class<U>, () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends Enum<T>> EnumSet<T> __empty(final Class<T> clazz) {
        return EnumSet.noneOf(clazz);
    }


    private static <T extends Enum<T>> EnumSet<T> __withNoDuplicate(final CollectionHolder<? extends T> collection,
                                                                    final int size) {
        return EnumSet.copyOf(new ArrayAsCollection<>(_uniqueValues(collection, size)));
    }


    private static <T extends Enum<T>> EnumSet<T> __withNoTransform(final MinimalistCollectionHolder<? extends T> collection,
                                                                    final int size) {
        return EnumSet.copyOf(new ArrayAsCollection<>(_values(collection, size)));
    }

    private static <T extends Enum<T>> EnumSet<T> __withNoTransform(final T @Unmodifiable [] collection,
                                                                    final int size) {
        return EnumSet.copyOf(new ArrayAsCollection<>(_values(collection, size)));
    }


    private static <U extends Enum<U>> EnumSet<U> __with0Argument(final int size,
                                                                  final Supplier<? extends U> transform) {
        return EnumSet.copyOf(new ArrayAsCollection<>(_uniqueValues(size, transform)));
    }


    private static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                              final int size,
                                                                                              final Function<? super T, ? extends U> transform) {
        return EnumSet.copyOf(new ArrayAsCollection<>(_uniqueValues(collection, size, transform)));
    }

    private static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> __with1Argument(final T @Unmodifiable [] collection,
                                                                                              final int size,
                                                                                              final Function<? super T, ? extends U> transform) {
        return EnumSet.copyOf(new ArrayAsCollection<>(_uniqueValues(collection, size, transform)));
    }


    private static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> __with2Argument(final MinimalistCollectionHolder<? extends T> collection, int size,
                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        return EnumSet.copyOf(new ArrayAsCollection<>(_uniqueValues(collection, size, transform)));
    }

    private static <T extends @Nullable Object, U extends Enum<U>> EnumSet<U> __with2Argument(final T @Unmodifiable [] collection, int size,
                                                                                              final ObjIntFunction<? super T, ? extends U> transform) {
        return EnumSet.copyOf(new ArrayAsCollection<>(_uniqueValues(collection, size, transform)));
    }

    //#endregion -------------------- Loop methods --------------------

}
