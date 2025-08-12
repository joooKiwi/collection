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
public final class HasDuplicate
    extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private HasDuplicate() { throw new ImpossibleConstructionException("The utility class “HasDuplicate” cannot be constructed.", HasDuplicate.class); }

    //#region -------------------- Facade methods --------------------

    /// The `collection` has at least one duplicate value
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @return **true** only if one element is equal (== or [equals][#equals]) to another one
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T extends @Nullable Object> boolean hasDuplicate(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __hasDuplicate(collection, size);
    }

    /// The `collection` has at least one duplicate value
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @return **true** only if one element is equal (== or [equals][#equals]) to another one
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T extends @Nullable Object> boolean hasDuplicate(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        if (collection.isEmpty())
            return false;
        return __hasDuplicate(collection, collection.size());
    }

    /// The `collection` has at least one duplicate value
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @return **true** only if one element is equal (== or [equals][#equals]) to another one
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T extends @Nullable Object> boolean hasDuplicate(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return false;

        final var size = collection.length;
        if (size == 0)
            return false;
        return __hasDuplicate(collection, size);
    }

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> boolean __hasDuplicate(final MinimalistCollectionHolder<? extends T> collection,
                                                                       final int size) {
        @SuppressWarnings("unchecked cast") final var temporaryArray = (T[]) new Object[size];
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

    private static <T extends @Nullable Object> boolean __hasDuplicate(final T @Unmodifiable [] collection,
                                                                       final int size) {
        @SuppressWarnings("unchecked cast") final var temporaryArray = (T[]) new Object[size];
        temporaryArray[0] = collection[0];
        var amountOfItemAdded = 1;
        var index = 0;
        while (++index < size) {
            final var value = collection[index];
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
