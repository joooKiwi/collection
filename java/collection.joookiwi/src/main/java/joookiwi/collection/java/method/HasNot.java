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
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_TRUE_2;

@NotNullByDefault
public final class HasNot
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private HasNot() { throw new ImpossibleConstructionException("The utility class “Has” cannot be constructed.", HasNot.class); }

    //#region -------------------- Facade methods --------------------

    /// Tell whenever the `value` exist in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param value      The value to compare
    /// @param <T>        The `collection` type
    /// @return `true` if the `value` is equals to no value in the `collection`
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_2)
    public static <T extends @Nullable Object> boolean hasNot(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                              final T value) {
        if (collection == null)
            return true;

        final var size = collection.size();
        if (size == 0)
            return true;
        return __validate(collection, size, value);
    }

    /// Tell whenever the `value` exist in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param value      The value to compare
    /// @param <T>        The `collection` type
    /// @return `true` if the `value` is equals to no value in the `collection`
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_2)
    public static <T extends @Nullable Object> boolean hasNot(final @Nullable CollectionHolder<? extends T> collection,
                                                              final T value) {
        if (collection == null)
            return true;
        if (collection.isEmpty())
            return true;
        return __validate(collection, collection.size(), value);
    }

    /// Tell whenever the `value` exist in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param value      The value to compare
    /// @param <T>        The `collection` type
    /// @return `true` if the `value` is equals to no value in the `collection`
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_2)
    public static <T extends @Nullable Object> boolean hasNot(final T @Nullable @Unmodifiable [] collection,
                                                              final T value) {
        if (collection == null)
            return true;

        final var size = collection.length;
        if (size == 0)
            return true;
        return __validate(collection, size, value);
    }

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> boolean __validate(final MinimalistCollectionHolder<? extends T> collection,
                                                                   final int size,
                                                                   final T value) {
        var index = -1;
        if (value == null) {
            while (++index < size)
                if (collection.get(index) == null)
                    return false;
            return true;
        }

        while (++index < size) {
            final var collectionValue = collection.get(index);
            if (value == collectionValue || value.equals(collectionValue))
                return false;
        }
        return true;
    }

    private static <T extends @Nullable Object> boolean __validate(final T @Unmodifiable [] collection,
                                                                   final int size,
                                                                   final T value) {
        var index = -1;
        if (value == null) {
            while (++index < size)
                if (collection[index] == null)
                    return false;
            return true;
        }

        while (++index < size) {
            final var collectionValue = collection[index];
            if (value == collectionValue || value.equals(collectionValue))
                return false;
        }
        return true;
    }

    //#endregion -------------------- Loop methods --------------------

}
