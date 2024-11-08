package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_1;

@NotNullByDefault
public final class GetLastOrNull
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private GetLastOrNull() { throw new ImpossibleConstructionException("The utility class “GetLastOrNull” cannot be constructed.", GetLastOrNull.class); }

    //#region -------------------- Facade methods --------------------

    /// Get the last element in the `collection`
    /// or `null` if it **is empty**
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_1)
    public static <T> @Nullable T getLastOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return null;
        return collection.get(size - 1);
    }

    /// Get the last element in the `collection`
    /// or `null` if it [is empty][CollectionHolder#isEmpty]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_1)
    public static <T> @Nullable T getLastOrNull(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return null;
        return collection.get(collection.size() - 1);
    }

    /// Get the last element in the `collection`
    /// or `null` if it **is empty**
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html">Kotlin lastOrNull()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault">C# LastOrDefault()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_NULL_1)
    public static <T> @Nullable T getLastOrNull(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return null;
        return collection[size - 1];
    }

    //#endregion -------------------- Facade methods --------------------

}
