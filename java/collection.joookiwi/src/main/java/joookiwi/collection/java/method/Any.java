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

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_2;

public final class Any
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private Any() { throw new ImpossibleConstructionException("The utility class “Any” cannot be constructed.", Any.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

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
        return collection.size() != 0;
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
        return collection.isNotEmpty();
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → boolean --------------------

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
            return collection.size() != 0;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __with2Argument(collection, predicate, size);
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
            return collection.isNotEmpty();
        if (collection.isEmpty())
            return false;
        return __with2Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- (T, int) → boolean --------------------
    //#region -------------------- (T) → boolean --------------------

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
            return collection.size() != 0;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __with1Argument(collection, predicate, size);
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
            return collection.isNotEmpty();
        if (collection.isEmpty())
            return false;
        return __with1Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- (T) → boolean --------------------
    //#region -------------------- () → boolean --------------------

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
            return collection.size() != 0;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __with0Argument(predicate, size);
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
            return collection.isNotEmpty();
        if (collection.isEmpty())
            return false;
        return __with0Argument(predicate, collection.size());
    }

    //#endregion -------------------- () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static boolean __with0Argument(final @NotNull BooleanSupplier predicate,
                                           final int size) {
        var index = size;
        while (index-- > 0)
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
