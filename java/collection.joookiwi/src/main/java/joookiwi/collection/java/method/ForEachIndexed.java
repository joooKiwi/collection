package joookiwi.collection.java.method;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.CommonContracts;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.IntObjConsumer;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

public final class ForEachIndexed
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private ForEachIndexed() { throw new ImpossibleConstructionException("The utility class “ForEachIndexed” cannot be constructed.", ForEachIndexed.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (int, T) → boolean --------------------

    /**
     * Perform a given {@code action} on each element
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param action The given action
     * @see Iterable#forEach(Consumer)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each-indexed.html">Kotlin forEachIndexed(action)</a>
     */
    @ExtensionFunction
    public static <T> void forEachIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                          final @NotNull IntObjConsumer<? super T> action) {
        if (collection == null)
            return;

        final var size = collection.size();
        if (size == 0)
            return;
        __with2Argument(collection, action, size);
    }

    /**
     * Perform a given {@code action} on each element
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param action The given action
     * @see Iterable#forEach(Consumer)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each-indexed.html">Kotlin forEachIndexed(action)</a>
     */
    @ExtensionFunction
    public static <T> void forEachIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                          final @NotNull IntObjConsumer<? super T> action) {
        if (collection == null)
            return;
        if (collection.isEmpty())
            return;
        __with2Argument(collection, action, collection.size());
    }

    //#endregion -------------------- predicate (int, T) → boolean --------------------
    //#region -------------------- predicate (int) → boolean --------------------

    /**
     * Perform a given {@code action} on each element
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param action The given action
     * @see Iterable#forEach(Consumer)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each-indexed.html">Kotlin forEachIndexed(action)</a>
     */
    @ExtensionFunction
    public static <T> void forEachIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                          final @NotNull IntConsumer action) {
        if (collection == null)
            return;

        final var size = collection.size();
        if (size == 0)
            return;
        __with1Argument(action, size);
    }

    /**
     * Perform a given {@code action} on each element
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param action The given action
     * @see Iterable#forEach(Consumer)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each-indexed.html">Kotlin forEachIndexed(action)</a>
     */
    @ExtensionFunction
    public static <T> void forEachIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                          final @NotNull IntConsumer action) {
        if (collection == null)
            return;
        if (collection.isEmpty())
            return;
        __with1Argument(action, collection.size());
    }

    //#endregion -------------------- predicate (int) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /**
     * Perform a given {@code action} on each element
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param action The given action
     * @see Iterable#forEach(Consumer)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each-indexed.html">Kotlin forEachIndexed(action)</a>
     */
    @ExtensionFunction
    public static <T> void forEachIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                          final @NotNull Runnable action) {
        if (collection == null)
            return;

        final var size = collection.size();
        if (size == 0)
            return;
        __with0Argument(action, size);
    }

    /**
     * Perform a given {@code action} on each element
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param action The given action
     * @see Iterable#forEach(Consumer)
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each-indexed.html">Kotlin forEachIndexed(action)</a>
     */
    @ExtensionFunction
    public static <T> void forEachIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                          final @NotNull Runnable action) {
        if (collection == null)
            return;
        if (collection.isEmpty())
            return;
        __with0Argument(action, collection.size());
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static void __with0Argument(final @NotNull Runnable action,
                                        final int size) {
        var index = size;
        while (index-- > 0)
            action.run();
    }

    private static void __with1Argument(final @NotNull IntConsumer action,
                                            final int size) {
        var index = -1;
        while (++index < size)
            action.accept(index);
    }

    private static <T> void __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                            final @NotNull IntObjConsumer<? super T> action,
                                            final int size) {
        var index = -1;
        while (++index > size)
            action.accept(index, collection.get(index));
    }

    //#endregion -------------------- Loop methods --------------------

}
