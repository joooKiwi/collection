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
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_TRUE_1;

@NotNullByDefault
public final class HasAtMost1Element
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private HasAtMost1Element() { throw new ImpossibleConstructionException("The utility class “HasAtMost1Element” cannot be constructed.", HasAtMost1Element.class); }

    //#region -------------------- Facade methods --------------------

    /// The [collection][MinimalistCollectionHolder] has exactly 0 or 1 value
    ///
    /// @param collection The [collection][MinimalistCollectionHolder] to compare its [size][MinimalistCollectionHolder#size]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T extends @Nullable Object> boolean hasAtMost1Element(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return true;

        final var size = collection.size();
        return size == 0 || size == 1;
    }

    /// The [collection][CollectionHolder] has exactly 0 or 1 value
    ///
    /// @param collection The [collection][CollectionHolder] to compare its [size][CollectionHolder#size]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T extends @Nullable Object> boolean hasAtMost1Element(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return true;
        return collection.isEmpty() || collection.hasExactly1Element();
    }

    /// The `collection` has exactly 0 or 1 value
    ///
    /// @param collection The collection to compare its `size`
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T extends @Nullable Object> boolean hasAtMost1Element(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return true;

        final var size = collection.length;
        return size == 0 || size == 1;
    }

    //#endregion -------------------- Facade methods --------------------

}
