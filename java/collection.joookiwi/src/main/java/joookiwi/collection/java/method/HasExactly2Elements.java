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
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

@NotNullByDefault
public final class HasExactly2Elements
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private HasExactly2Elements() { throw new ImpossibleConstructionException("The utility class “HasExactly2Elements” cannot be constructed.", HasExactly2Elements.class); }

    //#region -------------------- Facade methods --------------------

    /// The [collection][MinimalistCollectionHolder] has exactly 2 values
    ///
    /// @param collection The [collection][MinimalistCollectionHolder] to compare its [size][MinimalistCollectionHolder#size]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T extends @Nullable Object> boolean hasExactly2Elements(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        return collection.size() == 2;
    }

    /// The [collection][CollectionHolder] has exactly 2 values
    ///
    /// @param collection The [collection][CollectionHolder] to compare its [size][CollectionHolder#size]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T extends @Nullable Object> boolean hasExactly2Elements(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        return collection.size() == 2;
    }

    /// The `collection` has exactly 2 values
    ///
    /// @param collection The collection to compare its `size`
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T extends @Nullable Object> boolean hasExactly2Elements(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return false;
        return collection.length == 2;
    }

    //#endregion -------------------- Facade methods --------------------

}
