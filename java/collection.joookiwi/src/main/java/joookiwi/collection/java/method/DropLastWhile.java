package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

public final class DropLastWhile
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private DropLastWhile() { throw new ImpossibleConstructionException("The utility class “DropLastWhile” cannot be constructed.", DropLastWhile.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Get a new [CollectionHolder] **not** having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html">Kotlin dropLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLastWhile(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                          final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with2Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder] **not** having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html">Kotlin dropLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLastWhile(final @Nullable CollectionHolder<? extends T> collection,
                                                                                          final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with2Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder] **not** having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html">Kotlin dropLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLastWhile(final T @Nullable @Unmodifiable [] collection,
                                                                                          final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with2Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Get a new [CollectionHolder] **not** having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html">Kotlin dropLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLastWhile(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                          final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with1Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder] **not** having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html">Kotlin dropLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLastWhile(final @Nullable CollectionHolder<? extends T> collection,
                                                                                          final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with1Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder] **not** having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html">Kotlin dropLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLastWhile(final T @Nullable @Unmodifiable [] collection,
                                                                                          final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with1Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get a new [CollectionHolder] **not** having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html">Kotlin dropLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLastWhile(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                          final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with0Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder] **not** having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html">Kotlin dropLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLastWhile(final @Nullable CollectionHolder<? extends T> collection,
                                                                                          final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with0Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder] **not** having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html">Kotlin dropLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLastWhile(final T @Nullable @Unmodifiable [] collection,
                                                                                          final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with0Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __with0Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                            final int size) {
        var index = size;
        while (--index >= 0)
            if (!predicate.getAsBoolean()) {
                @SuppressWarnings("unchecked cast") final var newArrayFrom0ToIndex = (T[]) new Object[index + 1];
                var index2 = -1;
                while (++index2 <= index)
                    newArrayFrom0ToIndex[index2] = collection.get(index2);
                return newArrayFrom0ToIndex;
            }
        return emptyArray();
    }

    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __with0Argument(final T @NotNull @Unmodifiable [] collection,
                                                                                            final @NotNull BooleanSupplier predicate,
                                                                                            final int size) {
        var index = size;
        while (--index >= 0)
            if (!predicate.getAsBoolean()) {
                @SuppressWarnings("unchecked cast") final var newArrayFrom0ToIndex = (T[]) new Object[index + 1];
                var index2 = -1;
                while (++index2 <= index)
                    newArrayFrom0ToIndex[index2] = collection[index2];
                return newArrayFrom0ToIndex;
            }
        return emptyArray();
    }


    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull Predicate<? super T> predicate,
                                                                                            final int size) {
        var index = size;
        while (--index >= 0) {
            final var value = collection.get(index);
            if (!predicate.test(value)) {
                @SuppressWarnings("unchecked cast") final var newArrayFrom0ToIndex = (T[]) new Object[index + 1];
                newArrayFrom0ToIndex[index] = value;
                var index2 = -1;
                while (++index2 < index)
                    newArrayFrom0ToIndex[index2] = collection.get(index2);
                return newArrayFrom0ToIndex;
            }
        }
        return emptyArray();
    }

    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                                                            final @NotNull Predicate<? super T> predicate,
                                                                                            final int size) {
        var index = size;
        while (--index >= 0) {
            final var value = collection[index];
            if (!predicate.test(value)) {
                @SuppressWarnings("unchecked cast") final var newArrayFrom0ToIndex = (T[]) new Object[index + 1];
                newArrayFrom0ToIndex[index] = value;
                var index2 = -1;
                while (++index2 < index)
                    newArrayFrom0ToIndex[index2] = collection[index2];
                return newArrayFrom0ToIndex;
            }
        }
        return emptyArray();
    }


    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                            final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                            final int size) {
        var index = size;
        while (--index >= 0) {
            final var value = collection.get(index);
            if (!predicate.test(value, index)) {
                @SuppressWarnings("unchecked cast") final var newArrayFrom0ToIndex = (T[]) new Object[index + 1];
                newArrayFrom0ToIndex[index] = value;
                var index2 = -1;
                while (++index2 < index)
                    newArrayFrom0ToIndex[index2] = collection.get(index2);
                return newArrayFrom0ToIndex;
            }
        }
        return emptyArray();
    }

    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                                                            final @NotNull ObjIntPredicate<? super T> predicate,
                                                                                            final int size) {
        var index = size;
        while (--index >= 0) {
            final var value = collection[index];
            if (!predicate.test(value, index)) {
                @SuppressWarnings("unchecked cast") final var newArrayFrom0ToIndex = (T[]) new Object[index + 1];
                newArrayFrom0ToIndex[index] = value;
                var index2 = -1;
                while (++index2 < index)
                    newArrayFrom0ToIndex[index2] = collection[index2];
                return newArrayFrom0ToIndex;
            }
        }
        return emptyArray();
    }

    //#endregion -------------------- Loop methods --------------------

}
