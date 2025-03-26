package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class DropLast
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private DropLast() { throw new ImpossibleConstructionException("The utility class “DropLast” cannot be constructed.", DropLast.class); }

    //#region -------------------- Facade methods --------------------

    /// Get a new [CollectionHolder] without the last `n` elements
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param n          The number of arguments (if negative, then it is plus [size][MinimalistCollectionHolder#size])
    /// @param <T>        The `collection` and `element` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html">Kotlin dropLast(n)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLast(final @Nullable MinimalistCollectionHolder<T> collection,
                                                                                     final int n) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, n);
    }

    /// Get a new [CollectionHolder] without the last `n` elements
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param n          The number of arguments (if negative, then it is plus [size][CollectionHolder#size])
    /// @param <T>        The `collection` and `element` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html">Kotlin dropLast(n)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLast(final @Nullable CollectionHolder<T> collection,
                                                                                     final int n) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, n);
    }

    /// Get a new [CollectionHolder] without the last `n` elements
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param n          The number of arguments (if negative, then it is plus `size`)
    /// @param <T>        The `collection` and `element` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html">Kotlin dropLast(n)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLast(final T @Nullable @Unmodifiable [] collection,
                                                                                     final int n) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, n);
    }


    /// Get a new [CollectionHolder] without the last `n` elements
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param n          The number of arguments (if negative, then it is plus [size][MinimalistCollectionHolder#size])
    /// @param <T>        The `collection` and `element` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html">Kotlin dropLast(n)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLast(final @Nullable MinimalistCollectionHolder<T> collection,
                                                                                     final @NotNull Integer n) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, n);
    }

    /// Get a new [CollectionHolder] without the last `n` elements
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param n          The number of arguments (if negative, then it is plus [size][CollectionHolder#size])
    /// @param <T>        The `collection` and `element` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html">Kotlin dropLast(n)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLast(final @Nullable CollectionHolder<T> collection,
                                                                                     final @NotNull Integer n) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, n);
    }

    /// Get a new [CollectionHolder] without the last `n` elements
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param n          The number of arguments (if negative, then it is plus `size`)
    /// @param <T>        The `collection` and `element` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html">Kotlin dropLast(n)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> dropLast(final T @Nullable @Unmodifiable [] collection,
                                                                                     final @NotNull Integer n) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, n);
    }

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __core(final @NotNull MinimalistCollectionHolder<T> collection,
                                                                                    final int n) {
        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        if (n == 0)
            return new GenericCollectionHolder<>(() -> collection);

        final var sizeMinus1 = size - 1;
        if (n == sizeMinus1)
            return new GenericCollectionHolder<>(() -> (T[]) new Object[]{collection.get(0)});
        if (n > 0)
            if (n >= size)
                return emptyCollectionHolder();
            else
                return new GenericCollectionHolder<>(() -> __getAll(collection, size - n));
        if (n <= -size)
            return new GenericCollectionHolder<>(() -> collection);

        final var n2 = n + size;
        if (n2 == sizeMinus1)
            return new GenericCollectionHolder<>(() -> (T[]) new Object[]{collection.get(0)});
        return new GenericCollectionHolder<>(() -> __getAll(collection, size - n2));
    }

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __core(final @NotNull CollectionHolder<T> collection,
                                                                                    final int n) {
        if (collection.isEmpty())
            return emptyCollectionHolder();
        if (n == 0)
            return new GenericCollectionHolder<>(() -> collection);

        final var size = collection.size();
        final var sizeMinus1 = size - 1;
        if (n == sizeMinus1)
            return new GenericCollectionHolder<>(() -> (T[]) new Object[]{collection.getFirst()});
        if (n > 0)
            if (n >= size)
                return emptyCollectionHolder();
            else
                return new GenericCollectionHolder<>(() -> __getAll(collection, size - n));
        if (n <= -size)
            return new GenericCollectionHolder<>(() -> collection);

        final var n2 = n + size;
        if (n2 == sizeMinus1)
            return new GenericCollectionHolder<>(() -> (T[]) new Object[]{collection.getFirst()});
        return new GenericCollectionHolder<>(() -> __getAll(collection, size - n2));
    }

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __core(final T @NotNull @Unmodifiable [] collection,
                                                                                    final int n) {
        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        if (n == 0)
            return new GenericCollectionHolder<>(() -> collection);

        final var sizeMinus1 = size - 1;
        if (n == sizeMinus1)
            return new GenericCollectionHolder<>(() -> (T[]) new Object[]{collection[0]});
        if (n > 0)
            if (n >= size)
                return emptyCollectionHolder();
            else
                return new GenericCollectionHolder<>(() -> __getAll(collection, size - n));
        if (n <= -size)
            return new GenericCollectionHolder<>(() -> collection);

        final var n2 = n + size;
        if (n2 == sizeMinus1)
            return new GenericCollectionHolder<>(() -> (T[]) new Object[]{collection[0]});
        return new GenericCollectionHolder<>(() -> __getAll(collection, size - n2));
    }


    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __getAll(final @NotNull MinimalistCollectionHolder<T> collection,
                                                                                     final int amount) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[amount];
        var index = -1;
        while (++index < amount)
            newArray[index] = collection.get(index);
        return newArray;
    }

    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __getAll(final T @NotNull @Unmodifiable [] collection,
                                                                                     final int amount) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[amount];
        var index = -1;
        while (++index < amount)
            newArray[index] = collection[index];
        return newArray;
    }

    //#endregion -------------------- Loop methods --------------------

}
