package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

@NotNullByDefault
public final class IsNotEmpty
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private IsNotEmpty() { throw new ImpossibleConstructionException("The utility class “IsNotEmpty” cannot be constructed.", IsNotEmpty.class); }

    //#region -------------------- Facade methods --------------------

    /// The [collection][MinimalistCollectionHolder] has at least one value
    ///
    /// @param collection The collection to retrieve its [size][MinimalistCollectionHolder#size]
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html">Kotlin isNotEmpty()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T> boolean isNotEmpty(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        return collection.size() != 0;
    }

    /// The [collection][CollectionHolder] has at least one value
    ///
    /// @param collection The collection to retrieve its [size][CollectionHolder#size]
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html">Kotlin isNotEmpty()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T> boolean isNotEmpty(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        return !collection.isEmpty();
    }

    /// The `collection` has at least one value
    ///
    /// @param collection The collection to retrieve its `size`
    /// @param <T>        The `collection` type
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html">Kotlin isNotEmpty()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T> boolean isNotEmpty(final T @Nullable [] collection) {
        if (collection == null)
            return false;
        return collection.length != 0;
    }

    //#endregion -------------------- Facade methods --------------------

}
