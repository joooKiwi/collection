package joookiwi.collection.java.method;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_2;

public final class All
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private All() { throw new ImpossibleConstructionException("The utility class \"All\" cannot be constructed.", All.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

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
                                  final @NotNull BiFunction<? super T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        return __all(collection, predicate);
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
                                  final @NotNull BiFunction<? super T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        return __all(collection, predicate);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

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
                                  final @NotNull Function<? super T, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        return __all(collection, predicate);
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
                                  final @NotNull Function<? super T, @NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        return __all(collection, predicate);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

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
                                  final @NotNull Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        return __all(collection, predicate);
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
                                  final @NotNull Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return false;
        return __all(collection, predicate);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    private static <T> boolean __all(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                     final @NotNull BiFunction<? super T, @NotNull Integer, @NotNull Boolean> predicate) {
        final var size = collection.size();
        if (size == 0)
            return false;
        return __with2Argument(collection, predicate, size);
    }

    private static <T> boolean __all(final @NotNull CollectionHolder<? extends T> collection,
                                     final @NotNull BiFunction<? super T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection.isEmpty())
            return false;
        return __with2Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    private static <T> boolean __all(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                     final @NotNull Function<? super T, @NotNull Boolean> predicate) {
        final var size = collection.size();
        if (size == 0)
            return false;
        return __with1Argument(collection, predicate, size);
    }

    private static <T> boolean __all(final @NotNull CollectionHolder<? extends T> collection,
                                     final @NotNull Function<? super T, @NotNull Boolean> predicate) {
        if (collection.isEmpty())
            return false;
        return __with1Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    private static <T> boolean __all(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                     final @NotNull Supplier<@NotNull Boolean> predicate) {
        final var size = collection.size();
        if (size == 0)
            return false;
        return __with0Argument(predicate, size);
    }

    private static <T> boolean __all(final @NotNull CollectionHolder<? extends T> collection,
                                     final @NotNull Supplier<@NotNull Boolean> predicate) {
        if (collection.isEmpty())
            return false;
        return __with0Argument(predicate, collection.size());
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static boolean __with0Argument(final @NotNull Supplier<@NotNull Boolean> predicate, final int size) {
        var index = -1;
        while (++index < size)
            if (!predicate.get())
                return false;
        return true;
    }

    private static <T> boolean __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection, final @NotNull Function<? super T, @NotNull Boolean> predicate, final int size) {
        var index = -1;
        while (++index < size)
            if (!predicate.apply(collection.get(index)))
                return false;
        return true;
    }

    private static <T> boolean __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection, final @NotNull BiFunction<? super T, @NotNull Integer, @NotNull Boolean> predicate, final int size) {
        var index = -1;
        while (++index < size)
            if (!predicate.apply(collection.get(index), index))
                return false;
        return true;
    }

    //#endregion -------------------- Loop methods --------------------

}
