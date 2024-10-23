package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.EmptyCollectionHolderException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.NullCollectionHolderException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_1;

@NotNullByDefault
public final class GetLast
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private GetLast() { throw new ImpossibleConstructionException("The utility class “GetLast” cannot be constructed.", GetLast.class); }

    //#region -------------------- Facade methods --------------------

    /// Get the last element in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException  The `collection` was `null`
    /// @throws EmptyCollectionHolderException The `collection` **is empty**
    /// @see java.util.SequencedCollection#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> T getLast(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            throw new NullCollectionHolderException();

        final var size = collection.size();
        if (size == 0)
            throw new EmptyCollectionHolderException();
        return collection.get(size - 1);
    }

    /// Get the last element in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException  The `collection` was `null`
    /// @throws EmptyCollectionHolderException The `collection` [is empty][CollectionHolder#isEmpty]
    /// @see java.util.SequencedCollection#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> T getLast(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            throw new NullCollectionHolderException();
        if (collection.isEmpty())
            throw new EmptyCollectionHolderException();
        return collection.get(collection.size() - 1);
    }

    /// Get the last element in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException  The `collection` was `null`
    /// @throws EmptyCollectionHolderException The `collection` **is empty**
    /// @see java.util.SequencedCollection#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> T getLast(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            throw new NullCollectionHolderException();

        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionHolderException();
        return collection[size - 1];
    }

    //#endregion -------------------- Facade methods --------------------

}
