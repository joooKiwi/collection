package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.NullCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_1;

@NotNullByDefault
public final class GetFirst
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private GetFirst() { throw new ImpossibleConstructionException("The utility class “GetFirst” cannot be constructed.", GetFirst.class); }

    //#region -------------------- Facade methods --------------------

    /// Get the first element in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **is empty**
    /// @see java.util.SequencedCollection#getFirst()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> T getFirst(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            throw new NullCollectionException();
        if (collection.size() == 0)
            throw new EmptyCollectionException();
        return collection.get(0);
    }

    /// Get the first element in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` [is empty][CollectionHolder#isEmpty]
    /// @see java.util.SequencedCollection#getFirst()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> T getFirst(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            throw new NullCollectionException();
        if (collection.isEmpty())
            throw new EmptyCollectionException();
        return collection.get(0);
    }

    /// Get the first element in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **is empty**
    /// @see java.util.SequencedCollection#getFirst()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> T getFirst(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            throw new NullCollectionException();
        if (collection.length == 0)
            throw new EmptyCollectionException();
        return collection[0];
    }

    //#endregion -------------------- Facade methods --------------------

}
