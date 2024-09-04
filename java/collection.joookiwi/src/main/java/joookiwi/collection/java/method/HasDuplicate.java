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

public final class HasDuplicate
    extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private HasDuplicate() { throw new ImpossibleConstructionException("The utility class “HasDuplicate” cannot be constructed.", HasDuplicate.class); }

    //#region -------------------- Facade methods --------------------

    /**
     * The {@code collection} has at least one duplicate value
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @return b>true</b> only if one element is equal (== or {@link Object#equals equals}) to another one
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T> boolean hasDuplicate(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __hasDuplicate(collection, size);
    }

    /**
     * The {@code collection} has at least one duplicate value
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @return b>true</b> only if one element is equal (== or {@link Object#equals equals}) to another one
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T> boolean hasDuplicate(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        if (collection.isEmpty())
            return false;
        return __hasDuplicate(collection, collection.size());

    }

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static boolean __hasDuplicate(final @NotNull MinimalistCollectionHolder<?> collection,
                                          final int size) {
        final var temporaryArray = new @Nullable Object[size];
        temporaryArray[0] = collection.get(0);
        var amountOfItemAdded = 1;
        var index = 0;
        while (++index < size) {
            final var value = collection.get(index);
            var index2 = -1;

            if (value == null) {
                while (++index2 < amountOfItemAdded)
                    if (temporaryArray[index2] == null)
                        return true;
                temporaryArray[amountOfItemAdded++] = null;
                continue;
            }

            while (++index2 < amountOfItemAdded) {
                final var comparedValue = temporaryArray[index2];
                if (comparedValue == value || value.equals(comparedValue))
                    return true;
            }
            temporaryArray[amountOfItemAdded++] = value;
        }

        return amountOfItemAdded != size;
    }

    //#endregion -------------------- Loop methods --------------------

}
