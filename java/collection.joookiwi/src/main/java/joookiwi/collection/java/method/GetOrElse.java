package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import java.util.function.IntFunction;
import java.util.function.Supplier;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class GetOrElse
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private GetOrElse() { throw new ImpossibleConstructionException("The utility class “GetOrElse” cannot be constructed.", GetOrElse.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (int) → boolean --------------------

    /// Get the element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param index        The index to retrieve a value
    /// @param defaultValue The callback to retrieve the default value if it is over the [size][MinimalistCollectionHolder#size] (after calculation)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html">Kotlin getOrElse(key, defaultValue)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html">Kotlin elementAtOrElse(key, defaultValue)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> T getOrElse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                  final int index,
                                  final @NotNull IntFunction<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.apply(index);

        final var size = collection.size();
        if (size == 0)
            return defaultValue.apply(index);
        if (index >= size)
            return defaultValue.apply(index);
        if (index >= 0)
            return collection.get(index);

        final var indexToRetrieve = index + size;
        if (indexToRetrieve < 0)
            return defaultValue.apply(index);
        return collection.get(indexToRetrieve);
    }

    /// Get the element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] [collection][CollectionHolder]
    /// @param index        The index to retrieve a value
    /// @param defaultValue The callback to retrieve the default value if it is over the [size][CollectionHolder#size] (after calculation)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html">Kotlin getOrElse(key, defaultValue)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html">Kotlin elementAtOrElse(key, defaultValue)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> T getOrElse(final @Nullable CollectionHolder<? extends T> collection,
                                  final int index,
                                  final @NotNull IntFunction<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.apply(index);
        if (collection.isEmpty())
            return defaultValue.apply(index);

        final var size = collection.size();
        if (index >= size)
            return defaultValue.apply(index);
        if (index >= 0)
            return collection.get(index);

        final var indexToRetrieve = index + size;
        if (indexToRetrieve < 0)
            return defaultValue.apply(index);
        return collection.get(indexToRetrieve);
    }

    /// Get the element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] collection
    /// @param index        The index to retrieve a value
    /// @param defaultValue The callback to retrieve the default value if it is over the `size` (after calculation)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html">Kotlin getOrElse(key, defaultValue)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html">Kotlin elementAtOrElse(key, defaultValue)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> T getOrElse(final T @Nullable [] collection,
                                  final int index,
                                  final @NotNull IntFunction<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.apply(index);

        final var size = collection.length;
        if (size == 0)
            return defaultValue.apply(index);
        if (index >= size)
            return defaultValue.apply(index);
        if (index >= 0)
            return collection[index];

        final var indexToRetrieve = index + size;
        if (indexToRetrieve < 0)
            return defaultValue.apply(index);
        return collection[indexToRetrieve];
    }

    //#endregion -------------------- predicate (int) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param index        The index to retrieve a value
    /// @param defaultValue The callback to retrieve the default value if it is over the [size][MinimalistCollectionHolder#size] (after calculation)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html">Kotlin getOrElse(key, defaultValue)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html">Kotlin elementAtOrElse(key, defaultValue)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> T getOrElse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                  final int index,
                                  final @NotNull Supplier<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.get();

        final var size = collection.size();
        if (size == 0)
            return defaultValue.get();
        if (index >= size)
            return defaultValue.get();
        if (index >= 0)
            return collection.get(index);

        final var indexToRetrieve = index + size;
        if (indexToRetrieve < 0)
            return defaultValue.get();
        return collection.get(indexToRetrieve);
    }

    /// Get the element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] [collection][CollectionHolder]
    /// @param index        The index to retrieve a value
    /// @param defaultValue The callback to retrieve the default value if it is over the [size][CollectionHolder#size] (after calculation)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html">Kotlin getOrElse(key, defaultValue)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html">Kotlin elementAtOrElse(key, defaultValue)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> T getOrElse(final @Nullable CollectionHolder<? extends T> collection,
                                  final int index,
                                  final @NotNull Supplier<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.get();
        if (collection.isEmpty())
            return defaultValue.get();

        final var size = collection.size();
        if (index >= size)
            return defaultValue.get();
        if (index >= 0)
            return collection.get(index);

        final var indexToRetrieve = index + size;
        if (indexToRetrieve < 0)
            return defaultValue.get();
        return collection.get(indexToRetrieve);
    }

    /// Get the element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] collection
    /// @param index        The index to retrieve a value
    /// @param defaultValue The callback to retrieve the default value if it is over the `size` (after calculation)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html">Kotlin getOrElse(key, defaultValue)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html">Kotlin elementAtOrElse(key, defaultValue)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> T getOrElse(final T @Nullable [] collection,
                                  final int index,
                                  final @NotNull Supplier<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.get();

        final var size = collection.length;
        if (size == 0)
            return defaultValue.get();
        if (index >= size)
            return defaultValue.get();
        if (index >= 0)
            return collection[index];

        final var indexToRetrieve = index + size;
        if (indexToRetrieve < 0)
            return defaultValue.get();
        return collection[indexToRetrieve];
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------

}
