package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.IntPredicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class DropLastWhileIndexed
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private DropLastWhileIndexed() { throw new ImpossibleConstructionException("The utility class “DropLastWhileIndexed” cannot be constructed.", DropLastWhileIndexed.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (int, T) → boolean --------------------

    /// Get a new [CollectionHolder] **not** having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html">Kotlin dropLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> dropLastWhileIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                        final IntObjPredicate<? super T> predicate) {
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
    public static <T extends @Nullable Object> CollectionHolder<T> dropLastWhileIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                        final IntObjPredicate<? super T> predicate) {
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
    public static <T extends @Nullable Object> CollectionHolder<T> dropLastWhileIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                        final IntObjPredicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with2Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate (int, T) → boolean --------------------
    //#region -------------------- predicate (int) → boolean --------------------

    /// Get a new [CollectionHolder] **not** having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html">Kotlin dropLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> dropLastWhileIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                        final IntPredicate predicate) {
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
    public static <T extends @Nullable Object> CollectionHolder<T> dropLastWhileIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                        final IntPredicate predicate) {
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
    public static <T extends @Nullable Object> CollectionHolder<T> dropLastWhileIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                        final IntPredicate predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __with1Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate (int) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get a new [CollectionHolder] **not** having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html">Kotlin dropLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> dropLastWhileIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                        final BooleanSupplier predicate) {
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
    public static <T extends @Nullable Object> CollectionHolder<T> dropLastWhileIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                                                                        final BooleanSupplier predicate) {
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
    public static <T extends @Nullable Object> CollectionHolder<T> dropLastWhileIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                                        final BooleanSupplier predicate) {
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

    private static <T extends @Nullable Object> T @Unmodifiable [] __with0Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final BooleanSupplier predicate,
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

    private static <T extends @Nullable Object> T @Unmodifiable [] __with0Argument(final T @Unmodifiable [] collection,
                                                                                   final BooleanSupplier predicate,
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


    private static <T extends @Nullable Object> T @Unmodifiable [] __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final IntPredicate predicate,
                                                                                   final int size) {
        var index = size;
        while (--index >= 0)
            if (!predicate.test(index)) {
                @SuppressWarnings("unchecked cast") final var newArrayFrom0ToIndex = (T[]) new Object[index + 1];
                var index2 = -1;
                while (++index2 <= index)
                    newArrayFrom0ToIndex[index2] = collection.get(index2);
                return newArrayFrom0ToIndex;
            }
        return emptyArray();
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __with1Argument(final T @Unmodifiable [] collection,
                                                                                   final IntPredicate predicate,
                                                                                   final int size) {
        var index = size;
        while (--index >= 0)
            if (!predicate.test(index)) {
                @SuppressWarnings("unchecked cast") final var newArrayFrom0ToIndex = (T[]) new Object[index + 1];
                var index2 = -1;
                while (++index2 <= index)
                    newArrayFrom0ToIndex[index2] = collection[index2];
                return newArrayFrom0ToIndex;
            }
        return emptyArray();
    }


    private static <T extends @Nullable Object> T @Unmodifiable [] __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final IntObjPredicate<? super T> predicate,
                                                                                   final int size) {
        var index = size;
        while (--index >= 0) {
            final var value = collection.get(index);
            if (!predicate.test(index, value)) {
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

    private static <T extends @Nullable Object> T @Unmodifiable [] __with2Argument(final T @Unmodifiable [] collection,
                                                                                   final IntObjPredicate<? super T> predicate,
                                                                                   final int size) {
        var index = size;
        while (--index >= 0) {
            final var value = collection[index];
            if (!predicate.test(index, value)) {
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
