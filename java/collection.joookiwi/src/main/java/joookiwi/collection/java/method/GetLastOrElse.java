package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import java.util.function.IntFunction;
import java.util.function.Supplier;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class GetLastOrElse
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private GetLastOrElse() { throw new ImpossibleConstructionException("The utility class “GetFirstOrElse” cannot be constructed.", GetLastOrElse.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (int) → boolean --------------------

    /// Get the **last** element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param defaultValue The callback to retrieve the default value if it is over the [size][MinimalistCollectionHolder#size] (after calculation)
    @ExtensionFunction
    public static <T extends @Nullable Object> T getLastOrElse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                               final @NotNull IntFunction<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.apply(-1);

        final var size = collection.size();
        if (size == 0)
            return defaultValue.apply(-1);
        return collection.get(size - 1);
    }

    /// Get the **last** element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] [collection][CollectionHolder]
    /// @param defaultValue The callback to retrieve the default value if it is over the [size][CollectionHolder#size] (after calculation)
    @ExtensionFunction
    public static <T extends @Nullable Object> T getLastOrElse(final @Nullable CollectionHolder<? extends T> collection,
                                                               final @NotNull IntFunction<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.apply(-1);
        if (collection.isEmpty())
            return defaultValue.apply(-1);
        return collection.getLast();
    }

    /// Get the **last** element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] collection
    /// @param defaultValue The callback to retrieve the default value if it is over the `size` (after calculation)
    @ExtensionFunction
    public static <T extends @Nullable Object> T getLastOrElse(final T @Nullable [] collection,
                                                               final @NotNull IntFunction<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.apply(-1);

        final var size = collection.length;
        if (size == 0)
            return defaultValue.apply(-1);
        return collection[size - 1];
    }

    //#endregion -------------------- predicate (int) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the **last** element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param defaultValue The callback to retrieve the default value if it is over the [size][MinimalistCollectionHolder#size] (after calculation)
    @ExtensionFunction
    public static <T extends @Nullable Object> T getLastOrElse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                               final @NotNull Supplier<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.get();

        final var size = collection.size();
        if (size == 0)
            return defaultValue.get();
        return collection.get(size - 1);
    }

    /// Get the **last** element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] [collection][CollectionHolder]
    /// @param defaultValue The callback to retrieve the default value if it is over the [size][CollectionHolder#size] (after calculation)
    @ExtensionFunction
    public static <T extends @Nullable Object> T getLastOrElse(final @Nullable CollectionHolder<? extends T> collection,
                                                               final @NotNull Supplier<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.get();
        if (collection.isEmpty())
            return defaultValue.get();
        return collection.getLast();
    }

    /// Get the **last** element at the specified index in the `collection`
    /// or calling the `defaultValue` function
    /// if it is out of bound of the `collection`
    ///
    /// @param collection   The [nullable][Nullable] collection
    /// @param defaultValue The callback to retrieve the default value if it is over the `size` (after calculation)
    @ExtensionFunction
    public static <T extends @Nullable Object> T getLastOrElse(final T @Nullable [] collection,
                                                               final @NotNull Supplier<? extends T> defaultValue) {
        if (collection == null)
            return defaultValue.get();

        final var size = collection.length;
        if (size == 0)
            return defaultValue.get();
        return collection[size - 1];
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------

}
