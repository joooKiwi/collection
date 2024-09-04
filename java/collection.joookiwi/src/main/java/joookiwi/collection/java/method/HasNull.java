package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

public final class HasNull
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private HasNull() { throw new ImpossibleConstructionException("The utility class “HasNull” cannot be constructed.", HasNull.class); }

    //#region -------------------- Facade methods --------------------

    /**
     * The {@code collection} has at least one <b>null</b>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @return <b>true</b> only if one element is <b>null</b>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T> boolean hasNull(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;

        var size = collection.size();
        if (size == 0)
            return false;
        return __hasNull(collection, size);
    }

    /**
     * The {@code collection} has at least one <b>null</b>
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @return <b>true</b> only if one element is <b>null</b>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T> boolean hasNull(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        if (collection.isEmpty())
            return false;
        return __hasNull(collection, collection.size());

    }

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static boolean __hasNull(final @NotNull MinimalistCollectionHolder<?> collection,
                                     final int size) {
        var index = -1;
        while (++index < size)
            if (collection.get(index) == null)
                return true;
        return false;
    }

    //#endregion -------------------- Loop methods --------------------

}
