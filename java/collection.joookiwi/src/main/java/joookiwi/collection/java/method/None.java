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
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_TRUE_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_TRUE_2;

public final class None
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private None() { throw new ImpossibleConstructionException("The utility class “None” cannot be constructed.", None.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Tell if the `collection` **is empty**
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @return `true` if null is received or `collection` **is empty** otherwise
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html">Kotlin none()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T> boolean none(@Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return true;
        return collection.size() == 0;
    }

    /// Tell if the `collection` [is empty][#isEmpty]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @return `true` if null is received or the `collection` [is empty][#isEmpty] otherwise
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html">Kotlin none()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T> boolean none(@Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return true;
        return collection.isEmpty();
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → boolean --------------------

    /// Check if **no** element in the `collection`
    /// match the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @return `false` if at least one `predicate` is `true` on a value of the `collection`
    /// @see java.util.stream.Stream#noneMatch(java.util.function.Predicate) Stream.noneMatch(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html">Kotlin none(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_2)
    public static <T> boolean none(@Nullable MinimalistCollectionHolder<? extends T> collection,
                                   @Nullable ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return true;
        if (predicate == null)
            return collection.size() == 0;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __with2Argument(collection, predicate, size);
    }

    /// Check if **no** element in the `collection`
    /// match the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @return `false` if at least one `predicate` is `true` on a value of the `collection`
    /// @see java.util.stream.Stream#noneMatch(java.util.function.Predicate) Stream.noneMatch(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html">Kotlin none(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_2)
    public static <T> boolean none(@Nullable CollectionHolder<? extends T> collection,
                                   @Nullable ObjIntPredicate<? super T> predicate) {
        if (collection == null)
            return true;
        if (predicate == null)
            return collection.isEmpty();
        if (collection.isEmpty())
            return false;
        return __with2Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- (T, int) → boolean --------------------
    //#region -------------------- (T) → boolean --------------------

    /// Check if **no** element in the `collection`
    /// match the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @return `false` if at least one `predicate` is `true` on a value of the `collection`
    /// @see java.util.stream.Stream#noneMatch(java.util.function.Predicate) Stream.noneMatch(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html">Kotlin none(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_2)
    public static <T> boolean none(@Nullable MinimalistCollectionHolder<? extends T> collection,
                                   @Nullable Predicate<? super T> predicate) {
        if (collection == null)
            return true;
        if (predicate == null)
            return collection.size() == 0;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __with1Argument(collection, predicate, size);
    }

    /// Check if **no** element in the `collection`
    /// match the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @return `false` if at least one `predicate` is `true` on a value of the `collection`
    /// @see java.util.stream.Stream#noneMatch(java.util.function.Predicate) Stream.noneMatch(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html">Kotlin none(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_2)
    public static <T> boolean none(@Nullable CollectionHolder<? extends T> collection,
                                   @Nullable Predicate<? super T> predicate) {
        if (collection == null)
            return true;
        if (predicate == null)
            return collection.isEmpty();
        if (collection.isEmpty())
            return false;
        return __with1Argument(collection, predicate, collection.size());
    }

    //#endregion -------------------- (T) → boolean --------------------
    //#region -------------------- () → boolean --------------------

    /// Check if **no** element in the `collection`
    /// match the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @return `false` if at least one `predicate` is `true` on a value of the `collection`
    /// @see java.util.stream.Stream#noneMatch(java.util.function.Predicate) Stream.noneMatch(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html">Kotlin none(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_2)
    public static <T> boolean none(@Nullable MinimalistCollectionHolder<? extends T> collection,
                                   @Nullable BooleanSupplier predicate) {
        if (collection == null)
            return true;
        if (predicate == null)
            return collection.size() == 0;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __with0Argument(predicate, size);
    }

    /// Check if **no** element in the `collection`
    /// match the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @return `false` if at least one `predicate` is `true` on a value of the `collection`
    /// @see java.util.stream.Stream#noneMatch(java.util.function.Predicate) Stream.noneMatch(predicate)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html">Kotlin none(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_2)
    public static <T> boolean none(@Nullable CollectionHolder<? extends T> collection,
                                   @Nullable BooleanSupplier predicate) {
        if (collection == null)
            return true;
        if (predicate == null)
            return collection.isEmpty();
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
                return false;
        return true;
    }

    private static <T> boolean __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                               final @NotNull Predicate<? super T> predicate,
                                               final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.test(collection.get(index)))
                return false;
        return true;
    }

    private static <T> boolean __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                               final @NotNull ObjIntPredicate<? super T> predicate,
                                               final int size) {
        var index = -1;
        while (++index < size)
            if (predicate.test(collection.get(index), index))
                return false;
        return true;
    }

    //#endregion -------------------- Loop methods --------------------

}
