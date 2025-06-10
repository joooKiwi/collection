package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class FilterNotNull
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private FilterNotNull() { throw new ImpossibleConstructionException("The utility class “FilterNotNull” cannot be constructed.", FilterNotNull.class); }

    //#region -------------------- Facade methods --------------------

    /// Get a new [CollectionHolder] without `null`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not-null.html">Kotlin filterNotNull(predicate)</a>
    @ExtensionFunction
    public static <T> CollectionHolder<T> filterNotNull(final @Nullable MinimalistCollectionHolder<? extends @Nullable T> collection) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();

        @SuppressWarnings("unchecked cast") final var temporaryArray = (T[]) new Object[size];
        var index = -1;
        while (++index < size)
            if ((temporaryArray[index] = collection.get(index)) == null)
                return new GenericCollectionHolder<>(__filterNotNull(collection, size, index, temporaryArray));
        return new GenericCollectionHolder<>(collection);
    }

    /// Get a new [CollectionHolder] without `null`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not-null.html">Kotlin filterNotNull(predicate)</a>
    @ExtensionFunction
    public static <T> CollectionHolder<T> filterNotNull(final @Nullable CollectionHolder<? extends @Nullable T> collection) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        if (collection.hasNull())
            return new GenericCollectionHolder<>(__filterNotNull(collection));
        return (CollectionHolder<T>) collection;
    }

    /// Get a new [CollectionHolder] without `null`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not-null.html">Kotlin filterNotNull(predicate)</a>
    @ExtensionFunction
    public static <T> CollectionHolder<T> filterNotNull(final @Nullable T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();

        @SuppressWarnings("unchecked cast") final var temporaryArray = (T[]) new Object[size];
        var index = -1;
        while (++index < size)
            if ((temporaryArray[index] = collection[index]) == null)
                return new GenericCollectionHolder<>(__filterNotNull(collection, size, index, temporaryArray));
        return new GenericCollectionHolder<>(collection);
    }

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> T @Unmodifiable [] __filterNotNull(final MinimalistCollectionHolder<? extends @Nullable T> collection) {
        final var size = collection.size();
        @SuppressWarnings("unchecked cast") final var tempArray = (T[]) new Object[size];
        var amountOfItemsAdded = -1;
        var index = -1;
        while (++index < size) {
            final var value = collection.get(index);
            if (value != null)
                tempArray[++amountOfItemsAdded] = value;
        }
        return __reduceTo(tempArray, amountOfItemsAdded + 1);
    }

    private static <T> T @Unmodifiable [] __filterNotNull(final MinimalistCollectionHolder<? extends @Nullable T> collection,
                                                          final int size,
                                                          final int index,
                                                          final T @Unmodifiable [] temporaryArray) {
        @SuppressWarnings("unchecked cast") final var tempArray = (T[]) new Object[size];
        var index2 = -1;
        while (++index2 < index) // We add the non-null items from 0 to the index (they cannot be null)
            tempArray[index2] = temporaryArray[index2];

        var amountOfItemsAdded = index2;
        while (++index2 < size) { // We add the remaining items while validating the nullability
            final var value = collection.get(index2);
            if (value != null)
                tempArray[++amountOfItemsAdded] = value;
        }
        return __reduceTo(tempArray, amountOfItemsAdded + 1);
    }

    private static <T> T @Unmodifiable [] __filterNotNull(final @Nullable T @Unmodifiable [] collection,
                                                          final int size,
                                                          final int index,
                                                          final T @Unmodifiable [] temporaryArray) {
        @SuppressWarnings("unchecked cast") final var tempArray = (T[]) new Object[size];
        var index2 = -1;
        while (++index2 < index) // We add the non-null items from 0 to the index (they cannot be null)
            tempArray[index2] = temporaryArray[index2];

        var amountOfItemsAdded = index2;
        while (++index2 < size) { // We add the remaining items while validating the nullability
            final var value = collection[index2];
            if (value != null)
                tempArray[++amountOfItemsAdded] = value;
        }
        return __reduceTo(tempArray, amountOfItemsAdded + 1);
    }


    //#endregion -------------------- Loop methods --------------------

}
