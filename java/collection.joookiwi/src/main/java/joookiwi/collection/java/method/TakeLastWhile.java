package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class TakeLastWhile
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private TakeLastWhile() { throw new ImpossibleConstructionException("The utility class “TakeLastWhile” cannot be constructed.", TakeLastWhile.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Get a new [CollectionHolder] having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html">Kotlin takeLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeLastWhile(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                 final ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with2Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder] having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html">Kotlin takeLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeLastWhile(final @Nullable CollectionHolder<? extends T> collection,
                                                                                          final ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with2Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder] having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html">Kotlin takeLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeLastWhile(final T @Nullable @Unmodifiable [] collection,
                                                                                 final ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with2Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Get a new [CollectionHolder] having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html">Kotlin takeLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeLastWhile(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                 final Predicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with1Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder] having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html">Kotlin takeLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeLastWhile(final @Nullable CollectionHolder<? extends T> collection,
                                                                                 final Predicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with1Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder] having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html">Kotlin takeLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeLastWhile(final T @Nullable @Unmodifiable [] collection,
                                                                                 final Predicate<? super T> predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with1Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get a new [CollectionHolder] having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html">Kotlin takeLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeLastWhile(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                 final BooleanSupplier predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with0Argument(collection, predicate, size));
    }

    /// Get a new [CollectionHolder] having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html">Kotlin takeLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeLastWhile(final @Nullable CollectionHolder<? extends T> collection,
                                                                                 final BooleanSupplier predicate) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with0Argument(collection, predicate, collection.size()));
    }

    /// Get a new [CollectionHolder] having the last elements satisfying the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html">Kotlin takeLastWhile(predicate)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> takeLastWhile(final T @Nullable @Unmodifiable [] collection,
                                                                                 final BooleanSupplier predicate) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with0Argument(collection, predicate, size));
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    @SuppressWarnings("unchecked cast")
    private static <T extends @Nullable Object> T @Unmodifiable [] __with0Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final BooleanSupplier predicate,
                                                                                   final int size) {
        var index = size;
        while (--index >= 0)
            if (!predicate.getAsBoolean()) {
                final var newSize = size - index - 1;
                if (newSize == 0)
                    return emptyArray();
                if (newSize == 1)
                    return (T[]) new @Nullable Object[]{collection.get(index + 1)};

                final var newArrayFromIndexToLast = (T[]) new Object[newSize];
                var indexAdded = 0;
                while (++index < size)
                    newArrayFromIndexToLast[indexAdded++] = collection.get(index);
                return newArrayFromIndexToLast;
            }

        final var newArray = (T[]) new Object[size];
        while (++index < size)
            newArray[index] = collection.get(index);
        return newArray;
    }

    @SuppressWarnings("unchecked cast")
    private static <T extends @Nullable Object> T @Unmodifiable [] __with0Argument(final T @Unmodifiable [] collection,
                                                                                   final BooleanSupplier predicate,
                                                                                   final int size) {
        var index = size;
        while (--index >= 0)
            if (!predicate.getAsBoolean()) {
                final var newSize = size - index - 1;
                if (newSize == 0)
                    return emptyArray();
                if (newSize == 1)
                    return (T[]) new @Nullable Object[]{collection[index + 1]};

                final var newArrayFromIndexToLast = (T[]) new Object[newSize];
                var indexAdded = 0;
                while (++index < size)
                    newArrayFromIndexToLast[indexAdded++] = collection[index];
                return newArrayFromIndexToLast;
            }
        return collection;
    }


    @SuppressWarnings("unchecked cast")
    private static <T extends @Nullable Object> T @Unmodifiable [] __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final Predicate<? super T> predicate,
                                                                                   final int size) {
        final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            if (!predicate.test(newArray[index] = collection.get(index))) {
                final var newSize = size - index - 1;
                if (newSize == 0)
                    return emptyArray();
                if (newSize == 1)
                    return (T[]) new @Nullable Object[]{newArray[index + 1]};

                final var newArrayFromIndexToLast = (T[]) new Object[newSize];
                var indexAdded = 0;
                while (++index < size)
                    newArrayFromIndexToLast[indexAdded++] = newArray[index];
                return newArrayFromIndexToLast;
            }
        return newArray;
    }

    @SuppressWarnings("unchecked cast")
    private static <T extends @Nullable Object> T @Unmodifiable [] __with1Argument(final T @Unmodifiable [] collection,
                                                                                   final Predicate<? super T> predicate,
                                                                                   final int size) {
        final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            if (!predicate.test(newArray[index] = collection[index])) {
                final var newSize = size - index - 1;
                if (newSize == 0)
                    return emptyArray();
                if (newSize == 1)
                    return (T[]) new @Nullable Object[]{newArray[index + 1]};

                final var newArrayFromIndexToLast = (T[]) new Object[newSize];
                var indexAdded = 0;
                while (++index < size)
                    newArrayFromIndexToLast[indexAdded++] = newArray[index];
                return newArrayFromIndexToLast;
            }
        return newArray;
    }


    @SuppressWarnings("unchecked cast")
    private static <T extends @Nullable Object> T @Unmodifiable [] __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final ObjIntPredicate<? super T> predicate,
                                                                                   final int size) {
        final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            if (!predicate.test(newArray[index] = collection.get(index), index)) {
                final var newSize = size - index - 1;
                if (newSize == 0)
                    return emptyArray();
                if (newSize == 1)
                    return (T[]) new @Nullable Object[]{newArray[index + 1]};

                final var newArrayFromIndexToLast = (T[]) new Object[newSize];
                var indexAdded = 0;
                while (++index < size)
                    newArrayFromIndexToLast[indexAdded++] = newArray[index];
                return newArrayFromIndexToLast;
            }
        return newArray;
    }

    @SuppressWarnings("unchecked cast")
    private static <T extends @Nullable Object> T @Unmodifiable [] __with2Argument(final T @Unmodifiable [] collection,
                                                                                   final ObjIntPredicate<? super T> predicate,
                                                                                   final int size) {
        final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            if (!predicate.test(newArray[index] = collection[index], index)) {
                final var newSize = size - index - 1;
                if (newSize == 0)
                    return emptyArray();
                if (newSize == 1)
                    return (T[]) new @Nullable Object[]{newArray[index + 1]};

                final var newArrayFromIndexToLast = (T[]) new Object[newSize];
                var indexAdded = 0;
                while (++index < size)
                    newArrayFromIndexToLast[indexAdded++] = newArray[index];
                return newArrayFromIndexToLast;
            }
        return newArray;
    }

    //#endregion -------------------- Loop methods --------------------

}
