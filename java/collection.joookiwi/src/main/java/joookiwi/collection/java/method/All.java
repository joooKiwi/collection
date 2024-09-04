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
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_2;

public final class All
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private All() { throw new ImpossibleConstructionException("The utility class “All” cannot be constructed.", All.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- (T, int) → boolean --------------------

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @see java.util.stream.Stream#allMatch(java.util.function.Predicate) Stream.allMatch(predicate)
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T> boolean all(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                  final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return false;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __with2Argument(collection, predicate, size);
    }

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @see java.util.stream.Stream#allMatch(java.util.function.Predicate) Stream.allMatch(predicate)
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T> boolean all(final @Nullable CollectionHolder<? extends T> collection,
                                  final @NotNull ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return false;
        if (collection.isEmpty())
            return false;
        return __with2Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- (T, int) → boolean --------------------
    //#region -------------------- (T) → boolean --------------------

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @see java.util.stream.Stream#allMatch(java.util.function.Predicate) Stream.allMatch(predicate)
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T> boolean all(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                  final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return false;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __with1Argument(collection, predicate, size);
    }

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @see java.util.stream.Stream#allMatch(java.util.function.Predicate) Stream.allMatch(predicate)
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T> boolean all(final @Nullable CollectionHolder<? extends T> collection,
                                  final @NotNull Predicate<? super T> predicate) {
        if (collection == null)
            return false;

        if (collection.isEmpty())
            return false;
        return __with1Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- (T) → boolean --------------------
    //#region -------------------- () → boolean --------------------

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @see java.util.stream.Stream#allMatch(java.util.function.Predicate) Stream.allMatch(predicate)
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T> boolean all(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                  final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return false;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __with0Argument(predicate, size);
    }

    /**
     * Check if <b>every</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The matching predicate
     * @param <T>        The {@code collection} type
     * @return <b>true</b> only if every value in the {@code collection} is applicable to the {@code predicate}
     * @see java.util.stream.Stream#allMatch(java.util.function.Predicate) Stream.allMatch(predicate)
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html">Kotlin all(predicate)</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all">C# All(predicate)</a>
     */
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_2)
    public static <T> boolean all(final @Nullable CollectionHolder<? extends T> collection,
                                  final @NotNull BooleanSupplier predicate) {
        if (collection == null)
            return false;
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
            if (!predicate.getAsBoolean())
                return false;
        return true;
    }

    private static <T> boolean __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                               final @NotNull Predicate<? super T> predicate,
                                               final int size) {
        var index = -1;
        while (++index < size)
            if (!predicate.test(collection.get(index)))
                return false;
        return true;
    }

    private static <T> boolean __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                               final @NotNull ObjIntPredicate<? super T> predicate,
                                               final int size) {
        var index = -1;
        while (++index < size)
            if (!predicate.test(collection.get(index), index))
                return false;
        return true;
    }

    //#endregion -------------------- Loop methods --------------------

}
