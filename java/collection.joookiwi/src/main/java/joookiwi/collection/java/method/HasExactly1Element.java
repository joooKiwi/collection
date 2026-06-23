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
public final class HasExactly1Element
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private HasExactly1Element() { throw new ImpossibleConstructionException("The utility class “HasExactly1Element” cannot be constructed.", HasExactly1Element.class); }

    //#region -------------------- Facade methods --------------------

    /// The [collection][MinimalistCollectionHolder] has exactly 1 value
    ///
    /// @param collection The [collection][MinimalistCollectionHolder] to compare its [size][MinimalistCollectionHolder#size]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T extends @Nullable Object> boolean hasExactly1Element(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        return collection.size() == 1;
    }

    /// The [collection][CollectionHolder] has exactly 1 value
    ///
    /// @param collection The [collection][CollectionHolder] to compare its [size][CollectionHolder#size]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T extends @Nullable Object> boolean hasExactly1Element(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        return collection.size() == 1;
    }

    /// The `collection` has exactly 1 value
    ///
    /// @param collection The collection to compare its `size`
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T extends @Nullable Object> boolean hasExactly1Element(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return false;
        return collection.length == 1;
    }

    //#endregion -------------------- Facade methods --------------------

}
