package joookiwi.collection.java.method;

import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class GetFirstOrElse
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private GetFirstOrElse() { throw new ImpossibleConstructionException("The utility class “GetFirstOrElse” cannot be constructed.", GetFirstOrElse.class); }

    //#region -------------------- Facade methods --------------------

    /// Get the **first** element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param defaultValue The callback to retrieve the default value if it is over the [size][MinimalistCollectionHolder#size] (after calculation)
    @ExtensionFunction
    public static <T extends @Nullable Object> T getFirstOrElse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                final Supplier<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.get();

        final var size = collection.size();
        if (size == 0)
            return defaultValue.get();
        return collection.get(0);
    }

    /// Get the **first** element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] [collection][CollectionHolder]
    /// @param defaultValue The callback to retrieve the default value if it is over the [size][CollectionHolder#size] (after calculation)
    @ExtensionFunction
    public static <T extends @Nullable Object> T getFirstOrElse(final @Nullable CollectionHolder<? extends T> collection,
                                                                final Supplier<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.get();
        if (collection.isEmpty())
            return defaultValue.get();
        return collection.getFirst();
    }

    /// Get the **first** element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] collection
    /// @param defaultValue The callback to retrieve the default value if it is over the `size` (after calculation)
    @ExtensionFunction
    public static <T extends @Nullable Object> T getFirstOrElse(final T @Nullable [] collection,
                                                                final Supplier<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.get();

        final var size = collection.length;
        if (size == 0)
            return defaultValue.get();
        return collection[0];
    }

    //#endregion -------------------- Facade methods --------------------

}
