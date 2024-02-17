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

public final class None
        extends Utility {

    @Contract("-> fail")
    private None() { throw new ImpossibleConstructionException("The utility class \"None\" cannot be constructed.", None.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- () --------------------

    /**
     * Tell if the {@code collection} <b>is empty</b>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if null is received or {@code collection} <b>is empty</b> otherwise
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html">Kotlin none()</a>
     */
    @ExtensionFunction
    @Contract("null -> true")
    public static <T> boolean none(@Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return true;
        return collection.size() == 0;
    }

    /**
     * Tell if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if null is received or the {@code collection} {@link CollectionHolder#isEmpty is empty} otherwise
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html">Kotlin none()</a>
     */
    @ExtensionFunction
    @Contract("null -> true")
    public static <T> boolean none(@Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return true;
        return collection.isEmpty();
    }

    //#endregion -------------------- () --------------------
    //#region -------------------- predicate (T, int) → boolean --------------------

    /**
     * Check if <b>no</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param <T>        The {@code collection} type
     * @return <b>false</b> if at least one {@code predicate} is <b>true</b> on a value of the {@code collection}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html">Kotlin none(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> true")
    public static <T> boolean none(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return true;
        if (predicate == null)
            return collection.size() == 0;

        var size = collection.size();
        if (size == 0)
            return false;
        return __with2Argument(collection, predicate, size);
    }

    /**
     * Check if <b>no</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param <T>        The {@code collection} type
     * @return <b>false</b> if at least one {@code predicate} is <b>true</b> on a value of the {@code collection}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html">Kotlin none(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> true")
    public static <T> boolean none(@Nullable CollectionHolder<? extends T> collection, @Nullable BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate) {
        if (collection == null)
            return true;
        if (predicate == null)
            return collection.isEmpty();
        if (collection.isEmpty())
            return false;
        return __with2Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /**
     * Check if <b>no</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param <T>        The {@code collection} type
     * @return <b>false</b> if at least one {@code predicate} is <b>true</b> on a value of the {@code collection}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html">Kotlin none(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> true")
    public static <T> boolean none(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            return true;
        if (predicate == null)
            return collection.size() == 0;

        var size = collection.size();
        if (size == 0)
            return false;
        return __with1Argument(collection, predicate, size);
    }

    /**
     * Check if <b>no</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param <T>        The {@code collection} type
     * @return <b>false</b> if at least one {@code predicate} is <b>true</b> on a value of the {@code collection}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html">Kotlin none(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> true")
    public static <T> boolean none(@Nullable CollectionHolder<? extends T> collection, @Nullable Function<T, @NotNull Boolean> predicate) {
        if (collection == null)
            return true;
        if (predicate == null)
            return collection.isEmpty();
        if (collection.isEmpty())
            return false;
        return __with1Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /**
     * Check if <b>no</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param predicate  The given predicate
     * @param <T>        The {@code collection} type
     * @return <b>false</b> if at least one {@code predicate} is <b>true</b> on a value of the {@code collection}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html">Kotlin none(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> true")
    public static <T> boolean none(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return true;
        if (predicate == null)
            return collection.size() == 0;

        var size = collection.size();
        if (size == 0)
            return false;
        return __with0Argument(predicate, size);
    }

    /**
     * Check if <b>no</b> element in the {@code collection}
     * match the given {@code predicate}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param predicate  The given predicate
     * @param <T>        The {@code collection} type
     * @return <b>false</b> if at least one {@code predicate} is <b>true</b> on a value of the {@code collection}
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html">Kotlin none(predicate)</a>
     */
    @ExtensionFunction
    @Contract("null, _ -> true")
    public static <T> boolean none(@Nullable CollectionHolder<? extends T> collection, @Nullable Supplier<@NotNull Boolean> predicate) {
        if (collection == null)
            return true;
        if (predicate == null)
            return collection.isEmpty();
        if (collection.isEmpty())
            return false;
        return __with0Argument(predicate, collection.size());
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> boolean __with0Argument(@NotNull Supplier<@NotNull Boolean> predicate, int size) {
        var index = -1;
        while (++index < size)
            if (predicate.get())
                return false;
        return true;
    }

    private static <T> boolean __with1Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull Function<T, @NotNull Boolean> predicate, int size) {
        var index = -1;
        while (++index < size)
            if (predicate.apply(collection.get(index)))
                return false;
        return true;
    }

    private static <T> boolean __with2Argument(@NotNull MinimalistCollectionHolder<? extends T> collection, @NotNull BiFunction<T, @NotNull Integer, @NotNull Boolean> predicate, int size) {
        var index = -1;
        while (++index < size)
            if (predicate.apply(collection.get(index), index))
                return false;
        return true;
    }

    //#endregion -------------------- Loop methods --------------------

}
