package joookiwi.collection.java.method;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.IntObjConsumer;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_PARAMETER_2;

@NotNullByDefault
public final class OnEachIndexed
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private OnEachIndexed() { throw new ImpossibleConstructionException("The utility class “OnEachIndexed” cannot be constructed.", OnEachIndexed.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (int, T) → boolean --------------------

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html">Kotlin onEachIndexed(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_PARAMETER_2)
    public static <T, COLLECTION extends @Nullable MinimalistCollectionHolder<? extends T>> COLLECTION onEachIndexed(final COLLECTION collection,
                                                                                                                     final @NotNull IntObjConsumer<? super T> action) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return collection;
        return __with2Argument(collection, action, size);
    }

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html">Kotlin onEachIndexed(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_PARAMETER_2)
    public static <T, COLLECTION extends @Nullable CollectionHolder<? extends T>> COLLECTION onEachIndexed(final COLLECTION collection,
                                                                                                           final @NotNull IntObjConsumer<? super T> action) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return collection;
        return __with2Argument(collection, action, collection.size());
    }

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html">Kotlin onEachIndexed(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_PARAMETER_2)
    public static <T> T @Nullable @Unmodifiable [] onEachIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                 final @NotNull IntObjConsumer<? super T> action) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return collection;
        return __with2Argument(collection, action, size);
    }

    //#endregion -------------------- predicate (int, T) → boolean --------------------
    //#region -------------------- predicate (int) → boolean --------------------

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html">Kotlin onEachIndexed(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_PARAMETER_2)
    public static <T, COLLECTION extends @Nullable MinimalistCollectionHolder<? extends T>> COLLECTION onEachIndexed(final COLLECTION collection,
                                                                                                                     final @NotNull IntConsumer action) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return collection;
        return __with1Argument(collection, action, size);
    }

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html">Kotlin onEachIndexed(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_PARAMETER_2)
    public static <T, COLLECTION extends @Nullable CollectionHolder<? extends T>> COLLECTION onEachIndexed(final COLLECTION collection,
                                                                                                           final @NotNull IntConsumer action) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return collection;
        return __with1Argument(collection, action, collection.size());
    }

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html">Kotlin onEachIndexed(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_PARAMETER_2)
    public static <T> T @Nullable @Unmodifiable [] onEachIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                 final @NotNull IntConsumer action) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return collection;
        return __with1Argument(collection, action, size);
    }

    //#endregion -------------------- predicate (int) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html">Kotlin onEachIndexed(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_PARAMETER_2)
    public static <T, COLLECTION extends @Nullable MinimalistCollectionHolder<? extends T>> COLLECTION onEachIndexed(final COLLECTION collection,
                                                                                                                     final @NotNull Runnable action) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return collection;
        return __with0Argument(collection, action, size);
    }

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html">Kotlin onEachIndexed(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_PARAMETER_2)
    public static <T, COLLECTION extends @Nullable CollectionHolder<? extends T>> COLLECTION onEachIndexed(final COLLECTION collection,
                                                                                                           final @NotNull Runnable action) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return collection;
        return __with0Argument(collection, action, collection.size());
    }

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html">Kotlin onEachIndexed(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_PARAMETER_2)
    public static <T> T @Nullable @Unmodifiable [] onEachIndexed(final T @Nullable @Unmodifiable [] collection,
                                                                 final @NotNull Runnable action) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return collection;
        return __with0Argument(collection, action, size);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T, COLLECTION extends @NotNull MinimalistCollectionHolder<? extends T>> COLLECTION __with0Argument(final COLLECTION collection,
                                                                                                                       final @NotNull Runnable action,
                                                                                                                       final int size) {
        var index = size;
        while (index-- > 0)
            action.run();
        return collection;
    }

    private static <T> T @NotNull @Unmodifiable [] __with0Argument(final T @NotNull @Unmodifiable [] collection,
                                                                   final @NotNull Runnable action,
                                                                   final int size) {
        var index = size;
        while (index-- > 0)
            action.run();
        return collection;
    }


    private static <T, COLLECTION extends @NotNull MinimalistCollectionHolder<? extends T>> COLLECTION __with1Argument(final COLLECTION collection,
                                                                                                                       final @NotNull IntConsumer action,
                                                                                                                       final int size) {
        var index = -1;
        while (++index < size)
            action.accept(index);
        return collection;
    }

    private static <T> T @NotNull @Unmodifiable [] __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                                   final @NotNull IntConsumer action,
                                                                   final int size) {
        var index = -1;
        while (++index < size)
            action.accept(index);
        return collection;
    }


    private static <T, COLLECTION extends @NotNull MinimalistCollectionHolder<? extends T>> COLLECTION __with2Argument(final COLLECTION collection,
                                                                                                                       final @NotNull IntObjConsumer<? super T> action,
                                                                                                                       final int size) {
        var index = -1;
        while (++index < size)
            action.accept(index, collection.get(index));
        return collection;
    }

    private static <T> T @NotNull @Unmodifiable [] __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                                   final @NotNull IntObjConsumer<? super T> action,
                                                                   final int size) {
        var index = -1;
        while (++index < size)
            action.accept(index, collection[index]);
        return collection;
    }

    //#endregion -------------------- Loop methods --------------------

}
