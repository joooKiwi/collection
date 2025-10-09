package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.EmptyCollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class TakeLast
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private TakeLast() { throw new ImpossibleConstructionException("The utility class “TakeLast” cannot be constructed.", TakeLast.class); }

    //#region -------------------- Facade methods --------------------

    /// Get a new [CollectionHolder] from the last `n` elements
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param n          The number of arguments (if negative, then it is plus [size][MinimalistCollectionHolder#size])
    /// @param <T>        The `collection` and `element` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html">Kotlin takeLast(n)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> takeLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                     final int n) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection, n);
    }

    /// Get a new [CollectionHolder] from the last `n` elements
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param n          The number of arguments (if negative, then it is plus [size][CollectionHolder#size])
    /// @param <T>        The `collection` and `element` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html">Kotlin takeLast(n)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> takeLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                            final int n) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection, n);
    }

    /// Get a new [CollectionHolder] from the last `n` elements
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param n          The number of arguments (if negative, then it is plus `size`)
    /// @param <T>        The `collection` and `element` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html">Kotlin takeLast(n)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> takeLast(final T @Nullable @Unmodifiable [] collection,
                                                                            final int n) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection, n);
    }


    /// Get a new [CollectionHolder] from the last `n` elements
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param n          The number of arguments (if negative, then it is plus [size][MinimalistCollectionHolder#size])
    /// @param <T>        The `collection` and `element` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html">Kotlin takeLast(n)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> takeLast(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                            final Integer n) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection, n);
    }

    /// Get a new [CollectionHolder] from the last `n` elements
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param n          The number of arguments (if negative, then it is plus [size][CollectionHolder#size])
    /// @param <T>        The `collection` and `element` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html">Kotlin takeLast(n)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> takeLast(final @Nullable CollectionHolder<? extends T> collection,
                                                                            final Integer n) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection, n);
    }

    /// Get a new [CollectionHolder] from the last `n` elements
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param n          The number of arguments (if negative, then it is plus `size`)
    /// @param <T>        The `collection` and `element` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html">Kotlin takeLast(n)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> takeLast(final T @Nullable @Unmodifiable [] collection,
                                                                            final Integer n) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection, n);
    }

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    @SuppressWarnings("unchecked cast")
    private static <T extends @Nullable Object> CollectionHolder<T> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                           final int n) {
        final var size = collection.size();
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        if (n == 0)
            return EmptyCollectionHolder.getInstance();
        if (n == 1)
            return new GenericCollectionHolder<>(() -> (T[]) new Object[]{collection.get(size - 1)});
        if (n > 0)
            if (n >= size)
                return new GenericCollectionHolder<>(collection);
            else
                return new GenericCollectionHolder<>(__getAll(collection, size, n));
        if (n <= -size)
            return EmptyCollectionHolder.getInstance();

        final var n2 = n + size;
        if (n2 == 1)
            return new GenericCollectionHolder<>(() -> (T[]) new Object[]{collection.get(size - 1)});
        return new GenericCollectionHolder<>(__getAll(collection, size, n2));
    }

    @SuppressWarnings("unchecked cast")
    private static <T extends @Nullable Object> CollectionHolder<T> __core(final CollectionHolder<? extends T> collection,
                                                                           final int n) {
        if (collection.isEmpty())
            return EmptyCollectionHolder.getInstance();
        if (n == 0)
            return EmptyCollectionHolder.getInstance();
        if (n == 1)
            return new GenericCollectionHolder<>(() -> (T[]) new Object[]{collection.getLast()});

        final var size = collection.size();
        if (n > 0)
            if (n >= size)
                return (CollectionHolder<T>) collection;
            else
                return new GenericCollectionHolder<>(__getAll(collection, size, n));
        if (n <= -size)
            return EmptyCollectionHolder.getInstance();

        final var n2 = n + size;
        if (n2 == 1)
            return new GenericCollectionHolder<>(() -> (T[]) new Object[]{collection.getLast()});
        return new GenericCollectionHolder<>(__getAll(collection, size, n2));
    }

    @SuppressWarnings("unchecked cast")
    private static <T extends @Nullable Object> CollectionHolder<T> __core(final T @Unmodifiable [] collection,
                                                                           final int n) {
        final var size = collection.length;
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        if (n == 0)
            return EmptyCollectionHolder.getInstance();
        if (n == 1)
            return new GenericCollectionHolder<>(() -> (T[]) new Object[]{collection[size - 1]});
        if (n > 0)
            if (n >= size)
                return new GenericCollectionHolder<>(collection);
            else
                return new GenericCollectionHolder<>(__getAll(collection, size, n));
        if (n <= -size)
            return EmptyCollectionHolder.getInstance();

        final var n2 = n + size;
        if (n2 == 1)
            return new GenericCollectionHolder<>(() -> (T[]) new Object[]{collection[size - 1]});
        return new GenericCollectionHolder<>(__getAll(collection, size, n2));
    }


    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> T @Unmodifiable [] __getAll(final MinimalistCollectionHolder<? extends T> collection,
                                                                            final int size,
                                                                            final int amount) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[amount];
        var indexAdded = -1;
        var index = size - amount - 1;
        while (++index < size)
            newArray[++indexAdded] = collection.get(index);
        return newArray;
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __getAll(final T @Unmodifiable [] collection,
                                                                            final int size,
                                                                            final int amount) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[amount];
        var indexAdded = -1;
        var index = size - amount - 1;
        while (++index < size)
            newArray[++indexAdded] = collection[index];
        return newArray;
    }

    //#endregion -------------------- Loop methods --------------------

}
