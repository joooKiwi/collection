package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.*;

public final class Any
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private Any() { throw new ImpossibleConstructionException("The utility class “Any” cannot be constructed.", Any.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- () --------------------

    /**
     * Tell if the {@code collection} {@link MinimalistCollectionHolder#size size} is not <b>0</b>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @return <b>false</b> if null is received or {@link MinimalistCollectionHolder#size size} is not <b>0</b> otherwise
     * @see java.util.stream.Stream#findAny() Stream.findAny()
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html">Kotlin any()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T> boolean any(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        return __any(collection);
    }

    /**
     * Tell if the {@code collection} {@link CollectionHolder#isNotEmpty is not empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @return <b>false</b> if null is received or {@link CollectionHolder#isNotEmpty isNotEmpty} otherwise
     * @see java.util.stream.Stream#findAny() Stream.findAny()
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html">Kotlin any()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any()</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T> boolean any(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        return __any(collection);
    }

    //#endregion -------------------- () --------------------
    //#region -------------------- predicate (T, int) → boolean --------------------

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see java.util.stream.Stream#anyMatch(java.util.function.Predicate) Stream.anyMatch(predicate)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T> boolean any(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                  final @Nullable ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return __any(collection);
        return __any(collection, predicate);
    }

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see java.util.stream.Stream#anyMatch(java.util.function.Predicate) Stream.anyMatch(predicate)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T> boolean any(final @Nullable CollectionHolder<? extends T> collection,
                                  final @Nullable ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return __any(collection);
        return __any(collection, predicate);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see java.util.stream.Stream#anyMatch(java.util.function.Predicate) Stream.anyMatch(predicate)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T> boolean any(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                  final @Nullable Predicate<? super T> predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return __any(collection);
        return __any(collection, predicate);
    }

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see java.util.stream.Stream#anyMatch(java.util.function.Predicate) Stream.anyMatch(predicate)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T> boolean any(final @Nullable CollectionHolder<? extends T> collection,
                                  final @Nullable Predicate<? super T> predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return __any(collection);
        return __any(collection, predicate);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see java.util.stream.Stream#anyMatch(java.util.function.Predicate) Stream.anyMatch(predicate)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T> boolean any(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                  final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return __any(collection);
        return __any(collection, predicate);
    }

    /**
     * Check if <b>one</b> of the elements in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if at least one {@code predicate} is true on a value of the {@code collection}
     * @see java.util.stream.Stream#anyMatch(java.util.function.Predicate) Stream.anyMatch(predicate)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/some">Javascript ReadonlyArray.some(predicate)</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html">Kotlin any(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any">C# Any(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T> boolean any(final @Nullable CollectionHolder<? extends T> collection,
                                  final @Nullable BooleanSupplier predicate) {
        if (collection == null)
            return false;
        if (predicate == null)
            return __any(collection);
        return __any(collection, predicate);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- () --------------------

    private static <T> boolean __any(final @NotNull MinimalistCollectionHolder<? extends T> collection) {
        return collection.size() != 0;
    }

    private static <T> boolean __any(final @NotNull CollectionHolder<? extends T> collection) {
        return collection.isNotEmpty();
    }

    //#endregion -------------------- () --------------------
    //#region -------------------- predicate (T, int) → boolean --------------------

    private static <T> boolean __any(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                     final @NotNull ObjIntPredicate<? super T> predicate) {
        final var size = collection.size();
        if (size == 0)
            return false;
        return __with2Argument(collection, predicate, size);
    }

    private static <T> boolean __any(final @NotNull CollectionHolder<? extends T> collection,
                                     final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection.isEmpty())
            return false;
        return __with2Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    private static <T> boolean __any(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                     final @NotNull Predicate<? super T> predicate) {
        final var size = collection.size();
        if (size == 0)
            return false;
        return __with1Argument(collection, predicate, size);
    }

    private static <T> boolean __any(final @NotNull CollectionHolder<? extends T> collection,
                                     final @NotNull Predicate<? super T> predicate) {
        if (collection.isEmpty())
            return false;
        return __with1Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    private static <T> boolean __any(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                     final @NotNull BooleanSupplier predicate) {
        final var size = collection.size();
        if (size == 0)
            return false;
        return __with0Argument(predicate, size);
    }

    private static <T> boolean __any(final @NotNull CollectionHolder<? extends T> collection,
                                     final @NotNull BooleanSupplier predicate) {
        if (collection.isEmpty())
            return false;
        return __with0Argument(predicate, collection.size());
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static boolean __with0Argument(final @NotNull BooleanSupplier predicate,
                                           final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.getAsBoolean())
                return true;
        return false;
    }

    private static <T> boolean __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                               final @NotNull Predicate<? super T> predicate,
                                               final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.test(collection.get(index)))
                return true;
        return false;
    }

    private static <T> boolean __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                               final @NotNull ObjIntPredicate<? super T> predicate,
                                               final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.test(collection.get(index), index))
                return true;
        return false;
    }

    //#endregion -------------------- Loop methods --------------------

}
