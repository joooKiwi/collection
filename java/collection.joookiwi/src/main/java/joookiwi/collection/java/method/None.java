package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public final class None
        extends Utility {

    @Contract("-> fail")
    private None() { throw new ImpossibleConstructionException("The utility class \"None\" cannot be constructed.", None.class); }

    //#region -------------------- Facade methods --------------------

    /**
     * Tell if the {@code collection} {@link CollectionHolder#isEmpty is empty}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param <T>        The {@code collection} type
     * @return <b>true</b> if null is received or {@link CollectionHolder#isNotEmpty} otherwise
     * @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html">Kotlin none()</a>
     */
    @ExtensionFunction
    @Contract("null -> true")
    public static <T> boolean none(@Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return true;
        return collection.isEmpty();
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

        var size = collection.size();
        var index = -1;
        while (++index < size)
            if (predicate.apply(collection.get(index), index))
                return false;
        return true;
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

        var size = collection.size();
        var index = -1;
        while (++index < size)
            if (predicate.apply(collection.get(index)))
                return false;
        return true;
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
            return collection.isNotEmpty();
        if (collection.isEmpty())
            return false;

        var size = collection.size();
        var index = -1;
        while (++index < size)
            if (predicate.get())
                return false;
        return true;
    }

    //#endregion -------------------- Facade methods --------------------

}
