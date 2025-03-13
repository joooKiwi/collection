package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_2;

@NotNullByDefault
public final class Has
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private Has() { throw new ImpossibleConstructionException("The utility class “Has” cannot be constructed.", Has.class); }

    //#region -------------------- Facade methods --------------------

    /// Tell whenever the `value` exist in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param value      The value to compare
    /// @param <T>        The `collection` type
    /// @return `true` if the `value` is equals to one value in the `collection`
    /// @see java.util.Collection#contains(Object)
    /// @see java.util.Map#containsValue(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/includes">Javascript Array.includes(value)</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/has">Javascript Set.has(value)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html">Kotlin contains(value)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html">Kotlin Map.containsValue(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains">C# contains(value)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean has(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                           final T value) {
        if (collection == null)
            return false;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __has(collection, size, value);
    }

    /// Tell whenever the `value` exist in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param value      The value to compare
    /// @param <T>        The `collection` type
    /// @return `true` if the `value` is equals to one value in the `collection`
    /// @see java.util.Collection#contains(Object)
    /// @see java.util.Map#containsValue(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/includes">Javascript Array.includes(value)</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/has">Javascript Set.has(value)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html">Kotlin contains(value)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains">C# contains(value)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean has(final @Nullable CollectionHolder<? extends T> collection,
                                                           final T value) {
        if (collection == null)
            return false;
        if (collection.isEmpty())
            return false;
        return __has(collection, collection.size(), value);
    }

    /// Tell whenever the `value` exist in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param value      The value to compare
    /// @param <T>        The `collection` type
    /// @return `true` if the `value` is equals to one value in the `collection`
    /// @see java.util.Collection#contains(Object)
    /// @see java.util.Map#containsValue(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/includes">Javascript Array.includes(value)</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/has">Javascript Set.has(value)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html">Kotlin contains(value)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html">Kotlin Map.containsValue(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains">C# contains(value)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean has(final T @Nullable @Unmodifiable [] collection,
                                                           final T value) {
        if (collection == null)
            return false;

        final var size = collection.length;
        if (size == 0)
            return false;
        return __has(collection, size, value);
    }

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> boolean __has(final @NotNull MinimalistCollectionHolder<? extends T> collection, int size,
                                                              final T value) {
        var index = -1;
        if (value == null) {
            while (++index < size)
                if (collection.get(index) == null)
                    return true;
            return false;
        }

        while (++index < size) {
            final var collectionValue = collection.get(index);
            if (value == collectionValue || value.equals(collectionValue))
                return true;
        }
        return false;
    }

    private static <T extends @Nullable Object> boolean __has(final T @NotNull @Unmodifiable [] collection, int size,
                                                              final T value) {
        var index = -1;
        if (value == null) {
            while (++index < size)
                if (collection[index] == null)
                    return true;
            return false;
        }

        while (++index < size) {
            final var collectionValue = collection[index];
            if (value == collectionValue || value.equals(collectionValue))
                return true;
        }
        return false;
    }

    //#endregion -------------------- Loop methods --------------------

}
