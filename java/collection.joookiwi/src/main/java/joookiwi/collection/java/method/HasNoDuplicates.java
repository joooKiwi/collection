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
public final class HasNoDuplicates
    extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private HasNoDuplicates() { throw new ImpossibleConstructionException("The utility class “HasDuplicate” cannot be constructed.", HasNoDuplicates.class); }

    //#region -------------------- Facade methods --------------------

    /// The `collection` has no duplicate value
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @return **true** only if no element is equal (== or [equals][#equals]) to another one
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T extends @Nullable Object> boolean hasNoDuplicates(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return true;

        final var size = collection.size();
        if (size == 0)
            return true;
        if (size == 1)
            return true;
        return __validate(collection, size);
    }

    /// The `collection` has no duplicate value
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @return **true** only if no element is equal (== or [equals][#equals]) to another one
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T extends @Nullable Object> boolean hasNoDuplicates(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return true;
        if (collection.isEmpty())
            return true;

        final var size = collection.size();
        if (size == 1)
            return true;
        return __validate(collection, size);
    }

    /// The `collection` has no duplicate value
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @return **true** only if no element is equal (== or [equals][#equals]) to another one
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T extends @Nullable Object> boolean hasNoDuplicates(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return true;

        final var size = collection.length;
        if (size == 0)
            return true;
        if (size == 1)
            return true;
        return __validate(collection, size);
    }

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> boolean __validate(final MinimalistCollectionHolder<? extends T> collection,
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
                        return false;
                temporaryArray[amountOfItemAdded++] = null;
                continue;
            }

            while (++index2 < amountOfItemAdded) {
                final var comparedValue = temporaryArray[index2];
                if (comparedValue == value || value.equals(comparedValue))
                    return false;
            }
            temporaryArray[amountOfItemAdded++] = value;
        }

        return true;
    }

    private static <T extends @Nullable Object> boolean __validate(final T @Unmodifiable [] collection,
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
                        return false;
                temporaryArray[amountOfItemAdded++] = null;
                continue;
            }

            while (++index2 < amountOfItemAdded) {
                final var comparedValue = temporaryArray[index2];
                if (comparedValue == value || value.equals(comparedValue))
                    return false;
            }
            temporaryArray[amountOfItemAdded++] = value;
        }

        return true;
    }

    //#endregion -------------------- Loop methods --------------------

}
