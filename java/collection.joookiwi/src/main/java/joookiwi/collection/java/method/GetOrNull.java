package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_2;

@NotNullByDefault
public final class GetOrNull
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private GetOrNull() { throw new ImpossibleConstructionException("The utility class “GetOrNull” cannot be constructed.", GetOrNull.class); }

    //#region -------------------- Facade methods --------------------

    /// Get the element at the specified `index` in the `collection`
    /// or `null` if it is over the [size][MinimalistCollectionHolder#size]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param index      The index to retrieve a value
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html">Kotlin getOrNull(index)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html">Kotlin elementAtOrNull(index)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T getOrNull(final @Nullable MinimalistCollectionHolder<? extends @Nullable T> collection,
                                                                     final int index) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        if (index >= size)
            return null;
        if (index >= 0)
            return collection.get(index);

        final var indexToRetrieve = index + size;
        if (indexToRetrieve < 0)
            return null;
        return collection.get(indexToRetrieve);
    }

    /// Get the element at the specified `index` in the `collection`
    /// or `null` if it is over the [size][CollectionHolder#size]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param index      The index to retrieve a value
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html">Kotlin getOrNull(index)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html">Kotlin elementAtOrNull(index)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @Nullable T getOrNull(final @Nullable CollectionHolder<? extends @Nullable T> collection,
                                                                     final int index) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        if (index >= size)
            return null;
        if (index >= 0)
            return collection.get(index);

        final var indexToRetrieve = index + size;
        if (indexToRetrieve < 0)
            return null;
        return collection.get(indexToRetrieve);
    }

    /// Get the element at the specified `index` in the `collection`
    /// or `null` if it is over the `size`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param index      The index to retrieve a value
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html">Kotlin getOrNull(index)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html">Kotlin elementAtOrNull(index)</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Nullable T getOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                     final int index) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return null;
        if (index >= size)
            return null;
        if (index >= 0)
            return collection[index];

        final var indexToRetrieve = index + size;
        if (indexToRetrieve < 0)
            return null;
        return collection[indexToRetrieve];
    }

    //#endregion -------------------- Facade methods --------------------

}
