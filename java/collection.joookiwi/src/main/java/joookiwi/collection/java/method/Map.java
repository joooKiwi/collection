package joookiwi.collection.java.method;

import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class Map
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private Map() { throw new ImpossibleConstructionException("The utility class “Map” cannot be constructed.", Map.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(Function) Java map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">Javascript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T, U> @NotNull CollectionHolder<U> map(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with2Argument(collection, transform, size));
    }

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(Function) Java map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">Javascript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T, U> @NotNull CollectionHolder<U> map(final @Nullable CollectionHolder<? extends T> collection,
                                                          final @NotNull ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with2Argument(collection, transform, collection.size()));
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(Function) Java map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">Javascript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T, U> @NotNull CollectionHolder<U> map(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with1Argument(collection, transform, size));
    }

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(Function) Java map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">Javascript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T, U> @NotNull CollectionHolder<U> map(final @Nullable CollectionHolder<? extends T> collection,
                                                          final @NotNull Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with1Argument(collection, transform, collection.size()));
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(Function) Java map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">Javascript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T, U> @NotNull CollectionHolder<U> map(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                          final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with0Argument(transform, size));
    }

    /// Create a new [CollectionHolder] applying a `transform` function
    /// on each element of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @see java.util.stream.Stream#map(Function) Java map(transform)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/map">Javascript map(transform)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html">Kotlin map(transform)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select">C# Select(transform)</a>
    @ExtensionFunction
    public static <T, U> @NotNull CollectionHolder<U> map(final @Nullable CollectionHolder<? extends T> collection,
                                                          final @NotNull Supplier<? extends U> transform) {
        if (collection == null)
            return emptyCollectionHolder();
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(__with0Argument(transform, collection.size()));
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <U> U @NotNull @Unmodifiable [] __with0Argument(final @NotNull Supplier<? extends U> action,
                                                                   final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (U[]) new Object[size];
        var index = -1;
        while (++index < size)
            newArray[index] = action.get();
        return newArray;
    }

    private static <T, U> U @NotNull @Unmodifiable [] __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                      final @NotNull Function<? super T, ? extends U> transform,
                                                                      final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (U[]) new Object[size];
        var index = -1;
        while (++index < size)
            newArray[index] = transform.apply(collection.get(index));
        return newArray;
    }

    private static <T, U> U @NotNull @Unmodifiable [] __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                      final @NotNull ObjIntFunction<? super T, ? extends U> transform,
                                                                      final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (U[]) new Object[size];
        var index = -1;
        while (++index < size)
            newArray[index] = transform.apply(collection.get(index), index);
        return newArray;
    }

    //#endregion -------------------- Loop methods --------------------

}
