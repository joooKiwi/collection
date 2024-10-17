package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_TRUE_1;

public final class IsEmpty
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private IsEmpty() { throw new ImpossibleConstructionException("The utility class “IsEmpty” cannot be constructed.", IsEmpty.class); }

    //#region -------------------- Facade methods --------------------

    /// The [collection][MinimalistCollectionHolder] has no values
    ///
    /// @param collection The collection to retrieve its [size][MinimalistCollectionHolder#size]
    /// @param <T>        The `collection` type
    /// @see java.util.Map#isEmpty()
    /// @see java.util.Collection#isEmpty()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html">Kotlin isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html">Kotlin Collection.isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html">Kotlin Map.isEmpty()</a>
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T> boolean isEmpty(final @Nullable MinimalistCollectionHolder<T> collection) {
        if (collection == null)
            return true;
        return collection.size() == 0;
    }

    /// The [collection][CollectionHolder] has no values
    ///
    /// @param collection The collection to retrieve its [size][CollectionHolder#size]
    /// @param <T>        The `collection` type
    /// @see java.util.Map#isEmpty()
    /// @see java.util.Collection#isEmpty()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html">Kotlin isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html">Kotlin Collection.isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html">Kotlin Map.isEmpty()</a>
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T> boolean isEmpty(final @Nullable CollectionHolder<T> collection) {
        if (collection == null)
            return true;
        return collection.size() == 0;
    }

    /// The `collection` has no values
    ///
    /// @param collection The collection to retrieve its `size`
    /// @param <T>        The `collection` type
    /// @see java.util.Map#isEmpty()
    /// @see java.util.Collection#isEmpty()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html">Kotlin isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html">Kotlin Collection.isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html">Kotlin Map.isEmpty()</a>
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T> boolean isEmpty(final T @Nullable [] collection) {
        if (collection == null)
            return true;
        return collection.length == 0;
    }

    //#endregion -------------------- Facade methods --------------------

}
